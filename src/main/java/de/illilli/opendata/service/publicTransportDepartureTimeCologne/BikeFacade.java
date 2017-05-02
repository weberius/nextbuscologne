package de.illilli.opendata.service.publicTransportDepartureTimeCologne;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.Facade;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.askfor.AskForFeetrouting;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.askfor.AskForKvbBike;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.Feetrouting;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.KvbBike;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.NextBike;

public class BikeFacade implements Facade {

	private NextBike data = new NextBike();

	public BikeFacade(int id, String fromTo) throws IOException {

		// 1. Askfor kvbabfahrtsmonitor
		AskFor<KvbBike> askForDeparture = new AskForKvbBike(id);
		// 2. Askfor feetandbikerouting
		AskFor<Feetrouting> askForFeetrouting = new AskForFeetrouting(fromTo);

		KvbBike bike = askForDeparture.getData();
		data.setUid(bike.getUid());
		data.setBike(bike.getBike());
		data.setLat(bike.getLat());
		data.setLng(bike.getLng());
		data.setName(bike.getName());
		data.setNumber(bike.getNumber());
		data.setTimestamp(bike.getTimestamp());
		data.setTimeInMinutes(askForFeetrouting.getData().getTimeInMinutes());
		data.setDistanceInMeter(askForFeetrouting.getData().getDistanceInMeter());
	}

	public BikeFacade(int id) throws IOException {

		// 1. Askfor kvbabfahrtsmonitor
		AskFor<KvbBike> askForDeparture = new AskForKvbBike(id);
		KvbBike bike = askForDeparture.getData();
		data.setUid(bike.getUid());
		data.setBike(bike.getBike());
		data.setLat(bike.getLat());
		data.setLng(bike.getLng());
		data.setName(bike.getName());
		data.setNumber(bike.getNumber());
		data.setTimestamp(bike.getTimestamp());

	}

	@Override
	public String getJson() throws JsonProcessingException {
		return new Gson().toJson(this.data);
	}

}

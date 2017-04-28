package de.illilli.opendata.service.publicTransportDepartureTimeCologne;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.Facade;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.askfor.AskForFeetrouting;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.askfor.AskForKvbabfahrtsmonitor;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.Departure;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.Feetrouting;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.Kvbabfahrt;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.Timetable;

public class DepartureFacade implements Facade {

	Departure data = new Departure();
	List<Timetable> timetableList = new ArrayList<Timetable>();

	public DepartureFacade(int id, String fromTo) throws IOException, ParseException {

		// 1. Askfor kvbabfahrtsmonitor
		AskFor<List<Kvbabfahrt>> askForDeparture = new AskForKvbabfahrtsmonitor(id);
		// 2. Askfor feetandbikerouting
		AskFor<Feetrouting> askForFeetrouting = new AskForFeetrouting(fromTo);
		for (Kvbabfahrt abfahrt : askForDeparture.getData()) {
			Timetable timetable = new Timetable();
			timetable.setDestination(abfahrt.getDestination());
			timetable.setRoute(abfahrt.getRoute());
			timetable.setTime(abfahrt.getTime());
			timetable.setLeave(abfahrt.getTime() - askForFeetrouting.getData().getTimeInMinutes());
			this.timetableList.add(timetable);
		}
		this.data.setTimetableList(this.timetableList);
		this.data.setDistanceToDestination(askForFeetrouting.getData().getDistanceInMeter());
		this.data.setTimeToDestination(askForFeetrouting.getData().getTimeInMinutes());
	}

	public DepartureFacade(int id) throws IOException {

		// 1. Askfor kvbabfahrtsmonitor
		AskFor<List<Kvbabfahrt>> askForDeparture = new AskForKvbabfahrtsmonitor(id);
		for (Kvbabfahrt abfahrt : askForDeparture.getData()) {
			Timetable timetable = new Timetable();
			timetable.setDestination(abfahrt.getDestination());
			timetable.setRoute(abfahrt.getRoute());
			timetable.setTime(abfahrt.getTime());
			this.timetableList.add(timetable);
		}
		this.data.setTimetableList(this.timetableList);
	}

	@Override
	public String getJson() throws JsonProcessingException {
		return new Gson().toJson(this.data);
	}

}

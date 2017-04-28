package de.illilli.opendata.service.publicTransportDepartureTimeCologne.model;

import java.util.ArrayList;
import java.util.List;

public class DepartureWithData extends Departure {

	private List<Timetable> data = new ArrayList<>();

	public DepartureWithData(Departure departure) {
		super.setDistanceToDestination(departure.getDistanceToDestination());
		super.setTimeToDestination(departure.getTimeToDestination());
		data = departure.getTimetableList();
	}

	public List<Timetable> getData() {
		return data;
	}

	@Override
	public int getTimeToDestination() {
		return super.getTimeToDestination();
	}

	@Override
	public int getDistanceToDestination() {
		return super.getDistanceToDestination();
	}

}

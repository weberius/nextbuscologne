package de.illilli.opendata.service.publicTransportDepartureTimeCologne.model;

import java.util.List;

public class Departure {

	private int distanceToDestination;
	private int timeToDestination;
	private List<Timetable> timetableList;

	public int getDistanceToDestination() {
		return distanceToDestination;
	}

	public void setDistanceToDestination(int distanceToDestination) {
		this.distanceToDestination = distanceToDestination;
	}

	public int getTimeToDestination() {
		return timeToDestination;
	}

	public void setTimeToDestination(int timeToDestination) {
		this.timeToDestination = timeToDestination;
	}

	public List<Timetable> getTimetableList() {
		return timetableList;
	}

	public void setTimetableList(List<Timetable> timetableList) {
		this.timetableList = timetableList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + distanceToDestination;
		result = prime * result + timeToDestination;
		result = prime * result + ((timetableList == null) ? 0 : timetableList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departure other = (Departure) obj;
		if (distanceToDestination != other.distanceToDestination)
			return false;
		if (timeToDestination != other.timeToDestination)
			return false;
		if (timetableList == null) {
			if (other.timetableList != null)
				return false;
		} else if (!timetableList.equals(other.timetableList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departure [distanceToDestination=" + distanceToDestination + ", timeToDestination=" + timeToDestination
				+ ", timetableList=" + timetableList + "]";
	}

}

package de.illilli.opendata.service.publicTransportDepartureTimeCologne.model;

import java.text.DateFormat;
import java.util.List;

public class Departure {

	private int distanceToDestination;
	private int timeToDestination;
	private List<Timetable> data;
	private String lastcall = DateFormat.getInstance().format(System.currentTimeMillis());

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

	public List<Timetable> getData() {
		return data;
	}

	public void setData(List<Timetable> timetableList) {
		this.data = timetableList;
	}

	public String getLastcall() {
		return DateFormat.getInstance().format(this.lastcall);
	}

	public void setLastcall(String lastcall) {
		this.lastcall = lastcall;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + distanceToDestination;
		result = prime * result + ((lastcall == null) ? 0 : lastcall.hashCode());
		result = prime * result + timeToDestination;
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
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (distanceToDestination != other.distanceToDestination)
			return false;
		if (lastcall == null) {
			if (other.lastcall != null)
				return false;
		} else if (!lastcall.equals(other.lastcall))
			return false;
		if (timeToDestination != other.timeToDestination)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departure [distanceToDestination=" + distanceToDestination + ", timeToDestination=" + timeToDestination
				+ ", data=" + data + ", lastcall=" + lastcall + "]";
	}

}

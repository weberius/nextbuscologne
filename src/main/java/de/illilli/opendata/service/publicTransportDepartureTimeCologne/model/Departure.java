package de.illilli.opendata.service.publicTransportDepartureTimeCologne.model;

import java.util.List;

public class Departure {

	private int distanceToDestination;
	private int timeToDestination;
	private List<Timetable> data;
	private long lastcall = System.currentTimeMillis();

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

	public long getLastcall() {
		return lastcall;
	}

	public void setLastcall(long lastcall) {
		this.lastcall = lastcall;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + distanceToDestination;
		result = prime * result + (int) (lastcall ^ (lastcall >>> 32));
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
		if (lastcall != other.lastcall)
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

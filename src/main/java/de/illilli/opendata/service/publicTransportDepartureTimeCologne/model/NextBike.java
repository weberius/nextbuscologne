package de.illilli.opendata.service.publicTransportDepartureTimeCologne.model;

/**
 * NextBike ist die fachliche Klasse, die sowohl Informationen zum Fahrrad als
 * solche bereit hält, als auch Informationen über z.b. die Entfernung.
 */
public class NextBike extends KvbBike {

	private int timeInMinutes;
	private int distanceInMeter;

	public int getTimeInMinutes() {
		return timeInMinutes;
	}

	public void setTimeInMinutes(int leave) {
		this.timeInMinutes = leave;
	}

	public int getDistanceInMeter() {
		return distanceInMeter;
	}

	public void setDistanceInMeter(int distanceInMeter) {
		this.distanceInMeter = distanceInMeter;
	}

	@Override
	public String toString() {
		return "NextBike [timeInMinutes=" + timeInMinutes + ", distanceInMeter=" + distanceInMeter + ", getUid()="
				+ getUid() + ", getName()=" + getName() + ", getBike()=" + getBike() + ", getNumber()=" + getNumber()
				+ ", getLat()=" + getLat() + ", getLng()=" + getLng() + ", getTimestamp()=" + getTimestamp() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + distanceInMeter;
		result = prime * result + timeInMinutes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		NextBike other = (NextBike) obj;
		if (distanceInMeter != other.distanceInMeter)
			return false;
		if (timeInMinutes != other.timeInMinutes)
			return false;
		return true;
	}

}

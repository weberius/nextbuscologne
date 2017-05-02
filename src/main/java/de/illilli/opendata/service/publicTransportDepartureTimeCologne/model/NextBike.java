package de.illilli.opendata.service.publicTransportDepartureTimeCologne.model;

/**
 * NextBike ist die fachliche Klasse, die sowohl Informationen zum Fahrrad als
 * solche bereit hält, als auch Informationen über z.b. die Entfernung.
 */
public class NextBike extends KvbBike {

	private int timeToDestination;
	private int distanceToDestination;

	public int getTimeToDestination() {
		return timeToDestination;
	}

	public void setTimeToDestination(int leave) {
		this.timeToDestination = leave;
	}

	public int getDistanceToDestination() {
		return distanceToDestination;
	}

	public void setDistanceToDestination(int distanceInMeter) {
		this.distanceToDestination = distanceInMeter;
	}

	@Override
	public String toString() {
		return "NextBike [timeToDestination=" + timeToDestination + ", distanceToDestination=" + distanceToDestination
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + distanceToDestination;
		result = prime * result + timeToDestination;
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
		if (distanceToDestination != other.distanceToDestination)
			return false;
		if (timeToDestination != other.timeToDestination)
			return false;
		return true;
	}

}

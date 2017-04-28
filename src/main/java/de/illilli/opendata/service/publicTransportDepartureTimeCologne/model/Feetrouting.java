package de.illilli.opendata.service.publicTransportDepartureTimeCologne.model;

/**
 * <pre>
 * {
 * 	"distance":608.1044142828172,
 *   "distanceInMeter":"608",
 *   "time":437825,
 *   "timeInMinutes":"8"
 * }
 * </pre>
 * 
 * @author wolfram
 *
 */
public class Feetrouting {

	private double distance;
	private int distanceInMeter;
	private long time;
	private int timeInMinutes;

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getDistanceInMeter() {
		return distanceInMeter;
	}

	public void setDistanceInMeter(int distanceInMeter) {
		this.distanceInMeter = distanceInMeter;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int getTimeInMinutes() {
		return timeInMinutes;
	}

	public void setTimeInMinutes(int timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(distance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + distanceInMeter;
		result = prime * result + (int) (time ^ (time >>> 32));
		result = prime * result + timeInMinutes;
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
		Feetrouting other = (Feetrouting) obj;
		if (Double.doubleToLongBits(distance) != Double.doubleToLongBits(other.distance))
			return false;
		if (distanceInMeter != other.distanceInMeter)
			return false;
		if (time != other.time)
			return false;
		if (timeInMinutes != other.timeInMinutes)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Feetrouting [distance=" + distance + ", distanceInMeter=" + distanceInMeter + ", time=" + time
				+ ", timeInMinutes=" + timeInMinutes + "]";
	}

}

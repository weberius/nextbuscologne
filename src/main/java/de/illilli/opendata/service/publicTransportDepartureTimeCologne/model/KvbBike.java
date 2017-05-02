package de.illilli.opendata.service.publicTransportDepartureTimeCologne.model;

/**
 * <p>
 * KvbBike ist die Klasse, die einem Fahrrad Objekt von
 * "/kvbradlive/service/bike/" entspricht.
 * </p>
 * 
 * <pre>
 * {
 *   "uid":3139123,
 *   "name":"BIKE 22336",
 *   "bike":1,
 *   "number":22336,
 *   "lat":50.98335687,
 *   "lng":7.039439967,
 *   "timestamp":"May 1, 2017 6:17:31 AM"
 * }
 * </pre>
 * 
 * @author wolfram
 *
 */
public class KvbBike {

	private int uid;
	private String name;
	private int bike;
	private int number;
	private double lat;
	private double lng;
	private String timestamp;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBike() {
		return bike;
	}

	public void setBike(int bike) {
		this.bike = bike;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "KvbBike [uid=" + uid + ", name=" + name + ", bike=" + bike + ", number=" + number + ", lat=" + lat
				+ ", lng=" + lng + ", timestamp=" + timestamp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bike;
		long temp;
		temp = Double.doubleToLongBits(lat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lng);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + uid;
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
		KvbBike other = (KvbBike) obj;
		if (bike != other.bike)
			return false;
		if (Double.doubleToLongBits(lat) != Double.doubleToLongBits(other.lat))
			return false;
		if (Double.doubleToLongBits(lng) != Double.doubleToLongBits(other.lng))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}

}

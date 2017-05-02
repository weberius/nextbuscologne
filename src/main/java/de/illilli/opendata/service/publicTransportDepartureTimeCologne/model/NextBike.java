package de.illilli.opendata.service.publicTransportDepartureTimeCologne.model;

/**
 * NextBike ist die fachliche Klasse, die sowohl Informationen zum Fahrrad als
 * solche bereit hält, als auch Informationen über z.b. die Entfernung.
 */
public class NextBike extends KvbBike {

	private int leave;

	public int getLeave() {
		return leave;
	}

	public void setLeave(int leave) {
		this.leave = leave;
	}

	@Override
	public String toString() {
		return "NextBike [leave=" + leave + ", getUid()=" + getUid() + ", getName()=" + getName() + ", getBike()="
				+ getBike() + ", getNumber()=" + getNumber() + ", getLat()=" + getLat() + ", getLng()=" + getLng()
				+ ", getTimestamp()=" + getTimestamp() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + leave;
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
		if (leave != other.leave)
			return false;
		return true;
	}

}

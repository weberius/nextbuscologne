package de.illilli.opendata.service.publicTransportDepartureTimeCologne.model;

public class Kvbabfahrt {

	private String route;
	private String destination;
	private int time;

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Kvbabfahrt [route=" + route + ", destination=" + destination + ", time=" + time + "]";
	}

}

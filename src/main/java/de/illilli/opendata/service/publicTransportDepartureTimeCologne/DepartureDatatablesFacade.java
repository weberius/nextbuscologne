package de.illilli.opendata.service.publicTransportDepartureTimeCologne;

import java.io.IOException;
import java.text.ParseException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

import de.illilli.opendata.service.Facade;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.DepartureWithData;

/**
 * Diese Facade liefert die Daten wie die DepartureFacade zurück. Es wird
 * lediglich das json insoweit erweitert, dass die json Bibliothek
 * <a href="https://datatables.net/">Datatables</a> verwendet werden kann.
 */
public class DepartureDatatablesFacade extends DepartureFacade implements Facade {

	DepartureWithData data;

	public DepartureDatatablesFacade(int id, String fromTo) throws IOException, ParseException {
		super(id, fromTo);
		this.data = new DepartureWithData(super.data);
	}

	public DepartureDatatablesFacade(int id) throws IOException, ParseException {
		super(id);
		this.data = new DepartureWithData(super.data);
	}

	@Override
	public String getJson() throws JsonProcessingException {
		String json = new Gson().toJson(this.data);
		return json;
	}

}

package de.illilli.opendata.service.publicTransportDepartureTimeCologne.askfor;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.Config;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.Kvbabfahrt;

/**
 * Diese Klasse fragt die Schnittstelle
 * https://tom.cologne.codefor.de/kvbabfahrtsmonitor/service/stop/
 */
public class AskForKvbabfahrtsmonitor implements AskFor<List<Kvbabfahrt>> {

	private List<Kvbabfahrt> data = new ArrayList<Kvbabfahrt>();

	/**
	 * Die Url ist in der config.properties definiert. Es wird die entsprechende
	 * Haltestellen-id angehängt.
	 * 
	 * @param id
	 *            die Haltestellen id; z.B. 2 für Köln, Neumarkt
	 * @throws IOException
	 */
	public AskForKvbabfahrtsmonitor(int id) throws IOException {
		this(new URL(Config.getProperty("kvbabfahrtsmonitor.url") + id));
	}

	/**
	 * Die url muss hier bereits fertig sein.
	 * 
	 * @param url
	 *            die fertige url
	 * @throws IOException
	 */
	public AskForKvbabfahrtsmonitor(URL url) throws IOException {
		Gson gson = new Gson();
		Type type = new TypeToken<List<Kvbabfahrt>>() {
		}.getType();
		InputStream inputStream = url.openStream();
		String json = IOUtils.toString(inputStream);
		this.data = gson.fromJson(json, type);
	}

	@Override
	public List<Kvbabfahrt> getData() {
		return this.data;
	}

}

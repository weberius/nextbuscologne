package de.illilli.opendata.service.publicTransportDepartureTimeCologne.askfor;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import com.google.gson.Gson;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.Config;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.Feetrouting;

public class AskForFeetrouting implements AskFor<Feetrouting> {

	String url = Config.getProperty("feetandbikerouting.url");
	private Feetrouting data = new Feetrouting();

	public AskForFeetrouting(String fromTo) throws IOException {
		this(new URL(Config.getProperty("feetandbikerouting.url") + fromTo));
	}

	public AskForFeetrouting(URL url) throws IOException {
		InputStream inputStream = url.openStream();
		Reader reader = new InputStreamReader(inputStream, Config.getProperty("encoding"));
		this.data = new Gson().fromJson(reader, data.getClass());
	}

	@Override
	public Feetrouting getData() {
		return data;
	}

}

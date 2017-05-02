package de.illilli.opendata.service.publicTransportDepartureTimeCologne.askfor;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.Config;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.KvbBike;

public class AskForKvbBike implements AskFor<KvbBike> {

	private KvbBike data = new KvbBike();

	public AskForKvbBike(int id) throws IOException {
		this(new URL(Config.getProperty("kvbabradlive.bike.url") + id));
	}

	public AskForKvbBike(URL url) throws IOException {
		Gson gson = new Gson();
		Type type = new TypeToken<List<KvbBike>>() {
		}.getType();
		InputStream inputStream = url.openStream();
		String json = IOUtils.toString(inputStream);
		List<KvbBike> kvbBikeList = gson.fromJson(json, type);
		this.data = kvbBikeList.get(kvbBikeList.size() - 1);
	}

	@Override
	public KvbBike getData() {
		return this.data;
	}

}

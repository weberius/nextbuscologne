package de.illilli.opendata.service.publicTransportDepartureTimeCologne.askfor;

import java.io.IOException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.KvbBike;

/**
 * <p>
 * Integrationstest
 * </p>
 * <p>
 * TODO: Integrationstestumgebung einrichten
 * </p>
 */
public class AskForKvbBikeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	@Ignore
	public void test() throws IOException {
		AskFor<KvbBike> askFor = new AskForKvbBike(22336);
		KvbBike bike = askFor.getData();
		System.out.println(bike.toString());
	}

}

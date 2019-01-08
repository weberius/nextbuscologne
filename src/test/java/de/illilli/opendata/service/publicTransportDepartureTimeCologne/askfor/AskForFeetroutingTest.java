package de.illilli.opendata.service.publicTransportDepartureTimeCologne.askfor;

import java.io.IOException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.publicTransportDepartureTimeCologne.model.Feetrouting;

/**
 * <p>
 * Integrationstest
 * </p>
 * <p>
 * TODO: Integrationstestumgebung einrichten
 * </p>
 */

@Ignore
public class AskForFeetroutingTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws IOException {
		String fromTo = "50.940214,6.953710,50.940356,6.961413";
		AskFor<Feetrouting> askfor = new AskForFeetrouting(fromTo);
		System.out.println(askfor.getData().toString());
	}

}

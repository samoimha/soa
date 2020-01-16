package ro.transilvania.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ro.transilvania.service.TreceAbonamentPeCartelaService;

public class TreceAbonamentPeCartelaServiceTest {

	@Test
	public void treceAbonamentPeCartela() {
		assertEquals("Am trecut abonamentul pe cartela.", TreceAbonamentPeCartelaService.treceAbonamentPeCartela());
	}
}
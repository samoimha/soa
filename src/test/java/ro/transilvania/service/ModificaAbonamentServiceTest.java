package ro.transilvania.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ro.transilvania.service.ModificaAbonamentService;

public class ModificaAbonamentServiceTest {

	@Test
	public void adaugaMinuteTest() {
		assertEquals("Am adougat 100 la abonament.", ModificaAbonamentService.adaugaMinute(100)); 
	}
}
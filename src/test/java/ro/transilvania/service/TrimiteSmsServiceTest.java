package ro.transilvania.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ro.transilvania.service.TrimiteSmsService;

public class TrimiteSmsServiceTest {

	@Test
	public void TrimiteSms() {
		assertEquals("Am trimis SMS clientului cu mesajul: "
	+"'Cerera dumneavoastra a fost rezolvata. De astazi va bucurati de noiile avantaje.'",
	TrimiteSmsService.TrimiteSms());
	}
}
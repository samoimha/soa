package ro.transilvania;

import ro.transilvania.service.ModificaAbonamentService;
import ro.transilvania.service.TrimiteSmsService;

public class ProcesDeAdaugareMinute {

	public static void main(String args[]) {
		System.out.println(ModificaAbonamentService.adaugaMinute(100));
		System.out.println(TrimiteSmsService.TrimiteSms());
	}
}
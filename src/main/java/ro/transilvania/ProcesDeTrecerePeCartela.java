package ro.transilvania;

import ro.transilvania.service.TreceAbonamentPeCartelaService;
import ro.transilvania.service.TrimiteSmsService;

public class ProcesDeTrecerePeCartela {

	public static void main(String args[]) {
		System.out.println(TreceAbonamentPeCartelaService.treceAbonamentPeCartela());
		System.out.println(TrimiteSmsService.TrimiteSms());
	}
	
}

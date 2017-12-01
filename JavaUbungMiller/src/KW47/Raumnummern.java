package KW47;

public class Raumnummern {

	public static void main(String[] args) {
		Raum mathe1vl = new Raum(2, 1, 2);
		Raum prog1pr = new Raum(18, 1, 18);
		Raum dbpr = new Raum(18, 1, 2);

		System.out.println(prog1pr);

		Raum[] raueme = { mathe1vl, prog1pr, dbpr };
		Raum rechenzentrum = new Raum(18, 1, 20);
		for (Raum raum : raueme) {
			if (Raum.isNearTo(raum, rechenzentrum)) {
				System.out.printf("%s ist in der Nähe des Rechenzentrums!\n", raum);
			}
		}
	}
}

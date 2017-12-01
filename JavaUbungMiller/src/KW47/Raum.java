package KW47;

public class Raum {
	int gebauedeNummer;
	int etage;
	int raumNummer;

	public Raum(int gebauedeNummer, int etage, int raumNummer) {
		this.gebauedeNummer = gebauedeNummer;
		this.etage = etage;
		this.raumNummer = raumNummer;
	}

	public String toString() {
		return this.gebauedeNummer + "-" + this.etage + "." + this.raumNummer;
	}

	public static boolean isNearTo(Raum r1, Raum r2) {
		if (r1.gebauedeNummer == r2.gebauedeNummer && r1.etage == r2.etage) {
			return true;
		}
		return false;
	}
}

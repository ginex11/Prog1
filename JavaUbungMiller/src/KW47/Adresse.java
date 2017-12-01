package KW47;

/**
 * 
 * @author Miller
 *
 */
public class Adresse {
	String vName;
	String nName;
	String strasse;
	int hausNummer;
	char zusatz;
	int plz;
	String stadt;
	String land;

	/**
	 * Konstruktor.
	 * 
	 * @param vName
	 *            Vorname der Person.
	 * @param nName
	 *            Nachname der Person.
	 * @param strasse
	 *            Straße der Person.
	 * @param hausNummer
	 *            Hausnummer der Person.
	 * @param zusatz
	 *            Zusatz der Hausnummer.
	 * @param plz
	 *            Postleitzahl der Stadt.
	 * @param stadt
	 *            Name der Stadt.
	 * @param land
	 *            Das Land.
	 */
	public Adresse(String vName, String nName, String strasse, int hausNummer, char zusatz, int plz, String stadt,
			String land) {
		this.vName = vName;
		this.nName = nName;
		this.strasse = strasse;
		this.hausNummer = hausNummer;
		this.zusatz = zusatz;
		this.plz = plz;
		this.stadt = stadt;
		this.land = land;
	}

	/**
	 * noch ein Konstruktor.
	 * 
	 * @param vName
	 *            Vorname der Person.
	 * @param nName
	 *            Nachname der Person.
	 * @param strasse
	 *            Straße der Person.
	 * @param hausNummer
	 *            Hausnummer der Person.
	 * @param zusatz
	 *            Zusatz der Hausnummer (falls es kein Zusatz gibt).
	 * @param plz
	 *            Postleitzahl der Stadt.
	 * @param stadt
	 *            Name der Stadt.
	 * @param land
	 *            Das Land.
	 */
	public Adresse(String vName, String nName, String strasse, int hausNummer, int plz, String stadt, String land) {
		this.vName = vName;
		this.nName = nName;
		this.strasse = strasse;
		this.hausNummer = hausNummer;
		this.zusatz = ' ';
		this.plz = plz;
		this.stadt = stadt;
		this.land = land;
	}

	/**
	 * Gibt die Adresse auf der Console aus.
	 */
	public String toString() {
		return this.vName + " " + this.nName + "\n" + this.strasse + " " + this.hausNummer + this.zusatz + "\n"
				+ this.plz + " " + this.stadt + " " + this.land;
	}

	/**
	 * Erstellt eine Kopie einer Adresse als neue Adresse.
	 */
	public Adresse clone() {
		return new Adresse(this.vName, this.nName, this.strasse, this.hausNummer, this.zusatz, this.plz, this.stadt,
				this.land);
	}

	/**
	 * Vergleicht zwei Adressen miteinander
	 * 
	 * @param adr
	 *            Adresse mit der, die andere Adresse abgeglichen werden soll.
	 * @return Liefert true wenn die Adressen gleich sind,sonst false.
	 */
	public boolean equals(Adresse adr) {
		return (this.vName == adr.vName && this.nName == adr.nName && this.strasse == adr.strasse
				&& this.hausNummer == adr.hausNummer && this.zusatz == adr.zusatz && this.plz == adr.plz
				&& this.stadt == adr.stadt && this.land == adr.land);
	}

}

package KW48;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Miller
 *
 */
public class PrimzahlenGenerieren {
	/**
	 * Hauptprogramm
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(prettyPrint(prims(1000), 7));
	}

	/**
	 * Die Methode gibt die Primmzahlen mit bestimmter Länge der Reihe auf der
	 * Konsole aus.
	 * 
	 * @param is
	 *            Liste mit Primzahlen.
	 * @param cols
	 *            Integer mit der Angabe der Länge einer Reihe.
	 * @return String der die Primzahlen auf der Konsole ausgiebt.
	 */
	private static String prettyPrint(List<Integer> is, int cols) {
		String e = "";
		int count = 0;
		if (cols <= 0) {
			return "Error 404";
		}
		for (int i = 0; i < is.size(); i++) {
			if (count == cols) {
				e += "\n";
				count = 0;
			}
			e += is.get(i) + " ";
			if (String.valueOf(is.get(i)).length() == 1) {
				e += "  ";
			}
			if (String.valueOf(is.get(i)).length() == 2) {
				e += " ";
			}
		
			count++;
		}
		return e;
	}

	/**
	 * Die Methode generiert Primzahlen bis Stelle n.
	 * 
	 * @param n
	 *            bis wohin die Primzahlen generiert werden.
	 * @return Liste mit allen generierten Primzahlen.
	 */
	private static List<Integer> prims(int n) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (isPrim(i) == true) {
				list.add(i);
			}
		}
		return list;
	}

	/**
	 * Die Methode prueft ob eine Zahl, eine Primzahl ist.
	 * 
	 * @param n
	 *            Die Zahl die geprueft werden soll.
	 * @return Gibt true oder false zurueck.
	 */
	private static boolean isPrim(int n) {
		boolean prim = false;
		prim = true;
		for (int j = 2; j < n; j++) {
			if (n % j == 0) {
				prim = false;
				break;
			}
		}
		return prim;
	}
}

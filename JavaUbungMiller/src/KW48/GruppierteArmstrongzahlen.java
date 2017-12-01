package KW48;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Miller
 *
 */
public class GruppierteArmstrongzahlen {
	/**
	 * Hauptprogramm
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 1000000;
		System.out.println("Alle Armstrong-Zahlen bis " + n + ": ");
		List<Integer> lance = armstrongs(n);
		Map<Integer, List<Integer>> grouped = groupByLength(lance);
		String pretty = prettyPrint(grouped);
		System.out.println(pretty);
	}

	/**
	 * Die Methode sortiert die Zahlen nach der Länge der Zahlen aus.
	 * 
	 * @param lance
	 *            Liste mit Amstrongzahlen.
	 * @return Aussortierte Map mit Amstrongzahlen.
	 */
	private static Map<Integer, List<Integer>> groupByLength(List<Integer> lance) {
		Map<Integer, List<Integer>> num = new HashMap<Integer, List<Integer>>();
		int var = 1, count = 0, temp = 0, tem = 0;
		for (int i = 0; i < lance.size(); i++) {
			temp = String.valueOf(lance.get(i)).length();
			if (var < temp) {
				num.put(var, lance.subList(i - count, i));
				var = String.valueOf(lance.get(i)).length();
				var = temp;
				temp = 0;
				count = 0;
				tem = i;
			}
			count++;
		}
		num.put(var, lance.subList(tem, lance.size()));
		return num;
	}

	/**
	 * Die Methode gibt die aussortierten Zahlen auf der konsole aus.
	 * 
	 * @param grouped
	 *            Map-Liste mit sortierten Zahlen, die zu einem String gesetzt wird.
	 * @return String,der auf der Konsole erscheint.
	 */
	private static String prettyPrint(Map<Integer, List<Integer>> grouped) {
		String e = "";
		for (int i = 0; i <= grouped.size() + 1; i++) {
			if (grouped.get(i) != null) {
				e += i + " => " + grouped.get(i) + "\n";
			}
		}
		return e;
	}

	/**
	 * Die Methode bestimmt Amstrongzahlen bis n-ter Stelle.
	 * 
	 * @param n
	 *            Die Stelle, bis wo die Amstrongzahlen bestimmt werden.
	 * @return Liefert eine Liste mit Amstrongzahlen.
	 */
	private static List<Integer> armstrongs(int n) {
		List<Integer> list = new ArrayList<Integer>();
		int e = 0;
		String s = "";
		for (int i = 0; i < n; i++) {
			int potenz = String.valueOf(i).length();
			for (int j = 0; j < potenz; j++) {
				s = String.valueOf(i);
				String[] arr = s.split("");
				e += Math.pow(Integer.parseInt(arr[j]), potenz);
			}
			if (e == i) {
				list.add(e);
			}
			e = 0;
		}
		return list;
	}
}

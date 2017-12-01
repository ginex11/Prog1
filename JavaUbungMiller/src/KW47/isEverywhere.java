package KW47;

/**
 * 
 * @author Miller
 *
 */
public class isEverywhere {
	/**
	 * Hauptprogramm.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isEveryWhere(new int[] { 1, 2, 1, 3 }, 1));
		System.out.println(isEveryWhere(new int[] { 1, 2, 1, 3 }, 2));
		System.out.println(isEveryWhere(new int[] { 1, 2, 1, 3, 4 }, 1));
	}

	/**
	 * Die Methode prueft für einen gegebenen Wert, ob dieser überall in einem
	 * Arrays ist. Überall ist dabei wie folgt definiert: Ein Wert ist überall,
	 * wenn für alle benachbarten Elemente eines Arrays mindestens ein Element
	 * dieser Paare diesen Wert hat.
	 * 
	 * @param arr
	 *            Array was durchsucht wird.
	 * @param i
	 *            Wert nach dem Array durchsucht wird.
	 * @return liefert true oder false zurueck.
	 */
	private static boolean isEveryWhere(int arr[], int i) {
		if (arr.length == 0) {
			return false;
		}
		boolean bool = false;
		if (arr[0] == i) {
			for (int k = 0; k < arr.length; k += 2) {
				if (arr[k] == i) {
					bool = true;
				} else {
					return false;
				}
			}
		} else {
			for (int k = 1; k < arr.length; k += 2) {
				if (arr[k] == i) {
					bool = true;
				} else {
					return false;
				}
			}
		}
		return bool;
	}
}

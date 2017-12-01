package KW47;

/**
 * 
 * @author Miller 
 * 		   Zwei Methoden int maxRow(int[][] data) und int maxCol(int[]
 *         row) bestimmen in beliebigen zweidimensionalen Arrays
 *         den Index der Zeile, sowie die Spalte .
 */
public class whereIsTheMax {
	/**
	 * Hauptprogramm.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] data = { { },{ 1, 222, 3, 4 }, {}, { -1, 5, 100, 1 }, { 0, 222, 5, 6, 7, 8, 9 } };
		int row = maxRow(data);
		int col = row == -1 ? -1 : maxCol(data[row]);
		System.out.println("Zeile und Spalte mit dem Maximumwert sind: (" + row + ", " + col + ")");
	}

	/**
	 * Die Methode bestimmt Index der Reihe des zweidimensionalen Arrays.
	 * 
	 * @param data
	 *            Zweidimensionaler Array.
	 * @return gibt Index der Zeile zurueck.
	 */
	private static int maxRow(int[][] data) {
		int var = 0;
		int index = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] > var) {
					var = data[i][j];
					index = i;
				}
			}
		}
		return index;
	}

	/**
	 * Die Methode bestimmt Index der Spalte des zweidimensionalen Arrays.
	 * 
	 * @param row
	 *           Das Array, das das Maximum enthaltet.
	 * @return gibt Index der Spalte zurueck.
	 */
	private static int maxCol(int[] row) {
		int var = 0;
		int index = 0;
		for (int j = 0; j < row.length; j++) {
			if (row[j] > var) {
				var = row[j];
				index = j;
			}
		}
		return index;
	}
}

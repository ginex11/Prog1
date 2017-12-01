package KW49;

import java.util.List;

public class nGewinnt {

	public static void main(String[] args) {
		char[][] feld = generiereZufaelligesFeld(5, 5, "rb");
		System.out.println("Dieses Feld wurde zufällig bestimmt: \n");
		System.out.println(feldToString(feld));
		List<Reihe> reihen = bestimmeAlleReihen(feld);
		for (int n = feld.length - 1; n <= feld.length; n++) {
			System.out.println("Auswertung für " + n + "-Gewinnt:");
			List<Reihe> gewinnReihen = filterReihen(reihen, 'r', n);
			gewinnReihen.addAll(filterReihen(reihen, 'b', n));
			for (Reihe r : gewinnReihen)
				System.out.println("- Diese Reihe gewinnt " + n + "-gewinnt:\n " + r);
			char[][] nGewinnt = markiereReihen(gewinnReihen, n, feld);
			System.out.println("\n" + feldToString(nGewinnt));
		}
	}

	private static char[][] markiereReihen(List<Reihe> gewinnReihen, int n, char[][] feld) {
		// TODO Auto-generated method stub
		return null;
	}

	private static List<Reihe> filterReihen(List<Reihe> reihen, char c, int n) {
		// TODO Auto-generated method stub
		return null;
	}

	private static List<Reihe> bestimmeAlleReihen(char[][] feld) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String feldToString(char[][] feld) {
		String e = "";
		for (int k = 0; k < feld.length; k++) {
			for (int l = 0; l < feld[k].length; l++) {
				e += feld[k][l]+" ";
			}
			e += "\n";
		}
		return e;
	}

	private static char[][] generiereZufaelligesFeld(int i, int j, String string) {
		String[] arr = string.split("");
		char[][] e;
		e = new char[i][j];
		for (int k = 0; k < i; k++) {
			for (int l = 0; l < j; l++) {
				int random = (int) (Math.random() * string.length());
				e[k][l] = arr[random].charAt(0);
			}
		}
		return e;
	}
}

package demoja;

import java.util.Scanner;

public class Toistoja {

	public static void main(String[] args) {

		int laskuri = 0;
		Scanner lukija = new Scanner(System.in);

		while (laskuri < 10) {
			System.out.println("Laskurin arvo: " + laskuri);
			laskuri++;
		}

		int luku;
		do {
			System.out.println("Anna joku luku väliltä 1-9");
			luku = lukija.nextInt();
		} while (luku < 1 || luku > 9);

		for (int l = 0; l < 10; l++) {
			System.out.println("Kierros: " + l);
		}
 	}

}

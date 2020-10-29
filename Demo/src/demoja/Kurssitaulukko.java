package demoja;

public class Kurssitaulukko {

	public static void main(String[] args) {

		double kurssi = 5.94573;

		for (int i = 1; i <= 10; i++) {
			//System.out.println(i + " = " + (i * kurssi));
			// f = float  d= Integer  s = String  b = boolean
			System.out.printf("%4d = %6.2f \n", i, i * kurssi);
		}

	}

}

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class karakteroppg {

	public static void main(String[] args) {
		int karakter;
		for (int i = 1; i <= 10; i++) {

			do {
				karakter = Integer.parseInt(showInputDialog("hvor mange poeng?"));
			} while (karakter < 0 || karakter > 100);

			if (karakter < 0 || karakter > 100) {
				System.out.println("ikke gyldig svar");
			} else if (karakter >= 0 && karakter <= 39) {
				System.out.println("Karakter F");
			} else if (karakter >= 40 && karakter <= 49) {
				System.out.println("Karakter E");
			} else if (karakter >= 50 && karakter <= 59) {
				System.out.println("Karakter D");
			} else if (karakter >= 60 && karakter <= 79) {
				System.out.println("Karakter C");
			} else if (karakter >= 80 && karakter <= 89) {
				System.out.println("Karakter B");
			} else if (karakter >= 90 && karakter <= 100) {
				System.out.println("Karakter A");
			}

		}
	}
}
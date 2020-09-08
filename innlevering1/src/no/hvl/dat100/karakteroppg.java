package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class karakteroppg {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			int karakter;
			do {
				karakter = Integer.parseInt(showInputDialog("hvor mange poeng fikk eleven?"));
			} while (karakter < 1 || karakter > 100);

			if (karakter < 0 || karakter > 100) {
				System.out.println("ugyldig svar");
			} else if (karakter >= 0 && karakter <= 39) {
				System.out.println("karakter: F");
			} else if (karakter >= 40 && karakter <= 49) {
				System.out.println("karakter: E");
			} else if (karakter >= 50 && karakter <= 59) {
				System.out.println("karakter: D");
			} else if (karakter >= 60 && karakter <= 79) {
				System.out.println("karakter: C");
			} else if (karakter >= 80 && karakter <= 89) {
				System.out.println("karakter: B");
			} else if (karakter >= 90 && karakter <= 100) {
				System.out.println("karakter: A");
			}
		}

	}
}
package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class trinnSkatt {

	public static void main(String[] args) {
		String skatt = showInputDialog("skriv inn din lonn");
		double lonn = Integer.parseInt(skatt);

		double t1 = lonn * 0.93;
		double t2 = lonn * 2.41;
		double t3 = lonn * 11.52;
		double t4 = lonn * 14.52;

		if (lonn < 164100) {
			System.out.println("ingen skatt");
		} else if (lonn > 164101 && lonn < 230950) {
			System.out.println("0.93 i skatt: " + t1);
		} else if (lonn > 230951 && lonn < 580650) {
			System.out.println("2.41 i skatt: " + t2);
		} else if (lonn > 580651 && lonn < 934050) {
			System.out.println("11.52 i skatt: " + t3);
		} else if (lonn > 934051) {
			System.out.println("14.52 i skatt: " + t4);
		}

	}

}
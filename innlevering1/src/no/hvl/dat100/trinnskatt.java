package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class trinnskatt {

	public static void main(String[] args) {

		String trinnSkatt = showInputDialog("hvor mye tjente du?");
		double lonn = Integer.parseInt(trinnSkatt);
		
		double trinn1 = lonn * 0.93;
		double trinn2 = lonn * 2.43;
		double trinn3 = lonn * 11.52;
		double trinn4 = lonn * 14.52;

		if (lonn <= 164100) {
			System.out.println("ingen skatt.");
		} else if (lonn >= 164101 && lonn <= 230950) {
			System.out.println("0.93% i skatt. brutto = " + trinn1);
		} else if (lonn >= 230951 && lonn <= 580650) {
			System.out.println("2.43% i skatt. brutto = " + trinn2);
		} else if (lonn >= 580651 && lonn <= 934050) {
			System.out.println("11.52% i skatt. brutto = " + trinn3);
		} else if (lonn >= 934051) {
			System.out.println("14.52% i skatt. brutto = " + trinn4);
		}
	}
}
package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class fakultetoppg {

	public static void main(String[] args) {

		String tall = showInputDialog("n!= ");
		int n = Integer.parseInt(tall);
		int fakt = 1;
		
		for (int i=1; i<=n; i++) {
			fakt=fakt*i;
			System.out.println(fakt);
		}
	}
}

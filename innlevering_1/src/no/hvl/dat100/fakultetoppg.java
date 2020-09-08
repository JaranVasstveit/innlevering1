package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class fakultetoppg {

	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("skriv inn n!"));
		int f = 1;
		for (int i = 1; i<=n; i++) {
			f=f*i;
		}
		System.out.println(f);
	}

}
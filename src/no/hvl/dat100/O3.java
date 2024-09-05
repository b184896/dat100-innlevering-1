package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		String s = showInputDialog("Velg et tall:");
		int n = parseInt(s);

		int x = 1;
		for (int i = 1; i <= n; i++) {
			x = x * i;

		}

		System.out.println("Fakulteten av " + n + " er: " + x);
	}
}
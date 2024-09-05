package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		String s = showInputDialog("Hva er din bruttolønn?");
		double bruttolønn = Double.parseDouble(s);

		if (bruttolønn >= 0 && bruttolønn <= 208050) {
			System.out.println("Du behøver ikke betale trinnskatt");

		} else if (bruttolønn >= 208051 && bruttolønn <= 292850) {
			double ts1 = bruttolønn / 100 * 1.7;
			System.out.println("Du skal betale: " + ts1 + " i trinnskatt");

		} else if (bruttolønn >= 292851 && bruttolønn <= 670000) {
			double ts2 = bruttolønn / 100 * 4.0;
			System.out.println("Du skal betale: " + ts2 + " i trinnskatt");

		} else if (bruttolønn >= 670001 && bruttolønn <= 1350000) {
			double ts3 = bruttolønn / 100 * 16.6;
			System.out.println("Du skal betale: " + ts3 + " i trinnskatt");

		} else if (bruttolønn > 1350001) {
			double ts4 = bruttolønn / 100 * 17.6;
			System.out.println("Du skal betale: " + ts4 + " i trinnskatt");

		} else {
			System.out.println("Dette er ikke en gyldig bruttolønn");

		}
	}
}

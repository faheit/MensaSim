/**
 * 
 * @author Fabian Heitmann
 * @version 01.05.2015
 */

public class Kontext implements Entscheidungen {

	private int kontext;

	/*
	 * Konstruktor fuer die Art des Kontext k
	 */
	Kontext(int k) {
		this.kontext = k;
		System.out.println("Konstruktor aufgerufen");
		waehleSzenario();

	}

	public int getKontext() {
		return this.kontext;
	}

	public String toString() {
		return "Der Kontext ist " + getKontext() + "!";
	}

	private void waehleSzenario() {
		switch (getKontext()) {
		case 0:
			System.out.println("Szenario " + getKontext() + " wird gestartet!");
			break;
		default:
		}
	}

}

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;

/**
 * 
 * @author Fabian Heitmann
 * @version 01.05.2015
 * Test comment for commit three
 * We should do it like this! And like This!
 * Or like this
 */
public class Starter {

	public static void main(String[] args) {
		/*
		 * Starte die Simulation mit Szenario "S" und Verhalten "V" des Agenten
		 */
		final int S = Integer.parseInt(args[0]);
		final int V = Integer.parseInt(args[1]);
		/*
		 * Erstelle einen Kontext mit Szenario i
		 */
		Kontext k = new Kontext(S);
		Agent a = new Agent(V);
		a.test();
	}

}

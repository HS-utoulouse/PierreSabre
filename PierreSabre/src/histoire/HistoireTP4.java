package histoire;

import personnage.Commercant;
import personnage.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Porf", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		System.out.println("\n");
		
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoirArgent(15);
		marco.boire();
	}
	
}


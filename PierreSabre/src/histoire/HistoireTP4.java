package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Ronin;
import personnage.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		System.out.println("Partie 1\n");

		Humain prof = new Humain("Porf", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);

		System.out.println("\nPartie 2\n");

		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoirArgent(15);
		marco.boire();

		System.out.println("\nPartie 3\n");

		Yakuza yaku = new Yakuza("Yaku le Noir", "wisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		System.out.println("\nPartie 4\n");

		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);

	}

}

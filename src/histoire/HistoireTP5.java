package histoire;

import personnage.Commercant;
import personnage.Ronin;
import personnage.Samourai;
import personnage.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) { // j'ai mis de la couleur ici comme dans mon projet perso

		System.out.println("\n\u001B[34m1- Les humains ont une mémoire\u001B[0m\n");

		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);

		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);

		System.out.println("");

		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();

		System.out.println("\n\u001B[34m2- Le yakuza est fier de son clan\u001B[0m\n");
		
		yaku.direBonjour();
		
		System.out.println("\n\u001B[34m3- Les samouraïs\u001B[0m\n");
		
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", 80, "saké");
		
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		
		System.out.println("");
		
		akimoto.boire("thé");
		
	}
}

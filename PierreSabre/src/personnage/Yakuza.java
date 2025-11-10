package personnage;

public class Yakuza extends Humain {

	private int reputation;
	private String clan;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = 0;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int somme = victime.seFaireExtorquer();
		parler("J’ai piqué les " + somme + " sous de " + victime.getNom() + ", ce qui me fait "
				+ (this.getArgent() + somme) + " sous dans ma\n" + "poche. Hi ! Hi !");
		this.gagnerArgent(somme);
	}

}

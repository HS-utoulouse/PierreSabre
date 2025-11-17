package personnage;

public class Yakuza extends Humain {

	private int reputation;
	private String clan;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = 0;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int somme = victime.seFaireExtorquer();
		parler("J’ai piqué les " + somme + " sous de " + victime.getNom() + ", ce qui me fait " + (getArgent() + somme)
				+ " sous dans ma\n" + "poche. Hi ! Hi !");
		this.gagnerArgent(somme);
	}

	public int perdre() {
		final int somme = getArgent();
		perdreArgent(somme);
		reputation -= 1;
		parler("J’ai perdu mon duel et mes " + somme + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		return somme;
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation += 1;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses "
				+ gain + " sous.");
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		System.out.println("Mon clan est celui de " + clan);

	}

}

package personnage;

public class Ronin extends Humain {

	private int reputation;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.reputation = 1;
	}

	public void donner(Commercant beneficiaire) {
		final int somme = this.getArgent() * 1 / 10;
		this.parler(beneficiaire.getNom() + " prend ces " + somme + " sous.");
		this.perdreArgent(somme);
		beneficiaire.recevoirArgent(somme);
	}

	public void provoquer(Yakuza adversaire) {
		final int forceYakuza = adversaire.getReputation() * 2;
		final int forceRonin = this.reputation * 2;

		if (forceRonin >= forceYakuza) {
			this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			this.parler("Je t’ai eu petit yakusa!");
			this.gagner(adversaire.perdre());
		} else {
			adversaire.gagner(this.perdre());
		}

	}

	public int perdre() {
		final int somme = this.getArgent();
		this.perdreArgent(somme);
		this.reputation -= 1;
		this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		return somme;
	}

	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.reputation += 1;
	}

}

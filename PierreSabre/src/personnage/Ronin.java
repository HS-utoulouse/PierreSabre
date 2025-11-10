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

}

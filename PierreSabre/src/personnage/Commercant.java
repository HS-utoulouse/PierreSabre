package personnage;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...");
		int somme = this.getArgent();
		this.perdreArgent(somme);
		return somme;
	}

	public void recevoirArgent(int argent) {
		this.gagnerArgent(argent);
		this.parler(argent + " sous ! Je te remercie généreux donateur!");
	}

}

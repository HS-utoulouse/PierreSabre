package personnage;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private int nbConnaissance;

	private Humain[] memoire;

	public Humain(String nom, String boissonFavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		this.nbConnaissance = 0;
		this.memoire = new Humain[30];
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void parler(String texte) {
		System.out.println(texte);
	}

	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle" + nom + " et j'aime boire du " + boissonFavorite + ".");
	}

	public void boire() {
		this.parler("Mmmm, un bon verre de " + this.boissonFavorite + " ! GLOUPS !");
	}

	public void gagnerArgent(int sommeGagnee) {
		this.argent += sommeGagnee;
	}

	public void perdreArgent(int sommeGagnee) {
		this.argent -= sommeGagnee;
	}

	public void acheter(String bien, int prix) {
		if (this.argent >= prix) {
			this.perdreArgent(prix);
			parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
		} else {
			parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à "
					+ prix + " sous.");
		}
	}

	public void faireConnaissanceAvec(Humain homme2) {
		this.direBonjour();
		this.memoriser(homme2);

	}

	public void memoriser(Humain homme2) {
		if (this.nbConnaissance < 30) {
			this.memoire[this.nbConnaissance] = homme2;
		}
	}

	public void repondre(Humain homme2) {
		homme2.direBonjour();
		homme2.memoriser(this);
	}

	public void listerConnaissance() {
		for (int i = 0; i < this.nbConnaissance; i++) {
			Humain homme2 = this.memoire[i];
			System.out.println("(" + homme2.nom + ") - ");
			homme2.direBonjour();
		}
	}

}

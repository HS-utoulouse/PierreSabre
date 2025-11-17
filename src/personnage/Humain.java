package personnage;

public class Humain {

	static final int CAPACITER_MEMOIRE = 30; // constente du nombre d'humain retenu

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
		this.memoire = new Humain[CAPACITER_MEMOIRE];
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public int getNbConnaissance() {
		return nbConnaissance;
	}

	public Humain[] getMemoire() {
		return memoire;
	}

	public void parler(String texte) {
		System.out.println(texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void gagnerArgent(int sommeGagnee) {
		argent += sommeGagnee;
	}

	public void perdreArgent(int sommeGagnee) {
		argent -= sommeGagnee;
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			perdreArgent(prix);
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix
					+ " sous.");
		}
	}

	public void faireConnaissanceAvec(Humain homme2) {
		direBonjour();
		memoriser(homme2);
		repondre(homme2);

	}

	public void memoriser(Humain homme2) {
		if (nbConnaissance < CAPACITER_MEMOIRE) {
			memoire[nbConnaissance] = homme2;
			nbConnaissance += 1;
		}
	}

	public void repondre(Humain homme2) {
		homme2.direBonjour();
		homme2.memoriser(this);
	}

	public void listerConnaissance() {
		String texte = "";
		for (int i = 0; i < nbConnaissance; i++) {
			Humain homme2 = memoire[i];
			// texte = texte.concat(homme2.getNom() + ", "); // plus complexe moins
			// compréhensible
			texte += homme2.getNom() + ", ";
		}
		parler("Je connais beaucoup de monde dont : " + texte);
	}

}

package personnage;

import java.util.Random;

public class Traitre extends Samourai {

	private int niveauDeTraitrise;

	private Random random = new Random();

	public Traitre(String nom, String boissonFavorite, int argent, String seigneur) {
		super(nom, boissonFavorite, argent, seigneur);
		this.niveauDeTraitrise = 0;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauDeTraitrise + ". Chut !");
	}

	public void ranconner(Commercant commercant) {

		if (niveauDeTraitrise < 3) {
			final int argentRenconner = commercant.getArgent();
			commercant.perdreArgent(argentRenconner * 2 / 10);
			gagnerArgent(argentRenconner);
			niveauDeTraitrise += 1;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argentRenconner
					+ " sous ou gare à toi !");
			parler("Tous de suite grand " + commercant.getNom() + ".");
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}

	public void faireLeGentil() {

		if (getNbConnaissance() > 1) {

			int valeurAleatoire = random.nextInt(getNbConnaissance() - 1);

			Humain ami = getMemoire()[valeurAleatoire];
			final int don = getArgent() * 1 / 20;

			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + ami.getNom()
					+ ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + "sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);

			ami.parler("Merci " + getNom() + ". Vous etes quelqu'un de bien.");

			if (niveauDeTraitrise > 1) {
				niveauDeTraitrise -= 1;
			}
		} else {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}
	}
}

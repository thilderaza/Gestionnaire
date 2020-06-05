// MATHILDE RAZAFIMAHATRATRA
package gestionvehicule;

public class Voiture extends Vehicule{
   private double cylindree;
	private int nbPortes;
	private double puissance;
	private double kilometre;

	public Voiture(String marque, int date, double prix,
			double cylindree, int portes, double cv, double km) {
		super(marque, date, prix);
		this.cylindree = cylindree;
		nbPortes = portes;
		puissance = cv;
		kilometre = km;
	}

	public void calculePrix(int anneActuelle) {
	  double decote = (anneActuelle - getDateAchat()) * .02;
		decote += 0.05 * (int)(kilometre / 10000);
		if ((getMarque() == "Ford") || (getMarque() == "Renault")) {
			decote += 0.1;
		} else if ((getMarque() == "Ferrari") || (getMarque() == "Porsche")) {
			decote -= 0.2;
		}

		setPrixCourant(Math.max(0.0, (1.0 - decote) * getPrixAchat()));
	}

	public void affiche() {
		System.out.println("Voitures");
		super.affiche();
		System.out.println(cylindree + " Litres, "
				+ nbPortes + " Portes, "
				+ puissance + " CV, "
				+ kilometre + " km.");
	}
}

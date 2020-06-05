// MATHILDE RAZAFIMAHATRATRA
package gestionvehicule;

public class Gestionvehicule {

    private static int annee_act = 2012;
    public static void main(String[] args) {
		Vehicule[] vehicules = new Vehicule [5];

		vehicules[0] = new Voiture("Porshe", 1976, 7494385.00, 4.5, 2, 987, 3300);
		vehicules[1] = new Voiture("Ford", 2020, 12333.30, 3, 9, 65.0, 9765);

		vehicules[2] = new Avion("AirBUs", 2001, 345679763.90, "HELICE", 999);
		vehicules[3] = new Avion("Ryan AIr", 2000, 999998.00, "HELICES", 67656);

		for (int i = 0; i < vehicules.length; i++) {
			vehicules[i].calculePrix(annee_act);
			vehicules[i].affiche();
		}
	}
    }
    


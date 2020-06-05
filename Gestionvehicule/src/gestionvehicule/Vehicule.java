// MATHILDE RAZAFIMAHATRATRA
package gestionvehicule;

public class Vehicule {
    private String marque;
    private int dateAchat;
    private double prixAchat;
    private double prixCourant;

    public Vehicule(String marque, int date, double prix) {
        this.marque = marque;
        dateAchat = date;
        prixAchat = prix;
        prixCourant = prix;
    }

    public void calculePrix(int anneAct) {
        double decote = (anneAct - dateAchat) * 0.01;
        prixCourant = Math.max(0.0, (1.0 - decote) * prixAchat);
    }

    public void affiche() {
        System.out.print("Marque : " + marque +", Date d'achat : " + dateAchat +", Prix actuel : " + prixCourant);
        System.out.println();
    }
    public int getDateAchat(){
        return dateAchat;
    }
    public String getMarque(){
        return marque;
    }
    public double getPrixAchat(){
        return prixAchat;
    }
    public void setPrixCourant(double prix){
        prixCourant = prix;
    }
}

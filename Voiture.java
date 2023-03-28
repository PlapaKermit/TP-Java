import java.awt.Color;

public class Voiture {
    public int nbportes ;
    public String marque;
    public Color couleur;

    public Voiture() {
        this.nbportes = 4;
        this.marque = "undefined";
        this.couleur = Color.red;
    }

    public Voiture(int nbportes, String marque, Color couleur) {
        this.nbportes = nbportes;
        this.marque = marque;
        this.couleur = couleur;
    }
    @Override
    public String toString() {
        return "Voiture{" +
                "nbportes=" + nbportes +
                ", marque='" + marque + '\'' +
                ", couleur=" + couleur +
                '}';
    }

}

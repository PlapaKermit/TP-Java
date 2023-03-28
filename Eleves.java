public class Eleves extends Personne{

    public Eleves(String nom, String prenom, String adresse) {
        super(nom, prenom, adresse);
    }

    @Override
    public String toString() {
        return "Eleves{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Voiture v1 = new Voiture();
        Voiture v2 = new Voiture(4, "Peugeot", Color.red);
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        v1.nbportes = 5;
        System.out.println(v1.toString());
    }

}
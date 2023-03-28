import java.awt.*;

public class Main {
    //Exo 1
    /*public static void main(String[] args) {
        System.out.println("Hello world!");
        Voiture v1 = new Voiture();
        Voiture v2 = new Voiture(4, "Peugeot", Color.red);
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        v1.nbportes = 5;
        System.out.println(v1.toString());
    }*/
    //Exo 2
    public static void main(String[] args) {
        Student s1 = new Student(1, "John", "Smith");
        Student s2 = new Student(2, "Mary", "Sue");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        s1.setFirstName("Johnathan");
        System.out.println(s1.toString());
    }

}
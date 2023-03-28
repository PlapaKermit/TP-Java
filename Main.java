import java.awt.*;

public class Main {
    //TP 1 Exo 1
    /*public static void main(String[] args) {
        System.out.println("Hello world!");
        Voiture v1 = new Voiture();
        Voiture v2 = new Voiture(4, "Peugeot", Color.red);
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        v1.nbportes = 5;
        System.out.println(v1.toString());
    }*/
    //Exo 2 :CREATION D’UN OBJET ET SES ATTRIBUTS
    /*public static void main(String[] args) {
        Student s1 = new Student(1, "John", "Smith");
        Student s2 = new Student(2, "Mary", "Sue");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        s1.setFirstName("Johnathan");
        System.out.println(s1.toString());
    }*/
    //Exo 3 : LA CLASSE ARRAYLIST
    public static void main(String[] args) {
        Promotion p1 = new Promotion();
        p1.addStudent("John", "Smith");
        p1.addStudent("Mary", "Sue");
        p1.addStudent("Richard", "Roe");
        p1.addStudent("Jane", "Doe");
        p1.afficher();
        p1.writeToFile("Promo 1");
    }
    //Tp 2
    /*public static void main(String[] args) {
        Prof Prof1 = new Prof("John", "Smith", "45 alle du michel",3,35);
        System.out.println(Prof1.getprixheure());
        System.out.println(Prof1.getsalaire());
        Prof1.modifechelon(4);
        System.out.println(Prof1.getprixheure());
        System.out.println(Prof1.getsalaire());

    }*/
}
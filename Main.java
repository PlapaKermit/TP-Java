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
        Promotion p = new Promotion();
        p.addStudent("John", "Smith");
        p.addStudent("Mary", "Sue");
        p.addStudent("Richard", "Roe");
        p.addStudent("Jane", "Doe");
        p.afficher();
        p.writeToFile();
    }

}
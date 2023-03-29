import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Ex1------");
        exercice1();
        System.out.println("-----Ex2------");
        exercice2();
        System.out.println("-----Ex3------");
        exercice3();
        System.out.println("-----Tp2------");
        tp2();
    }

    private static void exercice1() {
        Voiture v1 = new Voiture();
        Voiture v2 = new Voiture(4, "Peugeot", Color.red);
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        v1.nbportes = 5;
        System.out.println(v1.toString());
    }

    private static void exercice2() {
        Student s1 = new Student(1, "John", "Smith");
        Student s2 = new Student(2, "Mary", "Sue");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        s1.setFirstName("Johnathan");
        System.out.println(s1.toString());
    }

    private static void exercice3() {
        Promotion p1 = new Promotion();
        p1.addStudent("John", "Smith");
        p1.addStudent("Mary", "Sue");
        p1.addStudent("Richard", "Roe");
        p1.addStudent("Jane", "Doe");
        p1.afficher();
        p1.writeToFile("Promo 1");
    }

    private static void tp2() {
        Prof Prof1 = new Prof("John", "Smith", "45 alle du michel",3,35);
        System.out.println(Prof1.getprixheure());
        System.out.println(Prof1.getsalaire());
        Prof1.modifechelon(4);
        System.out.println(Prof1.getprixheure());
        System.out.println(Prof1.getsalaire());
    }
}
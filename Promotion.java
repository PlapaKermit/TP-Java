import java.util.ArrayList;
import java.io.*;

public class Promotion {
    private ArrayList<Student> students;

    public int size() {
        return students.size();
    }
    public Promotion() {
    students = new ArrayList<>();
    }
    public void addStudent(String firstName, String lastName) {

        Student s = new Student(size()+1, firstName, lastName);
        students.add(s);
    }
    public void afficher() {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    /**
     * This method write a promotion to a file
     * @param namePromo the name of the promotion
     */
    public void writeToFile(String namePromo) {

        try {
            FileWriter writer = new FileWriter(namePromo + " students.txt");
            for (Student s : students) {
                writer.write(s.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

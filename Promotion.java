import java.util.ArrayList;
import java.io.*;
public class Promotion {
    ArrayList<Student> students;

    public int size() {
        return students.size();
    }
    public Promotion() {
    students = new ArrayList<Student>();
    }
    public void addStudent(String firstName, String lastName) {
        int x = size() + 1;
        Student s = new Student(x, firstName, lastName);
        students.add(s);
    }
    public void afficher() {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
    //Write a method that writes the list of students to a file
    public void writeToFile() {
        try {
            FileWriter writer = new FileWriter("students.txt");
            for (Student s : students) {
                writer.write(s.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

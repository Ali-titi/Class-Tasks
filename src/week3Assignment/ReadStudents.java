package week3Assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadStudents {
    public static List<Student> readFromFile() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int m1 = Integer.parseInt(data[3]);
                int m2 = Integer.parseInt(data[4]);
                int m3 = Integer.parseInt(data[5]);
                students.add(new Student(id, name, age, m1, m2, m3));
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
        return students;
    }
}

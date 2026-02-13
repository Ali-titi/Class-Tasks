package week3Assignment;
import java.util.Collections;
import java.util.List;

public class StudentReport {
    public static void main(String[] args) {
        List<Student> students = ReadStudents.readFromFile();
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        // Sort students by age
        Collections.sort(students, (s1, s2) -> s1.age - s2.age);

        System.out.println(" STUDENT REPORT ");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

package week3Assignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddStudentToFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt", true))) {
            System.out.print("Enter ID: ");
            int id = input.nextInt();

            System.out.print("Enter Name: ");
            String name = input.next();

            System.out.print("Enter Age: ");
            int age = input.nextInt();

            System.out.print("Enter Mark 1: ");
            int m1 = input.nextInt();

            System.out.print("Enter Mark 2: ");
            int m2 = input.nextInt();

            System.out.print("Enter Mark 3: ");
            int m3 = input.nextInt();

            bw.write(id + "," + name + "," + age + "," + m1 + "," + m2 + "," + m3);
            bw.newLine();

            System.out.println("Student added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
}

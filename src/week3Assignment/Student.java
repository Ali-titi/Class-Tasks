package week3Assignment;

public class Student {
    int id;
    String name;
    int age;
    int m1, m2, m3;

    public Student(int id, String name, int age, int m1, int m2, int m3) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public double getAverage() {
        return (m1 + m2 + m3) / 3.0;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Average: " + getAverage();
    }
}

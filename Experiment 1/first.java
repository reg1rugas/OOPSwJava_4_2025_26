
public class first {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(7, "Raman");
        s1.display();
        s2.display();
    }
}


class Student {
    int rollNumber;
    String name;

    Student() {
        rollNumber = -1;
        name = "Not assigned";
    }

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}


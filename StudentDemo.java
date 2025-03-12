class Student {
    // Private attributes - making them final as they are assigned once and cannot be changed
    private final String name;
    private final int id;
    private final double gpa;
    private static int studentCount = 0;  // Static variable to keep track of student count

    // Constructor
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++;  // Increment the student count whenever a new student is created
    }

    // Method to display student info
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    // Static method to display the total number of students
    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.5);
        Student student3 = new Student("Charlie", 103, 3.9);

        // Display student information
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        // Display the total student count
        Student.displayStudentCount();
    }
}

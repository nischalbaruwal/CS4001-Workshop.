public class Student {
    // Attributes - keeping them private
    private String name;
    private int studentId;
    private int age;
    private double grade;

    // Task 1: Constructor to initialize all attributes
    public Student(String name, int age, int studentId, double grade) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
    }

    // Task 2 Requirement: Overloaded Constructor (Example: just name and age)
    public Student(String name, int age) {
        this(name, age, 0, 0.0); // Calls the main constructor with defaults
    }

    // Method: displayInfo() - Displays student details
    public void displayInfo() {
        System.out.println("-------------------------");
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade     : " + grade);
        System.out.println("-------------------------");
    }

    // Method: isAdult() - Returns true if age >= 18
    public boolean isAdult() {
        return this.age >= 18;
    }

    // Method: updateGrade(double grade) - Adds/updates grade
    public void updateGrade(double newGrade) {
        this.grade = newGrade;
    }

    // Task 1: Override toString() method
    @Override
    public String toString() {
        return "Student[ID=" + studentId + ", Name=" + name + "]";
    }
}
public class StudentTester {
    public static void main(String[] args) {
        // Demonstrate constructor overloading
        // 1. Using all attributes
        Student s1 = new Student("Nischal", 18, 276, 3.2);
        
        // 2. Using overloaded constructor (name and age only)
        Student s2 = new Student("Nelson", 17);
        
        // Test updateGrade
        s2.updateGrade(2.9);

        // Test displayInfo
        System.out.println("Displaying Student Information:");
        s1.displayInfo();
        s2.displayInfo();

        // Test isAdult
        System.out.println("Is " + s1.toString() + " an adult? " + s1.isAdult());
        System.out.println("Is " + s2.toString() + " an adult? " + s2.isAdult());
    }
}
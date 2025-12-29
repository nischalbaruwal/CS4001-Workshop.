public class StudentTester {
    String name;
    int studentId;
    int age;
    double grade;
    // Constructor A
    StudentTester(String name){
        this.name = name;
    }
    // Constructor B   
    StudentTester(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Constructor C
    StudentTester(String name, int age, int studentId, double grade){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
    }
    public void displayInfo(){
        System.out.println("------------------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Student ID : " + studentId);
        System.out.println("Grade : " + grade);
        System.out.println("------------------");
    }
    public static void main(String[] args) {
        StudentTester s1 = new StudentTester("Nischal",18,276,3.2); // Constructor A
        StudentTester s2 = new StudentTester("Nelson", 20,989,2.9); // Constructor B
        StudentTester s3 = new StudentTester("Suraj", 21, 101,3.4); // Constructor C

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
public class Student {
    //making all attributes private
    private String name; 
    private int age;   
    private double gpa;  

    // Getters and Setters [cite: 162]
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age > 0) { // validation 
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be positive.");
        }
    }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) { // validation 
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA! Must be between 0.0 and 4.0.");
        }
    }
}
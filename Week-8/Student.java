public class Student {
    String name;
    int studentID;
    int age;
    double grade;
   Student(String name){
       this.name=name;
   }
    
    Student(String name,int age, int studentID,double grade){
        this.name=name;
        this.age=age;
        this.studentID=studentID;
        this.grade=grade;
    }
    public void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("Student ID : "+studentID);
        System.out.println("Grade : "+grade);
    }
    
    public static void main(String[] args){
        Student s1 = new Student("Nischal",17,234,3.45);
        Student s2 = new Student("Nelson", 14,123,3.65);
        
        s1.displayInfo();
        s2.displayInfo();
        
        
    }
}

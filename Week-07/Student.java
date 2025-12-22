public class Student {
    String name;
    int studentID;
    int age;
    String course;
    
    Student(String name, int studentID, int age, String course){
        this.name=name;
        this.studentID=studentID;
        this.age=age;
        this.course=course;
        
        
    }
         public void DisplayStudentData(){
             System.out.println("name : " + name);
             System.out.println("StudentID : " + studentID);
             System.out.println("age : " + age);
             System.out.println("course : " + course);
             System.out.println();
             System.out.println();
         }
    public static void main(String[] args) {
        Student obj1=new Student("Nischal" , 23335, 17, "BIT");
        Student obj2= new Student("Ram", 3546, 18,"BBA");
        Student  obj3= new Student("Nelson", 6474, 19,"BIT");
        obj1.DisplayStudentData();
        obj2.DisplayStudentData();
        obj3.DisplayStudentData();


        
        
    }
}
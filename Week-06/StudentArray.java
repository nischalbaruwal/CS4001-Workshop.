import java.util.Scanner;

class StudentArray {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        String[] names= {"Asha", "Ramesh", "Binod","Sita","Sabita"};
             for(int i=0; i <names.length; i++){
                 System.out.println(names[i]);
    }
    //names at index 2 
         System.out.println(names[2]);
         
         //index 4 ma sabitra lai davis le change garako 
         names[4]="Gita";
         System.out.println(names[4]);
         
         System.out.println("Enter the name : ");
         String newName= sc.nextLine();
         
         names[0]=newName;
          for(int i=0; i <names.length; i++){
                 System.out.println(names[i]);
         
}
}
}
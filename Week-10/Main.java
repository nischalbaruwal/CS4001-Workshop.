public class Main {
    public static void main(String[] args) {
        
        // --- TESTING STUDENT (Task 1 & 3) ---
        System.out.println("--- Student Test ---");
        Student s1 = new Student();
        s1.setName("Nischal");
        s1.setAge(17);
        s1.setGpa(3.8);
        System.out.println("Name: " + s1.getName() + " | Age: " + s1.getAge());
          System.out.println("Age: " + s1.getAge());
            System.out.println("Gpa: " + s1.getGpa());

        // Proof of Security (Task 3): Intentionally triggering validation
        System.out.println("Testing security");
        s1.setAge(-5); 
        s1.setGpa(5.5);

        // --- TESTING BANK ACCOUNT (Task 2) ---
        System.out.println("\n--- Bank Account Test ---");
        BankAccount myAcc = new BankAccount("NP-123", "Nischal", 1000.0);
        
        myAcc.deposit(500.0);
        myAcc.withdraw(200.0);
        System.out.println("Current Balance: Rs. " + myAcc.getBalance());

        // Proof of Security (Task 2): Balance cannot go negative
        System.out.print("Testing Over-withdrawal: ");
        myAcc.withdraw(5000.0); 
    }
}
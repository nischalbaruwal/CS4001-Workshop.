class MathOperations
{
     public static void main(String[] args){
         //arithmetic operator
         int a=10;
         int b=3;
         
         // Arithmetic operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("\n=== Logical Operators ===");
        System.out.println("x && y = " + (x && y));// true only if both side sre true 
        System.out.println("x || y = " + (x || y));// true if one side is true
        System.out.println("!x     = " + (!x));// negation of x

        // Assignment operators
        System.out.println("\n=== Assignment Operators ===");
        int c = 20;//store 20 in c
        c += 5;  // c = c + 5
        System.out.println("c += 5 → " + c);//add 5 in c 

        // Unary operators
        System.out.println("\n=== Unary Operators ===");
        int num = 7;
        System.out.println("num++ = " + (num++));//post-increment
        System.out.println("++num = " + (++num));//pre-increment

        // Ternary operator
        System.out.println("\n=== Ternary Operator ===");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}
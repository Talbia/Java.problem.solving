/* Java Program to show java operations - 

1. Create a TextEdit file, format it to a plain text and save it with a '.java' extension
2. Write the java code
3. Open the terminal, view the folders (type ls), go to the required folder where you created the java file (type cd 'required folder') 
4. Type- javac 'Filename.java' (write whatever you named it), return
5. Type- java 'Filename' without .java extension
6. It will print the lines you have written in your java program.

*/

import java.util.Scanner;
 
public class JavaOperations{

    public static void main(String args[])
 
 {
    int num1, num2, add, sub, mul;
    float div;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Two Numbers : \n");
    num1 = scanner.nextInt();
    num2 = scanner.nextInt();

    add = num1 + num2;
    sub = num1 - num2;
    mul = num1 * num2;
    div = (float) num1 / num2;

    System.out.println("Sum of two numbers = " + add);
    System.out.println("Subtraction of two numbers = " + sub);
    System.out.println("Multiplication of two numbers = " + mul);
    System.out.println("Division of two numbers = " + div);
  }

}

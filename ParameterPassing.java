/* Java Program to pass parameters - 

1. Create a TextEdit file, format it to a plain text and save it with a '.java' extension
2. Write the java code
3. Open the terminal, view the folders (type ls), go to the required folder where you created the java file (type cd 'required folder') 
4. Type- javac 'Filename.java' (write whatever you named it), return
5. Type- java 'Filename' without .java extension
6. It will print the lines you have written in your java program.

*/

public class Main{

	static void myMethod(String fname, int age) {

	System.out.println(fname + " is " + age);

}

public static void main(String[] args) {

	myMethod("Talbia", 5);

	myMethod("Kabir", 8);

    }

}
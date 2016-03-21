
import java.util.*;
public class Example {
//new edit
	public static void main(String[] args) {
		PrintHelloName();

	}
	public static void PrintHello()
	{
		//This method prints hello world to user
		System.out.println("Hello World");
	}
	public static void PrintHelloName()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Name: ");;
		String name=s.nextLine();
		System.out.printf("Hello %s\n",name);
	}

}

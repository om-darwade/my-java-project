package om;
import java.util.Scanner;

public class SimpleArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = sc.nextLine();

    System.out.print("Enter your phone number: ");
    String phone = sc.nextLine();

    System.out.println("Name: " + name);
    System.out.println("Phone Number: " + phone);

    
    Demo d1 = new Demo();
    Demo d2 = new Demo(5);
    Demo d3 = new Demo(3, 7);

    sc.close();
  }
}

class Demo {
  
  public Demo() {
    System.out.println("No values provided.");
  }

  
  public Demo(int x) {
    System.out.println("Value: " + x);
  }

  
  public Demo(int a, int b) {
    System.out.println("Sum: " + (a + b));
  }
}

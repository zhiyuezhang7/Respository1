//  i   want to know if this is working

public class JavaSyntax {

  //class attribute
  int xx;

  //constructor
  public JavaSyntax(int yy) {
    xx = 55 - yy;
  }

  //methods
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  static String method(int a, String b) {
    return a + b;
  }

  //main method (WE START HERE)
  public static void main(String[] args) {
    System.out.println("Test");

    // run method
    myMethod();
    System.out.println(method(7, " is many people's lucky number!"));

    // create new object
    JavaSyntax object = new JavaSyntax(44);
    System.out.println(object.xx);

    // type variableName = value;
    String name = "John";
    System.out.println(name);
    boolean name1 = true;
    System.out.println(name1);
    int name2 = 5555;
    System.out.println(name2);
    char name3 = 'c';
    System.out.println(name3);
    String name4 = "Thank you my computer";
    System.out.println(name4);
    float myFloatNum = 5.99f;
    System.out.println(myFloatNum);


    //finalize a value
    final int myNum = 15;
    // myNum = 20;
    // will generate an error: cannot assign a value to a final variable
    System.out.println(myNum);

    //operation
    int x = 5, y = 6, z = 50;
    System.out.println(x + y + z);

    //array
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

    String a = cars[1];

    System.out.println(a + " is not my car sadly");

    for (String i : cars) {
      System.out.println(i);
    }
  }
}

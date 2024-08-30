import java.text.MessageFormat;
import java.util.Scanner;

public class Exceptions_handling {
    public static void main(String[] args) {
       //Verification example UNCHECKED exception, inherited from the class RuntimeException
        int[] numbers = new int[] {9,1,1,2,3};
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter variable ex: ");
        int ex = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter variable i: ");
        int i = scan2.nextInt();
        try {
            System.out.println(numbers[ex]);
            }
        catch  (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Value of element [" + i + "] equal " + numbers[i]);
        //Strings in Java are immutable. Each + creates a new object
        System.out.println(new StringBuilder().append("Value of element [").append(i).
                append("] equal ").append(numbers[i]).toString());
        //We create one StringBuilder MUTABLE OBJECT, add parts to it using the append method, convert it to a string
        System.out.printf("Value of element [%d] equal %d%n", i, numbers[i]);
        //Formatted output. %d - inserts an integer into a string. %n - goes to a new line. We use placeholder - a replacement place
        System.out.println(MessageFormat.format("Value of element [{0}] equal {1}", i,
                numbers[i]));
        //MessageFormat - message formatting class. The format method is a static method of this class. It creates a String IMMUTABLE OBJECT by replacing patterns with specific values.
    }
}

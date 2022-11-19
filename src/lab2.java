import java.util.*;


import static java.lang.Math.pow;
import static java.lang.Math.tan;

public class lab2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String s1 = input.nextLine();

        System.out.println("Enter the second string:");
        String s2 = input.nextLine();

        if ( s1.startsWith(s2) )
            System.out.println("The string " + s1 + " starts with " + s2);

         else if (s1.endsWith(s2))
            System.out.println("The string " + s1 + " ends with " + s2);

        else
            System.out.println("The string " + s1 + " does not starts or ends with " + s2);


    }
}

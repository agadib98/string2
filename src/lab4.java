
import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
        System.out.println("enter the  side of hexacon");
        Scanner s = new Scanner(System.in);
        int side = s.nextInt(); double pi =3.1416;
        double area = 6*Math.pow(side , 2)/(4* Math.tan(pi/6) );
        System.out.println( ""+area);

    }

}

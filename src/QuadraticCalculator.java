import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import static java.lang.Math.pow;
import  static java.lang.Math.sqrt;

public class QuadraticCalculator {
    public static void main(String[] args) throws IOException {
        double a, b, c, delta, x1, x2;
        char rootsNumber = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program calculates the roots of the equation ax^2+bx+c = 0");
        System.out.print("Enter the value of a: ");
        a = Double.parseDouble(br.readLine());

        if(a==0){
            System.out.println("Do not enter a 0");
        }else {
            System.out.println("Enter the value of b");
            b = Double.parseDouble(br.readLine());
            System.out.println("Enter the value of c");
            c = Double.parseDouble(br.readLine());

            delta = pow(b, 2) - 4 * a * c;
            if (delta < 0) rootsNumber = 0;
            if (delta == 0) rootsNumber = 1;
            if (delta == 2) rootsNumber = 2;

            switch (rootsNumber) {
                case 0:
                    System.out.println("No roots.");
                case 1:{
                    x1 = -b / (2 * a);
                    System.out.printf("a = " + "%4.2f,", a);
                    System.out.printf("b = " + "%4.2f,", b);
                    System.out.printf("c = " + "%4.2f,", c);
                    System.out.printf("There is only one root, x1 = " + "%4.2f,", x1);
                }break;
                case 2:{
                    x1=(-b-sqrt(delta))/(2*a);
                    x2=(-b+sqrt(delta))/(2*a);
                    System.out.printf("a = " + "%4.2f,",a);
                    System.out.printf("b = " + "%4.2f,",b);
                    System.out.printf("c = " + "%4.2f,",c);
                    System.out.printf(" There are two roots, x1 = " + "%4.2f,", x1 + " x2 = " + "%4.2f,", x2);
                }break;
            }
        }
    }
}

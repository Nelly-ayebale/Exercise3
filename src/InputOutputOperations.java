import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class InputOutputOperations {
    public static void main(String[] args) throws IOException {
        float firstNumberAyebale, secondNumberAyebale, sum, subtraction, product, quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This is a basic calculator performing calculations on two numbers:");
        System.out.print("Enter your first number: ");
        firstNumberAyebale = Float.parseFloat(br.readLine());

        System.out.print("Enter your second number: ");
        secondNumberAyebale= Float.parseFloat(br.readLine());
        System.out.println("");

        sum = firstNumberAyebale + secondNumberAyebale;
        subtraction = firstNumberAyebale - secondNumberAyebale;
        product = firstNumberAyebale* secondNumberAyebale;
        quotient = firstNumberAyebale/secondNumberAyebale;

        System.out.println("Calculations: ");
        System.out.println("The sum of "+ firstNumberAyebale + " and "+ secondNumberAyebale + " is: "+ sum);
        System.out.println("The subtraction of "+ firstNumberAyebale + " and "+ secondNumberAyebale + " is: "+ subtraction);
        System.out.println("The product of "+ firstNumberAyebale + " and "+ secondNumberAyebale + " is: "+ product);
        System.out.println("The quotient of "+ firstNumberAyebale + " and "+ secondNumberAyebale + " is: "+ quotient);
    }
}

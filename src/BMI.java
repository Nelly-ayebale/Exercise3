import java.io.BufferedReader;
import java.io.InputStreamReader;
import  java.io.IOException;
import java.lang.Math;

public class BMI {
    public static void main(String[] args) throws IOException {
        float heightAyebale, weightAyebale, resultAyebale, heightAyebaleInMetresSQ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This is a BMI Index Calculator: ");
        System.out.print("Please enter your weight(kg): ");
        weightAyebale = Float.parseFloat(br.readLine());
        System.out.print("Please enter your height(cm): ");
        heightAyebale = Float.parseFloat(br.readLine());
        heightAyebaleInMetresSQ = (float)Math.pow(heightAyebale, 2);
        resultAyebale = (weightAyebale/heightAyebaleInMetresSQ) * 10000; //Using the metric system weight (kg) / [height (cm)]^2 *10000

        System.out.print("Your BMI is : ");
        if(resultAyebale == 16.0){
            System.out.println(resultAyebale +"----Starvation");
        }else if(resultAyebale > 16.0 && resultAyebale < 16.99){
            System.out.println(resultAyebale +"----Emaciation");
        }else if(resultAyebale > 17.00 && resultAyebale < 22.99){
            System.out.println(resultAyebale +"----Normal, low range");
        }else if(resultAyebale > 23.00 && resultAyebale < 24.99){
            System.out.println(resultAyebale +"----Normal, high range");
        }else if(resultAyebale > 25.00 && resultAyebale < 27.49){
            System.out.println(resultAyebale +"----Overweight, low range");
        }else if(resultAyebale > 27.50 && resultAyebale < 29.99){
            System.out.println(resultAyebale +"----Overweight, high range");
        }else if(resultAyebale > 30.00 && resultAyebale < 34.9){
            System.out.println(resultAyebale +"----First degree obesity");
        }else if(resultAyebale > 35 && resultAyebale < 39.9){
            System.out.println(resultAyebale +"----Second degree obesity");
        }else{
            System.out.println(resultAyebale + "----Third degree obesity");
        }
    }
}

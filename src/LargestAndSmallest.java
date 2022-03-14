import java.util.Random;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int set=10,number,index =1,largest=0,smallest=100;

        System.out.println("This is a program which will find the largest and  smallest number from the set of 10 randomly drawn integers from 1 to 100");

        Random rnd = new Random();
        System.out.println("Drawn numbers are: ");
        while (index<=set){
            number = Math.round((rnd.nextInt(100)+1));
            System.out.print(number + " , ");

            if (number>largest){
                largest = number;
            }
            if (number<smallest){
                smallest = number;
            }

            index++;
        }
        System.out.println("\nThe largest number in the set of numbers is " + largest);
        System.out.println("The smallest number in the set of numbers is " + smallest);
    }
}

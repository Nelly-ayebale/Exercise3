public class EvenNumbers {
    public static void main(String[] args) {
        int sumOfEvenNumbers = 0;
        for(int index = 1; index<=100; index++){
            if(index%2 == 0){
                sumOfEvenNumbers +=index;
            }
        }
        System.out.print("The sum of even numbers from 1 to 100 is : "+ sumOfEvenNumbers);
    }
}

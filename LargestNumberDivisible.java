//write a program to find the largest 4 digit number divisible by 10 and 14 in java 


public class LargestNumberDivisible {
    public static void main(String[] args) {
   
        int largestFourDigitNumber = 9999;     
        int lcm = 70;
               
        while (largestFourDigitNumber % lcm != 0) {
            largestFourDigitNumber--;
        }
               
        System.out.println("The largest 4-digit number divisible by 10 and 14 is: " + largestFourDigitNumber);
    }
}

/*public class add{
    public static void main(String[] args) {
        System.out.println("sum of three nos are:");
        int a=10;
        int b=20;
        int c=30;
        int d=a+b+c;
        System.out.println(d);
    }
}
*/
import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();
        int reversedNumber = reverseNumber(originalNumber);
        int sum = originalNumber + reversedNumber;
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
        System.out.println("Sum of Original and Reversed Numbers: " + sum);
    }
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
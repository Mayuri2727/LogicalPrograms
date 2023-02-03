package LogicalPrograms;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Number to reverse: ");
            int num = sc.nextInt();
            int reverse = reverseNumber(num);
            System.out.println("Reverse of the number: " + reverse);
        }

        public static int reverseNumber(int num) {
            int reverse = 0;
            while (num != 0) {
                int remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num / 10;
            }
            return reverse;
        }
    }

package LogicalPrograms;

public class PerfectNumber {
    public static void main(String[] args) {
        int sum = 0;                        //var sum to keep track of the sum of the divisors.
        for (int i = 1; i < 28; i++) {
            if (28 % i == 0) {
                sum += i;
            }
        }
        if (sum == 28) {
            System.out.println(28 + " is a Perfect Number");
        } else {
            System.out.println(28 + " is not a Perfect Number");
        }
    }
}

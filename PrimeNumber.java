package LogicalPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int N = 51;
        boolean isPrime = true;
        if (N <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(N + " is a Prime Number");
        } else {
            System.out.println(N + " is not a Prime Number");
        }
    }
}

package LogicalPrograms;

public class FibonacciSeries{
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum =  0;
        System.out.print(a + " " + b);
        for (int i = 2; i < 10; i++) {
            sum = a + b;
            System.out.print(" " + sum);
            a = b;                       // a & b updated will be the two previous terms.
            b = sum;
        }
    }
}


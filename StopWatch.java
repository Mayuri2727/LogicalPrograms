package LogicalPrograms;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Press 1 to start Stopwatch");
                int start = scanner.nextInt();
                long startTime = System.currentTimeMillis();
                System.out.println("Press 2 to end Stopwatch");
                int end = scanner.nextInt();
                long endTime = System.currentTimeMillis();
                long elapsedTime = endTime - startTime;
                System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
                scanner.close();
            }
        }


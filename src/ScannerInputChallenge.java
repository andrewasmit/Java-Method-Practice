import java.util.Scanner;

public class ScannerInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loopCount = 1;
        int sum = 0;

        while (loopCount <= 5) {
            System.out.println("Enter number #" + loopCount + ':');
            String currentNum = scanner.nextLine();
            try {
                int num = Integer.parseInt(currentNum);
                loopCount++;
                sum += num;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The total sum of the 5 numbers is : " + sum);
    }
}

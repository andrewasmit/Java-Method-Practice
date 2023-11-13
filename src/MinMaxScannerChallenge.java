import java.util.Scanner;

public class MinMaxScannerChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number.");
        System.out.println("If you enter a non-numeric value, the game ends.");

        String firstNum = scanner.nextLine();
        int min = Integer.parseInt(firstNum);
        int max = Integer.parseInt(firstNum);
        boolean continueLoop = true;

        System.out.println("Enter another number");
        while(continueLoop) {
            try {
                String currentInput = scanner.nextLine();
                int currentNum = Integer.parseInt(currentInput);

                if(currentNum < min){
                    min = currentNum;
                }

                if(currentNum > max){
                    max = currentNum;
                }

                System.out.println("Enter another number");
            } catch (NumberFormatException nfe) {
                continueLoop = false;
            }
        }
        System.out.println("Max number inputted: " + max);
        System.out.println("Min number inputted: " + min);
    }
}

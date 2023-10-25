public class SumThreeFiveChallenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++){
            if(count == 5){
                break;
            }

            if (isDivisibleByThree(i) && isDivisibleByFive(i)){
                sum += i;
                count+=1;
                System.out.println(i + " is divisible by both 3 and 5.");
            }
        }
        System.out.println("The sum of the 5 numbers that meet that condition are " + sum);
    }

    public static boolean isDivisibleByThree(int num){
        return num % 3 == 0;
    }
    public static boolean isDivisibleByFive(int num){
        return num % 5 == 0;
    }
}

// Create a for loop using a range of 1 to 1000 inclusive
// Sum all the numbers that can be divisible by both 3 and 5
// Print out the numbers that meet the above condition
// Break out of the loop when you find 5 numbers that met the conditions
// After breaking out of the loop, print the sum of the numbers that met the conditions

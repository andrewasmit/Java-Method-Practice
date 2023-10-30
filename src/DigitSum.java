public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(258));
        System.out.println(sumDigits(2));
        System.out.println(sumDigits(27));
    }

    ;

    public static int sumDigits(int num){
        // Init a counter variable that += n as we go through the loop
        int counter = 0;

        // Use a while loop to grab last digit and parse accordingly
        while (num > 0 ){
            // Use num % 10 to grab the last num on the far right and add to counter
            int lastDigit = num % 10;
            counter += lastDigit;

            // USe num / 10 to drop that number while looping through
            num = num / 10;;
        }

        return counter;
    };

}

// Write a method called sumDigits that has a single param called num and return an int
// The method should only take a number that is positive
// If a negative number is passed, return -1
// The method should parse out each digit from the number and sum the digits up/

// EX: if 125 is passed to the method, the code should sum each digit =? 1 + 2 + 5 and return 8 as the answer
// EX: if 1000 is passed => 1 + 0 + 0 + 0  and return 1 as the answer

// If the number is a single digit number, just return the number

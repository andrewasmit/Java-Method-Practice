public class SwitchChallenge {
    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek(34569);

        printNumberInWord(0);
    }

    public static void printDayOfTheWeek(int day) {
        String dayOfWeek = switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println("Day: " + day + " is " + dayOfWeek);
    }

    public static void printNumberInWord(int number){
        String numberWord = switch(number){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "other";
        };
        System.out.println(numberWord);
    };
}

public class SwitchChallenge {
    public static void main(String[] args) {
        int day = 7;
        System.out.println("Day: " + day + " is " + printDayOfTheWeek(day));
    }

    public static String printDayOfTheWeek(int day) {
        return switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
    }
}

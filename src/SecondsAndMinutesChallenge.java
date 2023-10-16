public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println("Test for 60seconds: " + getDurationString(60));
        System.out.println("Test for 14400seconds: " + getDurationString(14400));
        System.out.println("Test for 3945seconds: " + getDurationString(3945));
        System.out.println("Test for 17minutes, 43seconds: " + getDurationString(17, 43));
        System.out.println("Test for 275minutes, 23seconds: " + getDurationString(275, 23));
    }

    public static String getDurationString(int seconds){
        if (seconds <= 0 ){
            System.out.println("Invalid Entry. Seconds must be a positive integer.");
        }

        int hours = 0;
        int minutes = 0;
        int secs = seconds;

        while (secs > 59){
            secs -=60;

            if(minutes == 59){
                minutes = 0;
                hours += 1;
            } else {
                minutes += 1;
            }
        }

        return hours + "h " + minutes + "m " + secs + "s ";
    }

    public static String getDurationString(int minutes, int seconds){
        if( minutes >= 0 && seconds >= 0 && seconds <=59){
            return getDurationString((minutes * 60) + seconds);
        } else
            return "Invalid Entry. Input must be a positive integer and seconds can not be more than 59.";
    }

}


// Create two methods with same name getDurationString
// First method has one parameter (int) named 'seconds'
// Second has two parameters (both are type int) named 'minutes' and 'seconds'
// Both methods return a String in the format of  'XXh YYm ZZs'
// X is hours, Y is minutes, and Z is seconds

// ** Second method should call the first **

// Validation
// first method should have parameters >=0
// second method should have minutes >= 0 and seconds >= 0 && <= 59
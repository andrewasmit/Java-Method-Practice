public class Switch {
    public static void main(String[] args){
        String month = "March";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "Bad";
        };
    }
}

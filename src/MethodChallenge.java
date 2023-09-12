public class MethodChallenge {
    public static void main(String[] args) {

        //Call both methods and display results for scores
        // 1500, 1000, 500, 100, and 25

        int p1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Andrew", p1);

        int p2 = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim", p2);

        int p3 = calculateHighScorePosition(500);
        displayHighScorePosition("Kailee", p3);

        int p4 = calculateHighScorePosition(100);
        displayHighScorePosition("Norah", p4);

        int p5 = calculateHighScorePosition(25);
        displayHighScorePosition("Juice Boi", p5);
    }

    public static int calculateHighScorePosition(int score){
        // Take in a player score and return a number 1-4
        // If greater than or equal to 1000 => 1
        //greater than or equal to 500 but less than 1000 =>2
        //greater than or equal to 100 but less than 500 => 3
        //else =>4

        if (score >= 1000){
            return 1;
        } else if
        (score >= 500){
            return 2;
        } else if
        (score >= 100){
            return 3;
        }

        return 4;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }
}

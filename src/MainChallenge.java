public class MainChallenge {
    public static void main(String[] args) {
        calculateScore();
    }

    public static void calculateScore(){
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 1;
        int bonus = 100;

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}

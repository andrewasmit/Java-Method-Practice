public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highScore = 50;
        if (highScore > 25){
            highScore = 1000 + highScore; //add bonus points
        }


        boolean gameOver = true;
        int score = 5000;
        int level = 1;

        if (gameOver && level == 1){
            System.out.println("Welcome to Level 1 newbie.");
        } else {
            System.out.println("Either you dead or you're past level 1.");
        }

    }
}

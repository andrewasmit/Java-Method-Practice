public class MethodOverloading {
    public static void main(String[] args){

       int newScore = calculateScore("Andrew", 69);
       System.out.println("New Score: " + newScore);

        int unknownNewScore = calculateScore(75);
       System.out.println("New Score: " + unknownNewScore);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player: " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore(){
        System.out.println("No player name and no points scored");
        return 0;
    }
}

public class whileLoopChallenge {
    public static void main(String[] args) {
        int start = 5;
        int evenCount = 0;
        int totalCount = 0;
        while (start <= 20){
            if(evenCount == 5){
                break;
            }

            if (isEvenNumber(start)){
                System.out.println(start);
                evenCount ++;
            }
            totalCount++;
            start++;
        }
        System.out.println("TOTAL: " + totalCount);
    }

    public static boolean isEvenNumber(int num){
        return num % 2 == 0;
    }
}

public class PrimeNumberRangeChallenge {
    public static void main(String[] args) {
        findPrimes(1,9);
    }

    public static void findPrimes(int minRange, int maxRange){
        if(maxRange >1000) {
            System.out.println("Range invalid. Max is too high.");
        }

        int primeCounter = 0;

        for(int i=minRange; i<=maxRange; i++){
            if (primeCounter == 3){
                break;
            }

            if(isPrime(i)){
                System.out.println(i + " is a prime number!");
                primeCounter++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){

            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor < wholeNumber; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }

        return true;
    }
}

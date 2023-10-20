public class ForPractice {

    public static void main(String[] args){
        for (int i = 0; i <5; i++){
            System.out.println(i);
        }

        for (double rate = 7.5; rate <= 10; rate+= 0.25){
            double interestAmount = calculateInterest(100.0, rate);
            System.out.println("100 at " + rate + "% interest = " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}

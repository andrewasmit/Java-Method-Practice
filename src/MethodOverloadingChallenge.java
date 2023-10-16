public class MethodOverloadingChallenge {
    public static void main(String[] args){
        System.out.println("5ft, 8in = " + convertToCentimeters(5,8 )+ "cm");
        System.out.println("68in = " + convertToCentimeters(68 )+ "cm");
    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        int inchesFromFeet = feet * 12;
        int totalInches = inches + inchesFromFeet;
        return convertToCentimeters(totalInches);
    }
}

// Write two method with the same name: concertToCentimeters
// First, write a method with one type (int) which represents the entire height in inches
// conv ert the entire height (int) to centimeters and return it as a double

// Second, write a method with two parameters (int); one that represents height and one that represents inches.
// Concert the first parameter of feet to inches, add it to whatever inches are already there, and call the first method
// to return the centimeters as a double

// 1 inch = 2.54cm
public class LeastCommonDenominator {

    public static void main(String[] args) {
        int numerator1 = 1; // Example numerator 1
        int denominator1 = 3; // Example denominator 1
        int numerator2 = 2; // Example numerator 2
        int denominator2 = 5; // Example denominator 2
        
        int lcd = findLCD(denominator1, denominator2);
        
        System.out.println("The Least Common Denominator of " + denominator1 + " and " + denominator2 + " is: " + lcd);
    }

    // Method to find the Least Common Denominator
    public static int findLCD(int denom1, int denom2) {
        return lcm(denom1, denom2);
    }

    // Recursive method to find the Greatest Common Divisor (GCD)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to find the Least Common Multiple (LCM) using GCD
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
}

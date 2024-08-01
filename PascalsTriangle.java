public class PascalsTriangle {

    // Recursive function to calculate the value at position (i, j) in Pascal's Triangle
    public static int pascal(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }

    // Recursive function to print the triangle
    public static void printTriangle(int n, int i, int j) {
        // Base case: When the entire triangle is printed
        if (i >= n) {
            return;
        }
        
        // Print spaces for proper formatting
        printSpaces(n - i - 1);

        // Print the ith row
        printRow(i, j);

        // Move to the next row
        System.out.println();
        printTriangle(n, i + 1, 0);
    }

    // Helper function to print spaces
    public static void printSpaces(int count) {
        if (count == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(count - 1);
    }

    // Helper function to print a row
    public static void printRow(int i, int j) {
        if (j > i) {
            return;
        }
        System.out.print(pascal(i, j) + " ");
        printRow(i, j + 1);
    }

    public static void main(String[] args) {
        int n = 5; // Number of rows to print
        printTriangle(n, 0, 0);
    }
}

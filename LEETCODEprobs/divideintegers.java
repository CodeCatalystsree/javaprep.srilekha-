


import java.util.Scanner;

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Perform normal division
        int sol = (int)(dividend / divisor);
        return sol;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Input values
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dividend: ");
        int dividend = scanner.nextInt();
        
        System.out.println("Enter divisor: ");
        int divisor = scanner.nextInt();
        
        // Call the divide function
        int result = solution.divide(dividend, divisor);
        
        // Output the result
        System.out.println("Result of division: " + result);
    }
}



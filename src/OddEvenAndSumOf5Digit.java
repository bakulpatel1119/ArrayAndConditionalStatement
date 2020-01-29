// THIS PROGRAMME WILL COUNT TOTAL NUMBER OF ODD AND EVEN DIGIT OF THE ENTERED NUMBER.

// STILL I AM WORKING TO PRINT SUM OF ENTERED DIGIT AS PER HOMEWORK GIVEN

import java.util.Scanner;

public class OddEvenAndSumOf5Digit {

            static int countEvenOdd(int n)
        {
            int even_count = 0;
            int odd_count = 0;
            while (n > 0)
            {
                int rem = n % 10;
                if (rem % 2 == 0)
                    even_count++;
                else
                    odd_count++;
                n = n / 10;
            }
    // PRINT RESULT
            System.out.println ( "Even count : " +
                    even_count);
            System.out.println ( "Odd count : " +
                    odd_count);

            if (even_count % 2 == 0 &&
                    odd_count % 2 != 0)
                return 1;
            else
                return 0;
        }

        // MAIN METHOD
        public static void main (String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter any 5 digit value : ");
            int n = scanner.nextInt();
            int t = countEvenOdd(n);

           }
}
// END OF PROGRAMME
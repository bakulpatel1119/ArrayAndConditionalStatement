
// THIS PROGRAMME WILL ASK YOU TO ENTER INPUT HOW MANY TERMS YOU WOULD LIKE TO SEE FIBONACCI SEQUENCE STARTING FROM 1.


// EXP. IF YOU ENTER 5 TERMS, THEN ANSWER WILL BE  : 1 1 2 3 5

import java.util.Scanner;

public class FibonacciNumber {

    // MAIN METHOD

    public static void main(String[] args)
    {
        // SCANNER OBJECT CREATED TO INPUT USER DATA

        Scanner scanner = new Scanner(System.in);

               System.out.println("Please enter for how many terms you would like to see Fibonacci Sequence");

        // VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER

               int end = scanner.nextInt();


        int n = end, t1 = 1, t2 = 1;
        System.out.print("First " + end + " terms: ");
        for (int i = 1; i <= end; ++i)
        {
            System.out.print(t1 + "  ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

    }

}

// END OF PROGRAMME
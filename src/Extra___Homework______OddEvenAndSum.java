
// THIS IS EXTRA PROGRAMME (NOT PART OF HOMEWORK)
// TO CHECK HOW MANY NUMBERS OF ELEMENTS ARE EVEN OR ODD AND SUM OF ALL ARRAY

import java.util.Scanner;

public class Extra___Homework______OddEvenAndSum
{
    public static void main(String[] args)

    // MAIN METHOD

    {
        int Size=5;
        int evenCount = 0, oddCount = 0;
    // SCANNER OBJECT CREATED TO INPUT USER DATA

        Scanner scanner = new Scanner(System.in);


        int [] a = new int[Size];

        System.out.println(" Please Enter " + Size + " elements of an Array  : ");
        for (int i = 0; i < Size; i++)
        {
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < Size; i++)
        {
            if(a[i] % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        // TO PRINT RESULTS
        System.out.println("\n Total Number of Even Numbers in this Array = " + evenCount);
        System.out.println("\n Total Number of Odd  Numbers in this Array = " + oddCount);

        int sum = 0;
        for (int e : a)
            sum += e;
        System.out.println("\n Total of all 5 Array Element is "+sum);
            }

}
// END OF PROGRAMM
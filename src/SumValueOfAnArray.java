// PROGRAMME TO GET SUM VALUES OF AN ARRAY.


import java.util.Scanner;

public class SumValueOfAnArray
{

// MAIN METHOD
    public static void main(String[] args)
    {

        // SCANNER OBJECT CREATED TO INPUT USER DATA
        Scanner scanner = new Scanner(System.in);

        System.out.println("Confirm many inputs you would like to enter to get SUM");

        // VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER
       int arraySelect = scanner.nextInt();


        int[] array = new int[arraySelect];
        int sum = 0;
        System.out.println("Enter values");
        for (int i=0; i<arraySelect; i++)
        {
            array[i] = scanner.nextInt();
        }
        for( int num : array) {
            sum = sum+num;
        }

        // THIS CODE WILL PRINT RESULT
        System.out.println("Sum of Array Elements is : " +sum);

    }
}
// END OF PROGRAMME
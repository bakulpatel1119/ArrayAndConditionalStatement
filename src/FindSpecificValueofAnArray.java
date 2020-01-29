
// THIS PROGRAMME WILL ASK YOU TO ENTER HOW MANY INPUT YOU WOULD LIKE TO ENTER
// EXP. IF YOU ENTER 5, THEN YOU CAN ENTER 5 VALUES
// THEN PROGRAMMER WILL ASK YOU WHICH SPECIFIC VALUE YOU WOULD LIKE TO CHECK AND THE WILL GIVE YOU AN ANSWER
import java.util.Scanner;

public class FindSpecificValueofAnArray {

    // MAIN METHOD

    public static void main(String[] args)

    {
        // SCANNER OBJECT CREATED TO INPUT USER DATA
        Scanner scanner = new Scanner(System.in);
        System.out.println("Confirm number of Input to enter");

// VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER
        int arraySelect1 = scanner.nextInt();
        int[] array = new int[arraySelect1];

        int sum = 0;
        System.out.println("Enter Values");

        for (int i=0; i<arraySelect1; i++)
        {
            array[i] = scanner.nextInt();
        }

        System.out.println("Please enter any specific value, if you would like to check if array contains or not?");
        int toFind = scanner.nextInt();
        boolean found = false;

        for (int specificValue : array)

        {
            if (specificValue == toFind)
            {
                found  =   true;
            break;
            }
        }
// THIS CODE WILL PRINT THE RESULT
            if(found)
                System.out.println(toFind+" is Found");
            else
                System.out.println(toFind+ " is not Found");
    }

}

//END OF PROGRAMME
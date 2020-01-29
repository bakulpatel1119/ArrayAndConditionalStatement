// THIS PROGRAMME WILL SORT ANY FIVE VALUE OF NUMERIC AND STRING ARRAY IN ASCENDING ORDER

// THIS PROGRAMME WILL ASK TO CONFIRM YOUR CHOICE TO SORT NUMERIC OR STRING VALUE (N = NUMERIC OR S=STRING)

// YOU CAN THEN ENTER 5 VALUE OF NUMERIC OR STRING ARRAY AS PER YOUR CHOICE.

import java.util.Arrays;
import java.util.Scanner;

public class SortNumericAndStringArray
{
    // MAIN METHOD

    public static void main(String[] args)
    {
        // SCANNER OBJECT CREATED TO INPUT USER DATA

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your choice to sort Numeric Value OR String");
        System.out.println("(Select N for Numeric Sorting OR S for string sorting)");

        // VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER
        String choice = scanner.next().toUpperCase();
        char ch1 = choice.charAt(0);

        // USED SWITCH CONDITION TO GET RESULT
        switch (ch1)
        {
            case 'N' :
                System.out.println("Enter 5 Numeric Values");
                int value1 = scanner.nextInt();
                int value2 = scanner.nextInt();
                int value3 = scanner.nextInt();
                int value4 = scanner.nextInt();
                int value5 = scanner.nextInt();

                int[] arrValue = {value1, value2, value3, value4, value5};
                System.out.println("Original numeric array : "+ Arrays.toString(arrValue));
                Arrays.sort(arrValue);
                System.out.println("Sorted numeric array :" + Arrays.toString(arrValue));
                break;

            case 'S':
                System.out.println("Enter 5 Strings");
                String name1 = scanner.next();
                String name2 = scanner.next();
                String name3 = scanner.next();
                String name4 = scanner.next();
                String name5 = scanner.next();

                String [] arrValue1 = {name1, name2, name3, name4, name5};

                // THIS CODE WILL PRINT RESULT

                System.out.println("Original numeric array : "+ Arrays.toString(arrValue1));
                Arrays.sort(arrValue1);
                System.out.println("Sorted numeric array :" + Arrays.toString(arrValue1));
                break;

            default:
                System.out.println("Invalid choice ==== Select N for Numeric Sorting OR S for string sorting");
        }
    }
}
// END OF PROGRAMME
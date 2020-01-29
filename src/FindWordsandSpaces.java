// THIS PROGRAMME IS TO COUNT NUMBER OF SPACES AND WORDS OF THE INPUT STRING

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class FindWordsandSpaces
{
// MAIN METHOD
    public static void main(String[] args)
    {
        // SCANNER OBJECT CREATED TO INPUT USER DATA

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any String");

        // VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER

        String data = input.nextLine();
        int cnt = 0;
        int wrd = 0;
        System.out.println(data);
        for (int i = 0; i < data.length() - 1; i++)
        {
            if (data.charAt(i) == ' ')
            {
                cnt++;
            }

        }
        // WILL PRINT THE RESULT
        System.out.println("Total number of Spaces in a given String are : " + cnt);

       int word = cnt+1;
        System.out.println("Total number of words in a given String are  : " + word);
    }
}
// END OF PROGRAMME

// PROGRAMME TO COUNT LOWERCASE CHARACTER 'a' FROM INPUT STRING

import java.util.Scanner;

public class Count_A_in_String

    {
        // MAIN METHOD
    public static void main(String[] args)
    // BELOW WILL PRINT IF ENTERED NUMBER IS ARMSTRONG OR NOT
    {
        System.out.println();
        System.out.println("PROGRAMME TO COUNT LOWERCASE CHARACTER 'a' FROM INPUT STRING");
        System.out.println();
        System.out.println("Enter any String to count character 'a'");

        // SCANNER OBJECT CREATED TO INPUT USER DATA

        Scanner scan=new Scanner(System.in);

        // VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER
        String input = scan.nextLine();
        char [] ch = input.toCharArray();

        // FORMULA TO FIND AND COUNT LOWERCASE 'a' FROM INPUT STRING
        int count=0;
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i]=='a')
            {
                count++;

            }
        }
        System.out.println(count++);
    }

}
// END OF PROGRAMME
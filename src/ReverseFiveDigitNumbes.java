// PROGRAMME TO REVERSE ANY 5 DIGIT VALUE INPUT BY USER

import java.util.Scanner;

public class ReverseFiveDigitNumbes {

    // MAIN METHOD

    public static void main(String[] args)
    {
        int num=0;
        int reversenum =0;
        System.out.println("Input any FIVE digit number: ");

        // SCANNER OBJECT CREATED TO INPUT USER DATA
        Scanner in = new Scanner(System.in);

        // VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER
        num = in.nextInt();


        // WHILE LOOP : LOGIC TO FIND REVERSE NUMBER
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }
// THIS CODE WILL PRINT RESULT
        System.out.println("Reverse of input number is: "+reversenum);
    }
}
// END OF PROGRAMME
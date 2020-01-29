//  THIS PROGRAMME WILL GIVE YOU AN ANSWER IF ENTERED 3 DIGIT NUMBER IS ARMSTRONG NUMBER OR NOT

// Armstrong number is a number that is equal to the sum of cubes of its digits.

import java.util.Scanner;

public class ArmstrongNumber {

    // MAIN METHOD
    public static void main(String[] args)

    {
        int num, number, temp, total = 0;

        // SCANNER OBJECT CREATED TO INPUT USER DATA
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ënter any 3 Digit Number");

        // VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER
        num = scanner.nextInt();
        scanner.close();
        number = num;

        // FORMULA TO FIND ARMSTRONG NUMBER

        for( ;number!=0;number /= 10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }
        // BELOW WILL PRINT IF ENTERED NUMBER IS ARMSTRONG OR NOT

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
// END OF PROGRAMME
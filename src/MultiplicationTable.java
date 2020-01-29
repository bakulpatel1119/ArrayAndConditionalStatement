// THIS PROGRAMME WILL PRINT MULTIPLICATION TABLE

import java.util.Scanner;

public class MultiplicationTable {

    // MAIN METHOD

    public static void main(String[] args)

    {
        // SCANNER OBJECT CREATED TO INPUT USER DATA

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter for how long you would like to print time table");

        // VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER

        int endNum = scanner.nextInt();

        System.out.print("Multiplication table\n");

        // FORMULA USED TO PRINT MULTIPLICATION TABLE

        int i=1;
        while(i<=endNum){
            int j=1;
            while(j<=endNum){
                System.out.print(i*j+"\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
// END OF PROGRAMME
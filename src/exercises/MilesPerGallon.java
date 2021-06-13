package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        double numOfMiles;
        double gallonsOfGas;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        numOfMiles = input.nextDouble();
        System.out.println("How many gallons of gas did you use?");
        gallonsOfGas = input.nextDouble();
        input.close();

        mpg = (numOfMiles/gallonsOfGas);
        System.out.println("Miles per gallon: "+mpg);
    }
}

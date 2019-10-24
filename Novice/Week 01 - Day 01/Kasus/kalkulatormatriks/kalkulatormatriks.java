package kalkulatormatriks;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class kalkulatormatriks {

    public static void main(String[] args) {
        

        System.out.println("This is simple multidimensional matriks calculator");
        System.out.println("By nostalgeek");
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many element in matriks A horizontal position");
        int inputX = Integer.parseInt(scan.nextLine());
        System.out.println("Enter how many element in matriks A vertical position");
        int inputY = Integer.parseInt(scan.nextLine());
        System.out.println("=====================================================");
        int matriksA[][] = new int[inputX][inputY];
        int matriksB[][] = new int[inputX][inputY];
        int matriksRes[][] = new int [inputX][inputY];
        System.out.println("Matriks A new range is " + inputX + "|" + inputY);
        System.out.println("Matriks B new range is " + inputX + "|" + inputY);
        System.out.println("Now input each element in matriks A & B");

        System.out.println("Input for matriks A");
        System.out.println("===================");
        for (int x = 0; x < inputX; x++) {
            for (int y = 0; y < inputY; y++) {
                System.out.println("Enter new element in matriks A " + x + "|" + y);
                matriksA[x][y] =  Integer.parseInt(scan.nextLine());
            }
        }

        System.out.println("Input for matriks B");
        System.out.println("===================");
        for (int x = 0; x < inputX; x++) {
            for (int y = 0; y < inputY; y++) {
                System.out.println("Enter new element in matriks B " + x + "|" + y);
                matriksB[x][y] =  Integer.parseInt(scan.nextLine());
            }
        }

        StringBuilder resTemp = new StringBuilder("Matriks Result = ");

        System.out.println("Calculate each element in matriks A & B");
        System.out.println("=======================================");
        for (int x = 0; x < inputX; x++) {
            for (int y = 0; y < inputY; y++) {
                matriksRes[x][y] =  matriksA[x][y] + matriksB[x][y];
                resTemp.append(Integer.toString(matriksRes[x][y]) + "|");
            }
        }

        System.out.println(resTemp);

    }
}
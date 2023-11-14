
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int arraySize;

        System.out.print("quantos números voce vai digitar? ");
        arraySize = sc.nextInt();
        double[] array = new double[arraySize];


        for (int i = 0; i < arraySize; i++) {
            System.out.print("Digite um número: ");
            array[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < arraySize; i++) {
            sum += array[i];
        }
        double average = sum / arraySize;

        System.out.print("Valores: ");
        printaArray(array);

        System.out.println("\nSoma: " + sum);
        System.out.println("media = " + average);
        sc.close();
    }


    public static void printaArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos números voce vai digitar? ");
        n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("NÚMEROS PARES: ");
        int nPares;
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                nPares = numeros[i];
                System.out.print(nPares + " ");
            }
        }

        System.out.println();


        int par = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                par++;
            }
        }

        System.out.println("QUANTIDADE DE PARES = " + par);

        sc.close();
    }
}
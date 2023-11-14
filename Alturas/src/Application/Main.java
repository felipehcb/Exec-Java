package Application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    // tipo[] nomeVariavel = new tipo[];

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += altura[i];
        }
        double media = soma / altura.length;
        System.out.printf("Altura média: %.2f%n", media);

        int porcentagem = 0;
        int menores = 0;
        String nomeMenores;

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                menores++;
                porcentagem = (100 * menores / n);
            }
        }
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");


        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                nomeMenores = name[i];
                System.out.println(nomeMenores);
            }

        }


        sc.close();
    }
}
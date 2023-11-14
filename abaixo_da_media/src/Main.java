import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
            for(int i=0; i<n; i++){
                System.out.print("Digite um número: ");
                vect[i] = sc.nextDouble();
            }

        double media;
        double soma = 0.0;

            for(int i=0; i<n; i++){
               soma += vect[i];
            }
        media = soma / vect.length;
        System.out.println();
        System.out.printf("MÉDIA DO VETOR: %.3f%n", media);


        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        double abaixo;
        for(int i=0; i<n; i++){
            if(vect[i] < media){
                abaixo = vect[i];
                System.out.println(abaixo);
            }
        }

        sc.close();
    }
}
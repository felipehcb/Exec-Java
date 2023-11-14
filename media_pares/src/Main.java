import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int somaPar = 0, par = 0,nenhumPar = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
            for(int i=0; i<n; i++){
                System.out.print("Digite um número: ");
                vect[i] = sc.nextInt();
            }

        for(int i=0; i<n; i++){
            if(vect[i] % 2 == 0){
                par++;
            }
        }

        for(int i=0; i<n; i++){
            if(vect[i] % 2 == 0){
                somaPar += vect[i];
                nenhumPar++;
            }
        }

        if(nenhumPar == 0){
            System.out.println("NENHUM NÚMERO PAR");
        }else{
            System.out.println();
            double media = (double) somaPar / par;
            System.out.printf("MEDIA DOS PARES = %.1f%n", media);
        }

        sc.close();
    }
}
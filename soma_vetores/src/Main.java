import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, valorA, valorB;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();


        System.out.println("Digite os valores do vetor A: ");
        int[] vectA = new int[n];
            for(int i=0; i<n; i++){
                vectA[i] = sc.nextInt();
            }

        System.out.println("Digite os valores do vetor B: ");
        int[] vectB = new int[n];
            for(int i=0; i<n; i++){
                vectB[i] = sc.nextInt();
            }

            int[] vectC = new int[n];
            for(int i=0; i<n; i++){
                valorA = vectA[i];
                valorB = vectB[i];

               vectC[i] = valorA + valorB;
               
                System.out.println("VETOR RESULTANTE: " + vectC[i]);
            }
        sc.close();
    }
}
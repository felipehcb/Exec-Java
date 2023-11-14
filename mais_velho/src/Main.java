import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, maisVelha, posmaior;

        System.out.print("Quantas pessoas você vai digitar? ");
        n = sc.nextInt();

        String[] vetorNome = new String[n];
        int[] vetorIdade = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Dados da "+(i + 1)+"a pessoa:");
            System.out.print("Nome: ");
            vetorNome[i] = sc.next();
            System.out.print("Idade: ");
            vetorIdade[i] = sc.nextInt();
        }

        maisVelha = vetorIdade[0];
        posmaior = 0;

            for(int i=1; i<n; i++){
                if(vetorIdade[i]>maisVelha){
                    maisVelha = vetorIdade[i];
                    posmaior = i;
                }
            }

        System.out.printf("PESSOA MAIS VELHA: %s\n", vetorNome[posmaior]);

        sc.close();


    }

}
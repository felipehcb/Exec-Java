import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos alunos serão digitados? ");
        n = sc.nextInt();

        String[] vetorNome = new String[n];
        double[] vetorNota1 = new double[n];
        double[] vetorNota2 = new double[n];

        for(int i=0; i<n; i++){
            System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno: ");
            vetorNome[i] = sc.nextLine();
            sc.nextLine();
            vetorNota1[i] = sc.nextDouble();
            vetorNota2[i] = sc.nextDouble();
        }






        sc.close();
    }
}
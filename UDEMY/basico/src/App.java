//import java.util.Locale;

//import java.util.Scanner;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /*  int y = 32;
        System.out.println(y);
        System.out.println("bom dia!"); 
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x); // pra delimitar as casas decimais
        System.out.printf("%.4f%n", x); 
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x); // formatado em US, trocou a (,) por (.)
        System.out.println("---------------------------");
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS%n", x);
        System.out.println("---------------------------");
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        System.out.println("--------------------------------------------------");*/

        //Scanner ler = new Scanner(System.in);
        //System.out.println("Digite seu nome: ");
        //String nome = ler.nextLine();
        //System.out.println("Seu nome é: " +nome);
           
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("vc digitou: " +x );
         
        sc.close();


    }
}

/* %f = ponto flutuante
 * %d = inteiro
 * %s = texto 
 * %n = quebra de linha
 */

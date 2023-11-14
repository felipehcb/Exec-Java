import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Scanner sc = new Scanner(System.in);
         *
         *
         * EXERCÍCIO 03 - MÓDULO 4
         *
         * int a, b, c, d;
         * int dif;
         *
         * a = sc.nextInt();
         * b = sc.nextInt();
         * c = sc.nextInt();
         * d = sc.nextInt();
         *
         * dif = (a * b - c * d);
         *
         * System.out.println("A diferença é: ");
         * System.out.println(dif);
         *
         * sc.close();
         */

        // EXERCÍCIO 04 - MÓDULO 4

        /*
         * Scanner sc = new Scanner(System.in);
         *
         * int numFun;
         * double valorHora, horasTrab, calcSal;
         *
         * numFun = sc.nextInt();
         * horasTrab = sc.nextInt();
         * valorHora = sc.nextDouble();
         * calcSal = (horasTrab * valorHora);
         *
         * System.out.printf("O número do funcionário é: ");
         * System.out.println(numFun);
         * System.out.println("O salário é: ");
         * System.out.println(calcSal);
         *
         *
         * sc.close();
         */

        // EXERCÍCIO 05 - MÓDULO 4

        /*
         * Scanner sc = new Scanner(System.in);
         *
         * int codPeca1, numPeca1, codPeca2, numPeca2;
         * double valorPeca1, valorPeca2, valorFinal, calc, calc2;
         *
         * codPeca1 = sc.nextInt();
         * numPeca1 = sc.nextInt();
         * valorPeca1 = sc.nextDouble();
         * codPeca2 = sc.nextInt();
         * numPeca2 = sc.nextInt();
         * valorPeca2 = sc.nextDouble();
         *
         * calc = (numPeca1 * valorPeca1);
         * calc2 = (numPeca2 * valorPeca2);
         * valorFinal = (calc + calc2);
         *
         * System.out.printf("Valor a pagar: R$ %.2f %n",valorFinal);
         *
         * sc.close();
         */


        // SEÇÃO 05 - ESTRUTURA CONDICIONAL


       /* Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");

        } else if (hora < 18) {
            System.out.println("Boa tarde!");

        } else {
            System.out.println("Boa noite!");

        }

        sc.close();*/

        // EXERCÍCIO 01 ESTRUTURA CONDICIONAL

        /*Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Informe o número: ");
        num = sc.nextInt();

        if (num <= 0){
            System.out.println("Número negativo");
        }else{
            System.out.println("Número positivo");
        }
        sc.close();
        */
        // -----------------------------------------------------------

        // EXERCÍCIO 02

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        sc.close();*/

        // ------------------------------------------------------------

        // EXERCÍCIO 03

        /*Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        if(a % b == 0 || b % a == 0){
            System.out.println("Múltiplos");
        }else {
            System.out.println("Não múltiplos");
        }

        sc.close();*/

        /*Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal;

        System.out.println("Horário do início do jogo: ");
        horaInicial = sc.nextInt();
        System.out.println("Horário do final do jogo: ");
        horaFinal = sc.nextInt();

        int duracao;


        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");


        sc.close();*/

        /*Scanner sc = new Scanner(System.in);

        System.out.println("------ Cardápio ------");
        System.out.println("1- Cachorro Quente - R$4,00");
        System.out.println("2- X-Salada - R$4,50");
        System.out.println("3- X-Bacon - R$5,00");
        System.out.println("4- Torrada Simples - R$2,00");
        System.out.println("5- Refrigerante - R$1,50");

        int codigo, quantidade;
        double total;

        System.out.println("Digite o código do seu pedido:");
        codigo = sc.nextInt();
        System.out.println("Qual a quantidade?");
        quantidade = sc.nextInt();

        if(codigo == 1){
            total = quantidade * 4.00;
        }else if (codigo == 2){
            total = quantidade * 4.50;
        }else if (codigo == 3){
            total = quantidade * 5.00;
        }else if(codigo == 4){
            total = quantidade * 2.00;
        }else{
            total = quantidade * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n ", + total);

        sc.close();*/

        // --------------------------------------------------------------------------------

        /*System.out.println("SWITCH CASE");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "valor inválido";
                break;

        }
        System.out.println("Dia da semana: " + dia);
        sc.close();*/

        /*double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);*/

        // WHILE

        /*Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;
        while (x != 0){
            soma = soma + x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();*/

        // EXERCÍCIO 01 WHILE

        /*Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");
        sc.close()*/

        // EXERCÍCIO 02 WHILE

        /*Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 && y != 0){

            if(x>0 && y>0){
                System.out.println("primeiro");
            }else if(x<0 && y>0){
                System.out.println("segundo");
            }else if(x<0 && y<0){
                System.out.println("terceiro");
            }else{
                System.out.println("quarto");
            }
             x = sc.nextInt();
             y = sc.nextInt();

        }
            sc.close();*/

        // EXERCÍCIO 03 WHILE

        /*Scanner sc = new Scanner(System.in);


        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int cod = sc.nextInt();

        while(cod != 4){

            if(cod == 1){
                alcool = alcool + 1;
            }else if(cod == 2){
                gasolina = gasolina + 1;
            }else if(cod == 3){
                diesel = diesel + 1;
            }
            cod = sc.nextInt();

        }
        System.out.println("Muito obrigado");
        System.out.println("Alcool " + alcool);
        System.out.println("Gasolina " + gasolina);
        System.out.println("Diesel " + diesel);

        sc.close();*/

        // FOR

        /*Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;
        for (int i=0; i<N; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);

        for (int = i=0; i<5; i++)

        sc.close();*/

       /* for (int i=0; i<5; i++){
            System.out.println("Valor de i: " + i);
        }*/

        // EXERCÍCIO 01 FOR

       /* Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();

         for (int i=1; i<x; i++)

             if(i % 2 != 0){
                 System.out.println(i);
             }
          sc.close();*/


        // EXERCÍCIO 02

        /*Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int in =0;
        int out=0;

        for (int i=0; i<N; i++) {
            int x = sc.nextInt();

            if(x >= 10 && x <= 20 ) {
               in =  in + 1;
            }else{
                out = out + 1;
            }
        }

        System.out.println("in = "+ in);
        System.out.println("out = "+ out);

        sc.close();*/

        // EXERCICIO 03
        /*Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {

            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();

            double media =( a*2.0 + b * 3.0 + c * 5.0)/ 10.0;

            System.out.printf("%.1f%n", media);
        }

        sc.close();*/


        // EXERCÍCIO 04

        /*Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=0; i<N; i++){

            double a = sc.nextInt();
            double b = sc.nextInt();

            double res = a / b;

            if(b == 0){
                System.out.println("Divisão impossível");
            }

            System.out.println(res);
        }

        sc.close();*/

        // DO WHILE

        /*Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        char resp;
        do{
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.println("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        }while (resp != 'n');
        sc.close();*/


    }
}

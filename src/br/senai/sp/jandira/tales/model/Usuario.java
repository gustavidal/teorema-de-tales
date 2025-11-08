package br.senai.sp.jandira.tales.model;

import java.util.Scanner;

public class Usuario {

    double segA;
    double segB;
    double segC;
    double segD;

    Scanner leitor = new Scanner(System.in);

    public void receberDecisao(){
        int decisao;

        System.out.println("");

        System.out.println("Vamos calcular razões!");
        System.out.println("Sabendo da fórmula do Teorema de Tales (A/B = C/D), escolha uma:");
        System.out.println("[1] Descobrir o valor de um segmento");
        System.out.println("[2] Verificar a proporcionalidade entre segmentos");
        System.out.print("Digite 1 ou 2: ");
        decisao = leitor.nextInt();

        System.out.println("");

        if (decisao == 1){
            definirSegmento();
        } else if (decisao == 2){
            verificarProporcao();
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public void definirSegmento(){
        int segmento;

        System.out.println("[1] A");
        System.out.println("[2] B");
        System.out.println("[3] C");
        System.out.println("[4] D");
        System.out.print("Você quer descobrir o valor de qual segmento acima (Permitido somente 1 opção)? ");
        segmento = leitor.nextInt();

        System.out.println("");

        if (segmento == 1){
            System.out.println("Vamos descobrir o valor do segmento A!");
            System.out.print("Informe o valor de B: ");
            segB = leitor.nextDouble();

            System.out.print("Informe o valor de C: ");
            segC = leitor.nextDouble();

            System.out.print("Informe o valor de D: ");
            segD = leitor.nextDouble();

            segA = (segB * segC) / segD;

            System.out.println("");
            System.out.println("O valor do segmento A é " + segA);
        } else if (segmento == 2){
            System.out.println("Vamos descobrir o valor do segmento B!");
            System.out.print("Informe o valor de A: ");
            segA = leitor.nextDouble();

            System.out.print("Informe o valor de C: ");
            segC = leitor.nextDouble();

            System.out.print("Informe o valor de D: ");
            segD = leitor.nextDouble();

            segB = (segA * segD) / segC;

            System.out.println("");
            System.out.println("O valor do segmento B é " + segB);
        } else if (segmento == 3){
            System.out.println("Vamos descobrir o valor do segmento C!");
            System.out.print("Informe o valor de A: ");
            segA = leitor.nextDouble();

            System.out.print("Informe o valor de B: ");
            segB = leitor.nextDouble();

            System.out.print("Informe o valor de D: ");
            segD = leitor.nextDouble();

            segC = (segA * segD) / segB;

            System.out.println("");
            System.out.println("O valor do segmento C é " + segC);
        } else if (segmento == 4){
            System.out.println("Vamos descobrir o valor do segmento D!");
            System.out.print("Informe o valor de A: ");
            segA = leitor.nextDouble();

            System.out.print("Informe o valor de B: ");
            segB = leitor.nextDouble();

            System.out.print("Informe o valor de C: ");
            segC = leitor.nextDouble();

            segD = (segB * segC) / segA;

            System.out.println("");
            System.out.println("O valor do segmento D é " + segD);
        } else {
            System.out.println("Segmento inexistente!");
        }
    }

    public void verificarProporcao(){
        System.out.println("Vamos verificar a proporção entre as razões!");
        System.out.print("Informe o valor do segmento A: ");
        segA = leitor.nextDouble();

        System.out.print("Informe o valor do segmento B: ");
        segB = leitor.nextDouble();

        System.out.print("Informe o valor do segmento C: ");
        segC = leitor.nextDouble();

        System.out.print("Informe o valor do segmento D: ");
        segD = leitor.nextDouble();

        System.out.println("");

        if (segA == 0 || segB == 0 || segC == 0 || segD == 0){
            System.out.println("Você definiu um segmento como 0.");
            System.out.println("Você será redirecionado para descobrir o valor de um segmento...");
            System.out.println("");

            definirSegmento();
        } else {
            calcularRazoes();
        }
    }

    public void calcularRazoes(){
        double razaoAB = segA / segB;
        double razaoCD = segC / segD;

        System.out.printf("Razão de A e B: %.4f%n", razaoAB);
        System.out.printf("Razão de C e D: %.4f%n", razaoCD);
        System.out.println("");

        if (Math.abs(razaoAB - razaoCD) < 0.0001 ){
            System.out.println("Os segmentos são proporcionais - valores válidos!");
        } else {
            System.out.println("Os segmentos NÃO são proporcionais - valores inválidos!");
        }
    }
}

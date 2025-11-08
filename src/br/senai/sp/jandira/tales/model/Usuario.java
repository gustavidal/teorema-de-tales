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
        System.out.print("Você quer descobrir o valor de qual segmento acima? ");
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

        } else if (segmento == 2){
            System.out.println("Vamos descobrir o valor do segmento B!");
            System.out.print("Informe o valor de A: ");
            segA = leitor.nextDouble();

            System.out.print("Informe o valor de C: ");
            segC = leitor.nextDouble();

            System.out.print("Informe o valor de D: ");
            segD = leitor.nextDouble();

        } else if (segmento == 3){
            System.out.println("Vamos descobrir o valor do segmento C!");
            System.out.print("Informe o valor de A: ");
            segA = leitor.nextDouble();

            System.out.print("Informe o valor de B: ");
            segB = leitor.nextDouble();

            System.out.print("Informe o valor de D: ");
            segD = leitor.nextDouble();

        } else if (segmento == 4){
            System.out.println("Vamos descobrir o valor do segmento D!");
            System.out.print("Informe o valor de A: ");
            segA = leitor.nextDouble();

            System.out.print("Informe o valor de B: ");
            segB = leitor.nextDouble();

            System.out.print("Informe o valor de C: ");
            segC = leitor.nextDouble();

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

    }
}

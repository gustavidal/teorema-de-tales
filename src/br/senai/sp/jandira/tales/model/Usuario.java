package br.senai.sp.jandira.tales.model;

import java.util.Scanner;

public class Usuario {

    int decisao;

    Scanner leitor = new Scanner(System.in);

    public void receberDecisao(){
        System.out.println("Vamos calcular razões!");
        System.out.println("Entre as opções abaixo, escolha uma:");
        System.out.println("[1] Descobrir o valor de um segmento");
        System.out.println("[2] Verificar a proporcionalidade entre segmentos");
        System.out.print("Digite 1 ou 2: ");
        decisao = leitor.nextInt();
    }
}

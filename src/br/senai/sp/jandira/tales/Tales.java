package br.senai.sp.jandira.tales;

import br.senai.sp.jandira.tales.model.Usuario;

public class Tales {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Usuario usuario = new Usuario();

        usuario.obterDados();
    }
}
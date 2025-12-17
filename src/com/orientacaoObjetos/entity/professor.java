package com.orientacaoObjetos.entity;

public class professor {

    public String escola = "ebac";
    public String nome = "carlos";
    public String materia = "UX" ;

    public void lecionarmateria() {

        System.out.println("O professor " + nome + " esta dando a materia " + materia + " na escola " + escola);

    }

    public void finalizarMateria() {

        System.out.println("O professor " + nome + " finalizou a materia " + materia + " na escola " + escola);

    }

    @Override
    public String toString() {
        return "nome " + nome + "\nescola " + escola + "\nmateria " + materia;
    }
}


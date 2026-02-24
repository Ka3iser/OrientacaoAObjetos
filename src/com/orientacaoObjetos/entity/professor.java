package com.orientacaoObjetos.entity;

public class professor {

    public String escola;
    public String nome;
    public String materia;
    public int idade;

    public professor(String nome, int idade) throws Exception{
        this.nome = nome;
        validacao(idade);
    }

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

    private void validacao(int idade) throws Exception{
        if (idade < 18){
            throw new Exception("A idade de " + idade + " é invalida");
        }

        this.idade = idade;

    }
}


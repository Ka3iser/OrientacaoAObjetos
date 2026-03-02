package com.orientacaoObjetos.entity;

public class Professor {

    private String escola;
    private String nome;
    private String materia;
    private int idade;

    public Professor(String nome, int idade, String escola) throws Exception{
        this.nome = nome;
        validacao(idade);
        this.escola = escola;
    }

    public Professor(String nome, int idade) throws Exception{
        this.nome = nome;
        this.idade = validacao(idade);
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

    private int validacao(int idade) throws Exception{
        if (idade < 18){
            throw new Exception("A idade de " + idade + " é invalida");
        }

        return idade;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getNome() {
        return  nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        this.idade = validacao(idade);

    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}


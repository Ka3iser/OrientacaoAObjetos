package com.orientacaoObjetos.entity;

public class professor {

    private String escola;
    private String nome;
    private String materia;
    private int idade;

    public professor(String nome, int idade, String escola) throws Exception{
        this.nome = nome;
        validacao(idade);
        this.escola = escola;
    }

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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}


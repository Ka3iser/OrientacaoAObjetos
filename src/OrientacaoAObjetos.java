import com.orientacaoObjetos.entity.professor;

import java.util.Scanner;

public class OrientacaoAObjetos {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Informe seu nome: ");
        nome = input.nextLine();

        System.out.println("Informe a idade: ");
        idade = input.nextInt();

        professor professor = new professor(nome, idade);

        System.out.println(professor.nome);
        System.out.println(professor.idade);

    }
}

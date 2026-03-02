import com.orientacaoObjetos.entity.Escola;
import com.orientacaoObjetos.entity.Professor;

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

        Professor professor = new Professor(nome, idade);

        System.out.println(professor.getNome());
        System.out.println(professor.getIdade());

        Escola escola = new Escola("EBAC");
        escola.setCnpj("123123123-1212");
        escola.setDiretor("Gustavo");

        escola.addProfessor("Henrique");
        escola.addProfessor("Carlos");
        escola.addProfessor("Gabriel");

        for (int i = 0; i < escola.getNomesProfessores().length; i++) {
            if(escola.getNomesProfessores()[i] != null)
                System.out.println(escola.getNomesProfessores()[i]);
        }

    }
}

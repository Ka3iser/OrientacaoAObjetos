import com.orientacaoObjetos.entity.professor;

public class OrientacaoAObjetos {
    public static void main(String[] args) {

        professor professor = new professor();

        System.out.println(professor.nome);
        System.out.println(professor.escola);
        System.out.println(professor.materia);

        professor.lecionarmateria();
        professor.finalizarMateria();
    }
}

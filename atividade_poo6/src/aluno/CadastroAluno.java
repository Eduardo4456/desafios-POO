package aluno;

import java.util.ArrayList;
import java.util.List;

public class CadastroAluno {
	
	private List<Aluno> alunos;

	public CadastroAluno() {
        alunos = new ArrayList<>();
    }
	
	public void adicionarAlunos(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void imprimirLista() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

}

package aluno;

public class Aluno {
	
	private String matricula;
	private String nome;
	private int idade;
	private String curso;
	
	public Aluno(String matricula, String nome, int idade, String curso) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", idade=" + idade + ", curso=" + curso + "]";
	}
	
}

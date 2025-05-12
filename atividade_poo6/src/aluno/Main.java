package aluno;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        CadastroAluno cadastro = new CadastroAluno();
        
        Map<String, Aluno> mapa = new HashMap<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Aluno " + i + ":");
            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = Integer.parseInt(scanner.nextLine());
            System.out.print("Curso: ");
            String curso = scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nome, idade, curso);
            cadastro.adicionarAlunos(aluno);
            mapa.put(matricula, aluno); 
        }
        
        System.out.print("Digite a matrícula para buscar o aluno: ");
        String buscaMatricula = scanner.nextLine();

        Aluno resultado = mapa.get(buscaMatricula);

        if (resultado != null) {
            System.out.println("Aluno encontrado:");
            System.out.println(resultado + "\n------------------------------------------------");
        } else {
            System.out.println("Aluno não encontrado!");
        }

        scanner.close();
        
        cadastro.imprimirLista();
	}
}

package orm.actions;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class InserirAluno {
	public static void main(String[] args) {
		Aluno Aluno1 = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as informações do aluno a ser cadastrado:\n");
		
		System.out.println("Nome: ");
		Aluno1.setNome(sc.nextLine());
		
		System.out.println("CPF: ");
		Aluno1.setCPF(sc.nextLine());
		
		System.out.println("Email: ");
		Aluno1.setEmail(sc.nextLine());
		
		System.out.println("Endereço: ");
		Aluno1.setEndereco(sc.nextLine());
		
		System.out.println("Naturalidade: ");
		Aluno1.setNaturalidade(sc.nextLine());
		
		System.out.println("DataNascimento: ");
		Aluno1.setDataNascimento(sc.nextLine());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(Aluno1);
		manager.getTransaction().commit();
		
		System.out.println("Aluno cadastrado, ID: "+Aluno1.toString());
		
		sc.close();
        manager.close();
        factory.close();
	}
}

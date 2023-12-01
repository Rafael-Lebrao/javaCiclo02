package orm.teste;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabela {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		factory.close();
	}
}

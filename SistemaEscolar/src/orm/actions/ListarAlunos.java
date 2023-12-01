package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.model.Aluno;

public class ListarAlunos {
    public static void main(String[] args) {
        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
            EntityManager manager = factory.createEntityManager();

            String sql = "SELECT a FROM Aluno AS a";

            Query query = manager.createQuery(sql);

            @SuppressWarnings("unchecked")
            List<Aluno> lista = query.getResultList();

            for (Aluno aluno : lista) {
                System.out.println(aluno.toString());
            }

            manager.close();
            factory.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

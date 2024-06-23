package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class ClassUsuarioImp implements IUsuario {

	@Override
	public void RegistrarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory fabr= Persistence.createEntityManagerFactory("LPII_CL2_MARCANOABREUJESUSFRANCISCO");
		EntityManager em=fabr.createEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		System.out.println("Usuario registrado con exito en la BD");
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<TblUsuariocl2> ListadoUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

}

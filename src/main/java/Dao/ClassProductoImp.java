package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class ClassProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {
		EntityManagerFactory fabr= Persistence.createEntityManagerFactory("LPII_CL2_MARCANOABREUJESUSFRANCISCO");
		EntityManager em=fabr.createEntityManager();
		em.getTransaction().begin();
		em.persist(producto);
		System.out.println("Producto registrado con exito en la BD");
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<TblProductocl2> ListadoProducto() {
		// TODO Auto-generated method stub
		return null;
	}

}

package TestEntidades;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {
		TblProductocl2 producto= new TblProductocl2();
		ClassProductoImp crud= new ClassProductoImp();
		
		//asignamos valores
		/*producto.setNombrecl2("vsadsdsdfsdfsdf");
		producto.setDescripcl2("example");
		producto.setEstadocl2("Muy nuevo");
		producto.setPreciocompcl2(1585);
		producto.setPrecioventacl2(5000);
		
		//invocamos el metodo registrar
		crud.RegistrarProducto(producto);*/
		
		List<TblProductocl2> listado=crud.ListadoProducto();
		for(TblProductocl2 list:listado){
			System.out.println("nombre " + list.getNombrecl2() + " precio de compra " + list.getPreciocompcl2() + " precio de venta " + list.getPrecioventacl2() + " estado " + list.getEstadocl2());
		}
	}

}

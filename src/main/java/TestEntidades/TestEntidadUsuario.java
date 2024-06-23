package TestEntidades;

import java.util.List;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl2;

public class TestEntidadUsuario {

	public static void main(String[] args) {
		TblUsuariocl2 usuario= new TblUsuariocl2();
		ClassUsuarioImp crud= new ClassUsuarioImp();
		
		//asignamos valores
		/*usuario.setUsuariocl2("Andrea");
		usuario.setPasswordcl2("sdlvnslvs");
		
		//invocamos el metodo registrar
		crud.RegistrarUsuario(usuario);*/
		
		/*List<TblUsuariocl2> listado=crud.ListadoUsuario();
		for(TblUsuariocl2 list:listado){
			System.out.println("nombre " + list.getUsuariocl2() + " password " + list.getPasswordcl2());
		}*/
	}
	
	
}

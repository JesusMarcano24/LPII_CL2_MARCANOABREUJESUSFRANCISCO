package TestEntidades;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl2;

public class TestEntidadUsuario {

	public static void main(String[] args) {
		TblUsuariocl2 usuario= new TblUsuariocl2();
		ClassUsuarioImp crud= new ClassUsuarioImp();
		
		//asignamos valores
		usuario.setUsuariocl2("Juanito");
		usuario.setPasswordcl2("123456");
		
		//invocamos el metodo registrar
		crud.RegistrarUsuario(usuario);
	}

}

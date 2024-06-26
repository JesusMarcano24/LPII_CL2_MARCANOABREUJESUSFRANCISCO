package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		//Instanciamos
		TblProductocl2 producto = new TblProductocl2();
		ClassProductoImp crud = new ClassProductoImp();
		List<TblProductocl2> listadoProducto= crud.ListadoProducto();
		
		//Hacemos el listado de productos
		request.setAttribute("listadoProductos", listadoProducto);
		//Redireccion
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		//Recuperamos valores
		String nombre = request.getParameter("nombre");
		float precioVenta = Integer.parseInt(request.getParameter("precioventa"));
		float precioCompra = Integer.parseInt(request.getParameter("preciocompra"));
		String estado = request.getParameter("estado");
		String descripcion = request.getParameter("descripcion");
		
		//Instanciamos las entidades
		TblProductocl2 producto= new TblProductocl2();
		ClassProductoImp crud = new ClassProductoImp();
		
		producto.setNombrecl2(nombre);
		producto.setDescripcl2(descripcion);
		producto.setEstadocl2(estado);
		producto.setPreciocompcl2(precioCompra);
		producto.setPrecioventacl2(precioVenta);
		//Invocamos el metodo registrar
		crud.RegistrarProducto(producto);
		//Actualizamos el listado
		List<TblProductocl2> listadoProducto= crud.ListadoProducto();
		
		//Hacemos el listado de productos
		request.setAttribute("listadoProductos", listadoProducto);
		//Redireccionamos al usuario al listado
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
	}

}

package uia.com.api.ContabilidadUIA.modelo;

import java.util.ArrayList;

import uia.com.api.ContabilidadUIA.modelo.clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.gestor.DecoradorProveedores;
import uia.com.api.ContabilidadUIA.modelo.gestor.Gestor;
import uia.com.api.ContabilidadUIA.modelo.proveedores.Proveedor;


public class ClientesRepositorio {
		
	    public Gestor contabilidad =  null;
		public DecoradorProveedores gestorProveedores = null;		
		public Proveedor proveedor = null;
		public String clienteId="";

		public ClientesRepositorio()
		{
		 contabilidad = new Gestor("C:\\Users\\alfre\\OneDrive\\Documentos\\Arq_act12\\ContabilidadUIA\\ListaProveedores.json");		
		 gestorProveedores = new DecoradorProveedores(contabilidad, "proveedor");		 
		 gestorProveedores.Print();
		}
		
		
		


		public DecoradorProveedores getGestorProveedores() {
			return gestorProveedores;
		}

		public void setGestorProveedores(DecoradorProveedores gestorProveedores) {
			this.gestorProveedores = gestorProveedores;
		}

		public void borraCliente(String clienteId) {
			// TODO Auto-generated method stub
			
		}


}

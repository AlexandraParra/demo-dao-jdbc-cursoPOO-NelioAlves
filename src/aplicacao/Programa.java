package aplicacao;

import modelo.dao.DaoFactory;
import modelo.dao.VendedorDao;
import modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println("=== Teste 1: vendedor findById ===");
		Vendedor vendedor = vendedorDao.findById(3);
		
		System.out.println(vendedor);
	}

}

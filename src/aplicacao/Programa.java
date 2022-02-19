package aplicacao;

import java.util.Date;
import java.util.List;

import modelo.dao.DaoFactory;
import modelo.dao.VendedorDao;
import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println("=== Teste 1: vendedor findById ===");
		Vendedor vendedor = vendedorDao.findById(3);
		System.out.println(vendedor);
		
		System.out.println("\n=== Teste 2: vendedor findByDepartment ===");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = vendedorDao.findByDepartamento(departamento);
		for (Vendedor obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: vendedor findAll =====");
		list = vendedorDao.findAll();
		for (Vendedor obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: vendedor insert =====");
		Vendedor novoVendedor = new Vendedor(null, "Greg", "greg@gmail.com", new Date(), 4000.0, departamento);
		vendedorDao.insert(novoVendedor);
		System.out.println("Inserido! Novo id = " + novoVendedor.getId());
	}

}

package aplicacao;

import java.util.List;
import java.util.Scanner;

import modelo.dao.DaoFactory;
import modelo.dao.DepartamentoDao;
import modelo.entidades.Departamento;

public class Programa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartamentoDao departamentoDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: findById =======");
		Departamento dep = departamentoDao.findById(1);
		System.out.println(dep);

		System.out.println("\n=== TEST 2: findAll =======");
		List<Departamento> list = departamentoDao.findAll();
		for (Departamento d : list) {
			System.out.println(d);
		}

		System.out.println("\n=== TEST 3: insert =======");
		Departamento newDepartment = new Departamento(null, "Music");
		departamentoDao.insert(newDepartment);
		System.out.println("Inserido! Novo id: " + newDepartment.getId());

		System.out.println("\n=== TEST 4: update =======");
		Departamento dep2 = departamentoDao.findById(1);
		dep2.setNome("Food");
		departamentoDao.update(dep2);
		System.out.println("Atualizado");

		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departamentoDao.deleteById(id);
		System.out.println("Deletado com sucesso!");

		sc.close();
	}

}

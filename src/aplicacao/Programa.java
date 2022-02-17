package aplicacao;

import java.util.Date;

import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		Departamento obj = new Departamento(1, "Livros");
		
		Vendedor vendedor = new Vendedor(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(vendedor);
	}

}

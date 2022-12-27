package application;

import java.util.Date;

import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		
		//DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Departamento obj = new Departamento(1, "Computers");
		
		Vendedor vendedor = new Vendedor(2, "Breno", "breno@gmail.com", new Date(), 3000.00, obj);
		
		System.out.println(vendedor);

	}

}

package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFabrica;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class ProgramVendedor {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		VendedorDao vendedorDao = DaoFabrica.criaVendedorDao();
		
		System.out.println("=== TEST 1: vendedor findById =====");
		Vendedor vendedor = vendedorDao.localizaPorId(3);
		System.out.println(vendedor);
		
		System.out.println("\n=== TEST 2: vendedor findByDepartamento =====");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = vendedorDao.localizaPorDepartamento(departamento);
		for (Vendedor obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: vendedor findAll =====");
		list = vendedorDao.localizaTodos();
		for (Vendedor obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 4: vendedor insert =====");
		Vendedor newVendedor = new Vendedor(null, "Greg", "greg@gmail.com", new Date(), 4000.0, departamento);
		vendedorDao.inserir(newVendedor);
		System.out.println("Inserted! New id = " + newVendedor.getId());

		System.out.println("\n=== TEST 5: vendedor update =====");
		vendedor = vendedorDao.localizaPorId(1);
		vendedor.setNome("Martha Waine");
		vendedorDao.atualizar(vendedor);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 6: vendedor delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		vendedorDao.deletaPorId(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}

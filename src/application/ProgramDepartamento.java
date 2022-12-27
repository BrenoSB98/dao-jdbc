package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFabrica;
import model.dao.DepartamentoDao;
import model.entities.Departamento;

public class ProgramDepartamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartamentoDao departamentoDao = DaoFabrica.criaDepartamentoDao();

		System.out.println("=== TEST 1: findById =======");
		Departamento dep = departamentoDao.localizaPorId(1);
		System.out.println(dep);

		System.out.println("\n=== TEST 2: findAll =======");
		List<Departamento> list = departamentoDao.localizaTodos();
		for (Departamento d : list) {
			System.out.println(d);
		}

		System.out.println("\n=== TEST 3: insert =======");
		Departamento newDepartamento = new Departamento(null, "Music");
		departamentoDao.inserir(newDepartamento);
		System.out.println("Inserted! New id: " + newDepartamento.getId());

		System.out.println("\n=== TEST 4: update =======");
		Departamento dep2 = departamentoDao.localizaPorId(1);
		dep2.setNome("Food");
		departamentoDao.atualizar(dep2);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departamentoDao.deletaPorId(id);
		System.out.println("Delete completed");

		sc.close();
	}

}

package model.dao;

import java.util.List;

import model.entities.Departamento;
import model.entities.Vendedor;

public interface VendedorDao {

	void inserir(Vendedor obj);

	void atualizar(Vendedor obj);

	void deletaPorId(Integer id);

	Vendedor localizaPorId(Integer id);

	List<Vendedor> localizaTodos();

	List<Vendedor> localizaPorDepartamento(Departamento departamento);
}

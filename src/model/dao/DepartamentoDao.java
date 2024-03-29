package model.dao;

import java.util.List;

import model.entities.Departamento;

public interface DepartamentoDao {

	void inserir(Departamento obj);

	void atualizar(Departamento obj);

	void deletaPorId(Integer id);

	Departamento localizaPorId(Integer id);

	List<Departamento> localizaTodos();
}

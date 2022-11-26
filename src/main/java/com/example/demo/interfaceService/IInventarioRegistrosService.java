package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;
import com.example.demo.modelo.InventarioRegistros;

public interface IInventarioRegistrosService {

	public List<InventarioRegistros>listar();
	public Optional<InventarioRegistros>listarId(int id);
	public int save(InventarioRegistros reg);
	public void  delete (int id);
	
}

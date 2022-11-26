package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IInventarioRegistrosService;
import com.example.demo.interfaces.IInventarioRegistros;
import com.example.demo.modelo.InventarioRegistros;

@Service
public class InventarioRegistrossService implements IInventarioRegistrosService {

	@Autowired
	private IInventarioRegistros data;
	@Override
	public List<InventarioRegistros> listar() {
		// TODO Auto-generated method stub
		return List<InventarioRegistros>)data.findAll();
	}

	@Override
	public Optional<InventarioRegistros> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(InventarioRegistros reg) {
		int res=0;
		InventarioRegistros inmaco = data.save(reg);
		if(!inmaco.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}

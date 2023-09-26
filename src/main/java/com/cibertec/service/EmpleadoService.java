package com.cibertec.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.interfacesService.IEmpleadoService;
import com.cibertec.interfaces.IEmpleado;
import com.cibertec.modelo.Empleado;

@Service
public class EmpleadoService implements IEmpleadoService {

	@Autowired
	private IEmpleado data;
	
	@Override
	public List<Empleado> listar() {		
		return (List<Empleado>)data.findAll();
	}

	@Override
	public Optional<Empleado> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Empleado e) {
		int res=0;
		Empleado emple= data.save(e);
		if(!emple.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

	
}

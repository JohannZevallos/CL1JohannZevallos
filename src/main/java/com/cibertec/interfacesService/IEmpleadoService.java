package com.cibertec.interfacesService;

import java.util.List;
import java.util.Optional;

import com.cibertec.modelo.Empleado;

public interface IEmpleadoService {

	public List<Empleado>listar();
	public Optional<Empleado> listarId(int id);
	public int save(Empleado e);
	public void delete(int id);
}

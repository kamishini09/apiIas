package com.api.dao;

import com.api.model.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ServicioDao extends CrudRepository<Servicio, Integer> {
    List<Servicio> findByIdentificadorempleado(String identificador_empleado);
}

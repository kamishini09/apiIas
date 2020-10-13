package com.api.rest;

import com.api.dao.ServicioDao;
import com.api.model.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("servicios")
public class ServicioRest {

    @Autowired
    private ServicioDao servicioDao;

    //localhost:8080/servicios/guardar

    @PostMapping("/guardar")
    public void guardar(@RequestBody Servicio s){
        servicioDao.save(s);
    }

    @GetMapping("/listar")
    public List<Servicio> listar(){
        return (List<Servicio>) servicioDao.findAll();
    }

    @GetMapping("/listar_empleado/{variable}")
    public List<Servicio> listarEmpleado(@PathVariable("variable") String variable){
        return (List<Servicio>) servicioDao.findByIdentificadorempleado(variable);
    }
}

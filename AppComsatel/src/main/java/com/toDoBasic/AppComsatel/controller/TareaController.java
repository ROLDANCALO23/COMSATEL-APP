package com.toDoBasic.AppComsatel.controller;

import java.util.List;

import com.toDoBasic.AppComsatel.entity.Tarea;
import com.toDoBasic.AppComsatel.service.TareaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TareaController {


    @Autowired
    private TareaService service;

    @CrossOrigin(origins="http://localhost:4200")
    @PostMapping("/addtarea")
    public Tarea addTAREA(@RequestBody Tarea tarea){
        return service.saveTarea(tarea);
        
    }
    @PostMapping("/addtareas")
    public List<Tarea> addTAREAS(@RequestBody List<Tarea> tareas){
        return service.saveTareas(tareas);   
    }


    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/tareas")
    public List<Tarea> findAllTareas(){
        return service.getTareas();
    }

    @GetMapping("/tareas/{id}")
    public Tarea findTareaById(@PathVariable int id){
        return service.getTareaById(id);
    }


    @GetMapping("/tareas/{name}")
    public Tarea findTareaById(@PathVariable String name){

        return service.getTareaByName(name);
    }
/*     @PutMapping("/update")
    public Tarea updateTarea(@RequestBody Tarea tarea){

        return service.updateTarea(tarea);
    } */

    @CrossOrigin(origins="http://localhost:4200")
    @PutMapping("/update")
    public Tarea updateTarea(@RequestBody Tarea tarea)
    {
        return service.updateTarea(tarea);
    }


    @CrossOrigin(origins="http://localhost:4200")
    @DeleteMapping(path={"/delete/{id}"})
    public Tarea deleteTarea(@PathVariable("id") int id){

        return service.delete(id);
    }

    
}

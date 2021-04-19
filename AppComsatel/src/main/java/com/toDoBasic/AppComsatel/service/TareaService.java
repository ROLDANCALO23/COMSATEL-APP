package com.toDoBasic.AppComsatel.service;


import java.util.List;


import com.toDoBasic.AppComsatel.entity.Tarea;
import com.toDoBasic.AppComsatel.repository.TareaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService {

    @Autowired
    private TareaRepository repository;

    public Tarea saveTarea(Tarea tarea){
        return repository.save(tarea);
    }
    public List<Tarea> saveTareas(List<Tarea> tareas){
        return repository.saveAll(tareas);
    }
    public List<Tarea> getTareas(){
        return repository.findAll();
    }
    public Tarea getTareaById(int id){
        return repository.findById(id).orElse(null);
    }
    public Tarea getTareaByName(String name){
        return repository.findByName(name);
    }
    public Tarea delete(int id){
        Tarea t=repository.findById(id).orElse(null);

        if(t!=null){
            repository.delete(t);
        }
        return t;
    }

    public Tarea updateTarea(Tarea tarea){
        return repository.save(tarea);
    }



    
}

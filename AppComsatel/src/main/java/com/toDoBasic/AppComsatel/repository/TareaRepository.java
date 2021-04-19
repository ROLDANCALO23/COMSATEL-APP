package com.toDoBasic.AppComsatel.repository;

import com.toDoBasic.AppComsatel.entity.Tarea;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea,Integer>{
    Tarea findByName(String name);

}

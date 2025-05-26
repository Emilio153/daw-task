package com.daw.persistence.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import com.daw.persistence.entities.Task;
import com.daw.persistence.entities.enums.Estado;

public interface TaskRepository extends ListCrudRepository<Task, Integer>{
	List<Task> findByEstado(Estado estado);
    List<Task> findByFechaVencimientoBefore(LocalDate fecha);
    List<Task> findByFechaVencimientoAfter(LocalDate fecha);
    List<Task> findByTituloContainingIgnoreCase(String titulo);
}
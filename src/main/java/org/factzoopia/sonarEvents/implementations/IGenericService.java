package org.factzoopia.sonarEvents.implementations;


import java.util.List;

public interface IGenericService<T> {
    List<T> getAll();
    T getById(Long id);
    T store(T entity);
}
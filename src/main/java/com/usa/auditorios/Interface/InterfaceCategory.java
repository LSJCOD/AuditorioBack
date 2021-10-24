package com.usa.auditorios.Interface;

import com.usa.auditorios.Modelo.Category;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceCategory extends CrudRepository<Category, Integer> {
}
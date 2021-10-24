package com.usa.auditorios.Repository;

import com.usa.auditorios.Interface.InterfaceCategory;
import com.usa.auditorios.Modelo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositoryCategory {
        @Autowired
        private InterfaceCategory crud;

        public List<Category> getAll() {
            return (List<Category>) crud.findAll();
        }

        public Optional<Category> getCategory(int id) {
            return crud.findById(id);
        }

        public Category save(Category category) {
            return crud.save(category);
        }

        public void delete(Category category) {
            crud.delete(category);
        }

    }
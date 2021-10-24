package com.usa.auditorios.Repository;

import com.usa.auditorios.Interface.InterfaceAudience;
import com.usa.auditorios.Modelo.Audience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositoryAudience {
    @Autowired
    private InterfaceAudience crud;

    public List<Audience> getAll(){
        return (List<Audience>) crud.findAll();
    }

    public Optional<Audience> getAudience(int id){
        return crud.findById(id);
    }

    public Audience save(Audience audience){
        return crud.save(audience);
    }

    public void delete(Audience audience){
        crud.delete(audience);
    }
}

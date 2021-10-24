package com.usa.auditorios.Services;

import com.usa.auditorios.Modelo.Audience;
import com.usa.auditorios.Repository.RepositoryAudience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesAudience {
    @Autowired
    private RepositoryAudience metodosCrud;

    public List<Audience> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Audience> getAudience(int audienceId) {
        return metodosCrud.getAudience(audienceId);
    }

    public Audience save(Audience audience) {
        if (audience.getId() == null) {
            return metodosCrud.save(audience);
        } else {
            Optional<Audience> data = metodosCrud.getAudience(audience.getId());
            if (data.isEmpty()) {
                return metodosCrud.save(audience);
            } else {
                return audience;
            }
        }
    }
    public Audience update(Audience audience){
        if(audience.getId()!=null){
            Optional<Audience> data=metodosCrud.getAudience(audience.getId());
            if(!data.isEmpty()){
                if(audience.getName()!=null){
                    data.get().setName(audience.getName());
                }
                if(audience.getOwner()!=null){
                    data.get().setOwner(audience.getOwner());
                }
                if(audience.getCapacity()!=null){
                    data.get().setCapacity(audience.getCapacity());
                }
                if(audience.getDescription()!=null){
                    data.get().setDescription(audience.getDescription());
                }
                metodosCrud.save(data.get());
                return data.get();
            }else{
                return audience;
            }
        }else{
            return audience;
        }
    }

    public boolean deleteAudience(int audienceId) {
        Boolean aBoolean = getAudience(audienceId).map(audience -> {
            metodosCrud.delete(audience);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}

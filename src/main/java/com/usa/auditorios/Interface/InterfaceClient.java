package com.usa.auditorios.Interface;

import com.usa.auditorios.Modelo.Client;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceClient extends CrudRepository<Client,Integer> {
}

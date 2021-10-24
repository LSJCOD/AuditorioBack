package com.usa.auditorios.Interface;

import com.usa.auditorios.Modelo.Message;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceMessage extends CrudRepository<Message,Integer> {
}

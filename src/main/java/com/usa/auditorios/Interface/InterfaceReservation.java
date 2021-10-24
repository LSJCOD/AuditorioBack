package com.usa.auditorios.Interface;

import com.usa.auditorios.Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceReservation extends CrudRepository<Reservation,Integer> {
}

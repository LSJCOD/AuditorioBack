//Categoria,Mensaje,Reservacion,Cliente,Auditorio
//1.Modelo o Entidad
//2.Interface
//3.Repositorio
//4.Servicios
//5.Controlador o Web


package com.usa.auditorios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.usa.auditorios.modelo"})
public class AuditoriosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuditoriosApplication.class, args);
    }

}

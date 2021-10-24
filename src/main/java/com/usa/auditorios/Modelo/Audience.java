package com.usa.auditorios.Modelo;
/**
 * @Author Libardo Salamanca Jimenez
 * @Date 19/10/2021
 */
/**
 * Imports Necesarios para el funcionamiento del modulo
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
/**
 * Definicion del Modulo o la Entidad
 */
@Entity
/**
 * Definicion de la tabla
 */
@Table(name = "audienceT")
/**
 * Definicion de la Funcions Audiencia
 */
public class Audience implements Serializable {
    /**
     * Atibutos de la funcion
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * Contiene el id del auditorio
     */
    private Integer id;
    /**
     * Contiene el nombre del auditorio
     */
    private String name;
    /**
     * Contiene la categoria del auditorio
     */
    private String owner;
    /**
     * Contiene la capacidad del auditorio
     */
    private Integer capacity;
    /**
     * Contiene la descripcion del auditorio
     */
    private String description;

    /**
     * Definicion de Integracion de Muchos a Uno entre Audience y category
     */
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("audiences")
    private Category category;

    /**
     * Definicion de Integracion de Uno a Muchos entre Audience y category
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "audience")
    @JsonIgnoreProperties({"audience", "client"})
    private List<Message> messages;

    /**
     * Definicion de Integracion de Uno a Muchos entre Audience y Reservations
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "audience")
    @JsonIgnoreProperties({"audience", "client"})
    private List<Reservation> reservations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}

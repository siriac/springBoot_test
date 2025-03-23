package org.ulrich.test.springboot.app.models;

import jakarta.persistence.*;

@Entity
@Table(name = "bancos")
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name = "total_transferencias")
    private int totalTransferencies;

    public Banco() {

    }

    public Banco(Long id, String nombre, int totalTransferencies) {
        this.id = id;
        this.nombre = nombre;
        this.totalTransferencies = totalTransferencies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalTransferencies() {
        return totalTransferencies;
    }

    public void setTotalTransferencies(int totalTransferencies) {
        this.totalTransferencies = totalTransferencies;
    }
}

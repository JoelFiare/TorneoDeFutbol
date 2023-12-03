package com.joelfiare.model;

import jakarta.persistence.*;

@Entity
@Table(name = "equipos", schema = "torneofutbol", catalog = "")
public class Equipo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Basic
    @Column(name = "titulares", nullable = true)
    private Integer titulares;
    @Basic
    @Column(name = "suplentes", nullable = true)
    private Integer suplentes;
    @Basic
    @Column(name = "directorTecnico", nullable = true, length = 100)
    private String directorTecnico;
    @Basic
    @Column(name = "puntos", nullable = true)
    private Integer puntos;
    @Basic
    @Column(name = "partidosJugados", nullable = true)
    private Integer partidosJugados;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTitulares() {
        return titulares;
    }

    public void setTitulares(Integer titulares) {
        this.titulares = titulares;
    }

    public Integer getSuplentes() {
        return suplentes;
    }

    public void setSuplentes(Integer suplentes) {
        this.suplentes = suplentes;
    }

    public String getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(Integer partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipo equipo = (Equipo) o;

        if (id != equipo.id) return false;
        if (nombre != null ? !nombre.equals(equipo.nombre) : equipo.nombre != null) return false;
        if (titulares != null ? !titulares.equals(equipo.titulares) : equipo.titulares != null) return false;
        if (suplentes != null ? !suplentes.equals(equipo.suplentes) : equipo.suplentes != null) return false;
        if (directorTecnico != null ? !directorTecnico.equals(equipo.directorTecnico) : equipo.directorTecnico != null)
            return false;
        if (puntos != null ? !puntos.equals(equipo.puntos) : equipo.puntos != null) return false;
        if (partidosJugados != null ? !partidosJugados.equals(equipo.partidosJugados) : equipo.partidosJugados != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (titulares != null ? titulares.hashCode() : 0);
        result = 31 * result + (suplentes != null ? suplentes.hashCode() : 0);
        result = 31 * result + (directorTecnico != null ? directorTecnico.hashCode() : 0);
        result = 31 * result + (puntos != null ? puntos.hashCode() : 0);
        result = 31 * result + (partidosJugados != null ? partidosJugados.hashCode() : 0);
        return result;
    }
}

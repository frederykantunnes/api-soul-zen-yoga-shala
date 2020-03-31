package br.com.soulzenyogashala.soul.models;

import javax.persistence.*;

@Entity
@Table(name = "exercicioturma")
public class ExercicioTurma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int idturma;
    private int idexercicio;

    public ExercicioTurma() {
    }

    public ExercicioTurma(int idturma, int idexercicio) {
        this.idturma = idturma;
        this.idexercicio = idexercicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdturma() {
        return idturma;
    }

    public void setIdturma(int idturma) {
        this.idturma = idturma;
    }

    public int getIdexercicio() {
        return idexercicio;
    }

    public void setIdexercicio(int idexercicio) {
        this.idexercicio = idexercicio;
    }
}

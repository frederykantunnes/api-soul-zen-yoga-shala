package br.com.soulzenyogashala.soul.models;

import javax.persistence.*;

@Entity
@Table(name = "turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int idusuario;
    private String nome, descricao, codigodeacesso;

    public Turma() {
    }

    public Turma(int idusuario, String nome, String descricao, String codigodeacesso) {
        this.idusuario = idusuario;
        this.nome = nome;
        this.descricao = descricao;
        this.codigodeacesso = codigodeacesso;
    }

    public Turma(int id, int idusuario, String nome, String descricao, String codigodeacesso) {
        this.id = id;
        this.idusuario = idusuario;
        this.nome = nome;
        this.descricao = descricao;
        this.codigodeacesso = codigodeacesso;
    }

    public Turma(Turma turma) {
        this.id = turma.getId();
        this.idusuario = turma.getIdusuario();
        this.nome = turma.getNome();
        this.descricao = turma.getDescricao();
        this.codigodeacesso = turma.getCodigodeacesso();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigodeacesso() {
        return codigodeacesso;
    }

    public void setCodigodeacesso(String codigodeacesso) {
        this.codigodeacesso = codigodeacesso;
    }
}

package br.com.soulzenyogashala.soul.models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "agenda")
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int idusuario;
    private String titulo, descricao, link, endereco, valor;
    private Date data;

    public Agenda() {
    }

    public Agenda(int idusuario, String titulo, String descricao, String link, Date data, String endereco, String valor) {
        this.idusuario = idusuario;
        this.titulo = titulo;
        this.descricao = descricao;
        this.link = link;
        this.data = data;
        this.endereco = endereco;
        this.valor = valor;
    }

    public Agenda(int id, int idusuario, String titulo, String descricao, String link, Date data, String endereco, String valor) {
        this.id = id;
        this.idusuario = idusuario;
        this.titulo = titulo;
        this.descricao = descricao;
        this.link = link;
        this.data = data;
        this.endereco = endereco;
        this.valor = valor;
    }

    public Agenda(Agenda agenda) {
        this.id = agenda.getId();
        this.idusuario = agenda.getIdusuario();
        this.titulo = agenda.getTitulo();
        this.descricao = agenda.getDescricao();
        this.link = agenda.getLink();
        this.data = agenda.getData();
        this.endereco = agenda.getEndereco();
        this.valor = agenda.getValor();
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}

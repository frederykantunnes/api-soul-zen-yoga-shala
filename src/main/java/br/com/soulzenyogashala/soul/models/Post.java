package br.com.soulzenyogashala.soul.models;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int idusuario;
    private String titulo, descricao, imagem, data;

    public Post() {
    }

    public Post(int idusuario, String titulo, String descricao, String imagem, String data) {
        this.idusuario = idusuario;
        this.titulo = titulo;
        this.descricao = descricao;
        this.imagem = imagem;
        this.data = data;
    }

    public Post(int id, int idusuario, String titulo, String descricao, String imagem, String data) {
        this.id = id;
        this.idusuario = idusuario;
        this.titulo = titulo;
        this.descricao = descricao;
        this.imagem = imagem;
        this.data = data;
    }

    public Post(Post post) {
        this.id = post.getId();
        this.idusuario = post.getIdusuario();
        this.titulo = post.getTitulo();
        this.descricao = post.getDescricao();
        this.imagem = post.getImagem();
        this.data = post.getData();
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

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

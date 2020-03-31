package br.com.soulzenyogashala.soul.models;

import javax.persistence.*;

@Entity
@Table(name = "exercicio")
public class Exercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int idusuario;
    private String titulo, descricao, imagem, audio, duracao;

    public Exercicio() {
    }

    public Exercicio(int idusuario, String titulo, String descricao, String imagem, String audio, String duracao) {
        this.idusuario = idusuario;
        this.titulo = titulo;
        this.descricao = descricao;
        this.imagem = imagem;
        this.audio = audio;
        this.duracao = duracao;
    }


    public Exercicio(int id, int idusuario, String titulo, String descricao, String imagem, String audio, String duracao) {
        this.id = id;
        this.idusuario = idusuario;
        this.titulo = titulo;
        this.descricao = descricao;
        this.imagem = imagem;
        this.audio = audio;
        this.duracao = duracao;
    }

    public Exercicio(Exercicio exercicio) {
        this.id = exercicio.getId();
        this.idusuario = exercicio.getIdusuario();
        this.titulo = exercicio.getTitulo();
        this.descricao = exercicio.getDescricao();
        this.imagem = exercicio.getImagem();
        this.audio = exercicio.getAudio();
        this.duracao = exercicio.getDuracao();
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

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}

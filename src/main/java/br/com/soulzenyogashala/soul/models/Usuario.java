package br.com.soulzenyogashala.soul.models;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int tipo;
    private String email, senha, nome, endereco, bairro, cidade, cep, telefone, turma, dataprimeiraaula, nascimento;

    public Usuario() {
    }

    public Usuario(Usuario usuario) {
        this.id = usuario.getId();
        this.tipo = usuario.getTipo();
        this.email = usuario.getEmail();
        this.senha = usuario.getSenha();
        this.nome = usuario.getNome();
        this.endereco = usuario.getEndereco();
        this.bairro = usuario.getBairro();
        this.cidade = usuario.getCidade();
        this.cep = usuario.getCep();
        this.telefone = usuario.getTelefone();
        this.turma = usuario.getTurma();
        this.dataprimeiraaula = usuario.getDataprimeiraaula();
        this.nascimento = usuario.getNascimento();
    }

    public Usuario(int tipo, String email, String senha, String nome, String endereco, String bairro, String cidade, String cep, String telefone, String turma, String dataprimeiraaula, String nascimento) {
        this.tipo = tipo;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.telefone = telefone;
        this.turma = turma;
        this.dataprimeiraaula = dataprimeiraaula;
        this.nascimento = nascimento;
    }

    public Usuario(int id, int tipo, String email, String senha, String nome, String endereco, String bairro, String cidade, String cep, String telefone, String turma, String dataprimeiraaula, String nascimento) {
        this.id = id;
        this.tipo = tipo;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.telefone = telefone;
        this.turma = turma;
        this.dataprimeiraaula = dataprimeiraaula;
        this.nascimento = nascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getDataprimeiraaula() {
        return dataprimeiraaula;
    }

    public void setDataprimeiraaula(String dataprimeiraaula) {
        this.dataprimeiraaula = dataprimeiraaula;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}

package br.com.soulzenyogashala.soul.models;

import javax.persistence.*;

@Entity
@Table(name = "anamnese")
public class Anamnese {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int idusuario;
    private String profissao, comosesentenotrabalho, emergenciaavisar, peso, altura, hipertenso, diabetes, alergia, medicacao, horariodedormir, acordaanoite, descricaodesono, alimentacao, evacuacao, estadomental, litrosdeaguapordia, doresdecoluna, doresdecabeca, limitacaodemovimento, protese, lesaoouacometimento, problemadesaude, cuidadomedico, medicamentos, atividadefisica, desenvolvimentopessoal, yoga, objetivo, comonosconheceu, maissobrevoce;

    public Anamnese() {
    }

    public Anamnese(int idusuario, String profissao, String comosesentenotrabalho, String emergenciaavisar, String peso, String altura, String hipertenso, String diabetes, String alergia, String medicacao, String horariodedormir, String acordaanoite, String descricaodesono, String alimentacao, String evacuacao, String estadomental, String litrosdeaguapordia, String doresdecoluna, String doresdecabeca, String limitacaodemovimento, String protese, String lesaoouacometimento, String problemadesaude, String cuidadomedico, String medicamentos, String atividadefisica, String desenvolvimentopessoal, String yoga, String objetivo, String comonosconheceu, String maissobrevoce) {
        this.idusuario = idusuario;
        this.profissao = profissao;
        this.comosesentenotrabalho = comosesentenotrabalho;
        this.emergenciaavisar = emergenciaavisar;
        this.peso = peso;
        this.altura = altura;
        this.hipertenso = hipertenso;
        this.diabetes = diabetes;
        this.alergia = alergia;
        this.medicacao = medicacao;
        this.horariodedormir = horariodedormir;
        this.acordaanoite = acordaanoite;
        this.descricaodesono = descricaodesono;
        this.alimentacao = alimentacao;
        this.evacuacao = evacuacao;
        this.estadomental = estadomental;
        this.litrosdeaguapordia = litrosdeaguapordia;
        this.doresdecoluna = doresdecoluna;
        this.doresdecabeca = doresdecabeca;
        this.limitacaodemovimento = limitacaodemovimento;
        this.protese = protese;
        this.lesaoouacometimento = lesaoouacometimento;
        this.problemadesaude = problemadesaude;
        this.cuidadomedico = cuidadomedico;
        this.medicamentos = medicamentos;
        this.atividadefisica = atividadefisica;
        this.desenvolvimentopessoal = desenvolvimentopessoal;
        this.yoga = yoga;
        this.objetivo = objetivo;
        this.comonosconheceu = comonosconheceu;
        this.maissobrevoce = maissobrevoce;
    }

    public Anamnese(int id, int idusuario, String profissao, String comosesentenotrabalho, String emergenciaavisar, String peso, String altura, String hipertenso, String diabetes, String alergia, String medicacao, String horariodedormir, String acordaanoite, String descricaodesono, String alimentacao, String evacuacao, String estadomental, String litrosdeaguapordia, String doresdecoluna, String doresdecabeca, String limitacaodemovimento, String protese, String lesaoouacometimento, String problemadesaude, String cuidadomedico, String medicamentos, String atividadefisica, String desenvolvimentopessoal, String yoga, String objetivo, String comonosconheceu, String maissobrevoce) {
        this.id = id;
        this.idusuario = idusuario;
        this.profissao = profissao;
        this.comosesentenotrabalho = comosesentenotrabalho;
        this.emergenciaavisar = emergenciaavisar;
        this.peso = peso;
        this.altura = altura;
        this.hipertenso = hipertenso;
        this.diabetes = diabetes;
        this.alergia = alergia;
        this.medicacao = medicacao;
        this.horariodedormir = horariodedormir;
        this.acordaanoite = acordaanoite;
        this.descricaodesono = descricaodesono;
        this.alimentacao = alimentacao;
        this.evacuacao = evacuacao;
        this.estadomental = estadomental;
        this.litrosdeaguapordia = litrosdeaguapordia;
        this.doresdecoluna = doresdecoluna;
        this.doresdecabeca = doresdecabeca;
        this.limitacaodemovimento = limitacaodemovimento;
        this.protese = protese;
        this.lesaoouacometimento = lesaoouacometimento;
        this.problemadesaude = problemadesaude;
        this.cuidadomedico = cuidadomedico;
        this.medicamentos = medicamentos;
        this.atividadefisica = atividadefisica;
        this.desenvolvimentopessoal = desenvolvimentopessoal;
        this.yoga = yoga;
        this.objetivo = objetivo;
        this.comonosconheceu = comonosconheceu;
        this.maissobrevoce = maissobrevoce;
    }

    public Anamnese(Anamnese anamnese) {
        this.id = anamnese.getId();
        this.idusuario = anamnese.getIdusuario();
        this.profissao = anamnese.getProfissao();
        this.comosesentenotrabalho = anamnese.getComosesentenotrabalho();
        this.emergenciaavisar = anamnese.getEmergenciaavisar();
        this.peso = anamnese.getPeso();
        this.altura = anamnese.getAltura();
        this.hipertenso = anamnese.getHipertenso();
        this.diabetes = anamnese.getDiabetes();
        this.alergia = anamnese.getAlergia();
        this.medicacao = anamnese.getMedicacao();
        this.horariodedormir = anamnese.getHorariodedormir();
        this.acordaanoite = anamnese.getAcordaanoite();
        this.descricaodesono = anamnese.getDescricaodesono();
        this.alimentacao = anamnese.getAlimentacao();
        this.evacuacao = anamnese.getEvacuacao();
        this.estadomental = anamnese.getEstadomental();
        this.litrosdeaguapordia = anamnese.getLitrosdeaguapordia();
        this.doresdecoluna = anamnese.getDoresdecoluna();
        this.doresdecabeca = anamnese.getDoresdecabeca();
        this.limitacaodemovimento = anamnese.getLimitacaodemovimento();
        this.protese = anamnese.getProtese();
        this.lesaoouacometimento = anamnese.getLesaoouacometimento();
        this.problemadesaude = anamnese.getProblemadesaude();
        this.cuidadomedico = anamnese.getCuidadomedico();
        this.medicamentos = anamnese.getMedicamentos();
        this.atividadefisica = anamnese.getAtividadefisica();
        this.desenvolvimentopessoal = anamnese.getDesenvolvimentopessoal();
        this.yoga = anamnese.getYoga();
        this.objetivo = anamnese.getObjetivo();
        this.comonosconheceu = anamnese.getComonosconheceu();
        this.maissobrevoce = anamnese.getMaissobrevoce();
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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getComosesentenotrabalho() {
        return comosesentenotrabalho;
    }

    public void setComosesentenotrabalho(String comosesentenotrabalho) {
        this.comosesentenotrabalho = comosesentenotrabalho;
    }

    public String getEmergenciaavisar() {
        return emergenciaavisar;
    }

    public void setEmergenciaavisar(String emergenciaavisar) {
        this.emergenciaavisar = emergenciaavisar;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getHipertenso() {
        return hipertenso;
    }

    public void setHipertenso(String hipertenso) {
        this.hipertenso = hipertenso;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public String getHorariodedormir() {
        return horariodedormir;
    }

    public void setHorariodedormir(String horariodedormir) {
        this.horariodedormir = horariodedormir;
    }

    public String getAcordaanoite() {
        return acordaanoite;
    }

    public void setAcordaanoite(String acordaanoite) {
        this.acordaanoite = acordaanoite;
    }

    public String getDescricaodesono() {
        return descricaodesono;
    }

    public void setDescricaodesono(String descricaodesono) {
        this.descricaodesono = descricaodesono;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getEvacuacao() {
        return evacuacao;
    }

    public void setEvacuacao(String evacuacao) {
        this.evacuacao = evacuacao;
    }

    public String getEstadomental() {
        return estadomental;
    }

    public void setEstadomental(String estadomental) {
        this.estadomental = estadomental;
    }

    public String getLitrosdeaguapordia() {
        return litrosdeaguapordia;
    }

    public void setLitrosdeaguapordia(String litrosdeaguapordia) {
        this.litrosdeaguapordia = litrosdeaguapordia;
    }

    public String getDoresdecoluna() {
        return doresdecoluna;
    }

    public void setDoresdecoluna(String doresdecoluna) {
        this.doresdecoluna = doresdecoluna;
    }

    public String getDoresdecabeca() {
        return doresdecabeca;
    }

    public void setDoresdecabeca(String doresdecabeca) {
        this.doresdecabeca = doresdecabeca;
    }

    public String getLimitacaodemovimento() {
        return limitacaodemovimento;
    }

    public void setLimitacaodemovimento(String limitacaodemovimento) {
        this.limitacaodemovimento = limitacaodemovimento;
    }

    public String getProtese() {
        return protese;
    }

    public void setProtese(String protese) {
        this.protese = protese;
    }

    public String getLesaoouacometimento() {
        return lesaoouacometimento;
    }

    public void setLesaoouacometimento(String lesaoouacometimento) {
        this.lesaoouacometimento = lesaoouacometimento;
    }

    public String getProblemadesaude() {
        return problemadesaude;
    }

    public void setProblemadesaude(String problemadesaude) {
        this.problemadesaude = problemadesaude;
    }

    public String getCuidadomedico() {
        return cuidadomedico;
    }

    public void setCuidadomedico(String cuidadomedico) {
        this.cuidadomedico = cuidadomedico;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getAtividadefisica() {
        return atividadefisica;
    }

    public void setAtividadefisica(String atividadefisica) {
        this.atividadefisica = atividadefisica;
    }

    public String getDesenvolvimentopessoal() {
        return desenvolvimentopessoal;
    }

    public void setDesenvolvimentopessoal(String desenvolvimentopessoal) {
        this.desenvolvimentopessoal = desenvolvimentopessoal;
    }

    public String getYoga() {
        return yoga;
    }

    public void setYoga(String yoga) {
        this.yoga = yoga;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getComonosconheceu() {
        return comonosconheceu;
    }

    public void setComonosconheceu(String comonosconheceu) {
        this.comonosconheceu = comonosconheceu;
    }

    public String getMaissobrevoce() {
        return maissobrevoce;
    }

    public void setMaissobrevoce(String maissobrevoce) {
        this.maissobrevoce = maissobrevoce;
    }
}

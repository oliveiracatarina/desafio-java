package br.com.desafiojava.models;

import java.time.LocalDate;

public class Transacao {
    private String cpf;
    private LocalDate data;
    private double valor;
    private String cartao;
    private String hora;
    private String donoLoja;
    private String nomeLoja;
    private TipoTransacao tipoTransacao;

    //construtor default
    public Transacao() {
        this.tipoTransacao = new TipoTransacao();
    }

    public Transacao(String cpf, LocalDate data, double valor, String cartao, String hora,
                     String donoLoja, String nomeLoja, TipoTransacao tipoTransacao){
        this.cpf = cpf;
        this.data = data;
        this.valor = valor;
        this.cartao = cartao;
        this.hora = hora;
        this.donoLoja = donoLoja;
        this.nomeLoja = nomeLoja;
        this.tipoTransacao = tipoTransacao;
    }

    //métodos getters e setters


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDonoLoja() {
        return donoLoja;
    }

    public void setDonoLoja(String donoLoja) {
        this.donoLoja = donoLoja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public TipoTransacao getTipoTransacao(){
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao){
        this.tipoTransacao = tipoTransacao;
    }
}
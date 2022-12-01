package br.com.desafiojava.models;

public class Beneficiario {
    private String cpf;
    private String data;
    private String valor;
    private String cartao;
    private String hora;
    private String donoLoja;
    private String nomeLoja;
    private Transacao transacao;

    //construtor default
    public Beneficiario() {
        this.transacao = new Transacao();
    }

    public Beneficiario(String cpf, String data, String valor, String cartao, String hora,
                        String donoLoja, String nomeLoja, Transacao transacao){
        this.cpf = cpf;
        this.data = data;
        this.valor = valor;
        this.cartao = cartao;
        this.hora = hora;
        this.donoLoja = donoLoja;
        this.nomeLoja = nomeLoja;
        this.transacao = transacao;
    }

    //métodos getters e setters


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
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

    public Transacao getTipoTransacao(){
        return transacao;
    }

    public void setTipoTransacao(Transacao tipoTransacao){
        this.transacao = tipoTransacao;
    }
}
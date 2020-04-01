package com.Grupo49FixMaven;

public class Passageiro {
    private String cpf;
    private String nome;
    private String nCartao;
    private FormaPagto formaPagto;
    public static ArrayList<Passageiro> passageiro = new ArrayList<>();


    public Passageiro(String cpf, String nome, String nCartao, FormaPagto formaPagto) {
        this.cpf = cpf;
        this.nome = nome;
        this.nCartao = nCartao;
        this.formaPagto = formaPagto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnCartao() {
        return nCartao;
    }

    public void setnCartao(String nCartao) {
        this.nCartao = nCartao;
    }

    public FormaPagto getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(FormaPagto formaPagto) {
        this.formaPagto = formaPagto;
    }
}



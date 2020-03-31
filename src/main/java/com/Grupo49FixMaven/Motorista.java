package com.Grupo49FixMaven;

public class Motorista {
    
    private String cpf;
    private String nome;
    private Veiculo veiculo;
    private FormaPagto formaPagto;

    public Motorista(String cpf, String nome, Veiculo veiculo, FormaPagto formaPagto) {
        this.cpf = cpf;
        this.nome = nome;
        this.veiculo = veiculo;
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

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public FormaPagto getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(FormaPagto formaPagto) {
        this.formaPagto = formaPagto;
    }
}

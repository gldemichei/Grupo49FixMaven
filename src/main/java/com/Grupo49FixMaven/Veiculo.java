package com.Grupo49FixMaven;

import java.util.ArrayList;
import java.util.Iterator;

public class Veiculo implements Iterable<Veiculo> {
    private String placa;
    private String marca;
    private String cor;
    private String categoriaVeiculo;
    public static ArrayList<Veiculo> veiculos = new ArrayList<>();

    public Veiculo(String placa, String marca, String cor, String categoria) {
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
        this.categoriaVeiculo = categoria;
        veiculos.add(this);
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public String getCategoria() {
        return categoriaVeiculo;
    }

    @Override
    public Iterator<Veiculo> iterator() {
        return veiculos.iterator();
    }

    // public String getCategoriaStr(){
    //     return categoriaVeiculo.toString();
    // }


}

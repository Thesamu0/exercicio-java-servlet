package br.com.ada.models;

public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    private String tipo;



    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public Carro(String modelo, String marca, String placa,String tipo) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.tipo = tipo;
    }
}

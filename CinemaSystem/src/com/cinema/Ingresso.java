package com.cinema;

public class Ingresso {
    private TipoIngresso tipo;
    private double preco;
    private Cliente cliente;
    private Sessao sessao;

    public Ingresso() {}

    public Ingresso(TipoIngresso tipo, double preco, Cliente cliente, Sessao sessao) {
        this.tipo = tipo;
        this.preco = preco;
        this.cliente = cliente;
        this.sessao = sessao;
    }

    public TipoIngresso getTipo() { return tipo; }
    public void setTipo(TipoIngresso tipo) { this.tipo = tipo; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Sessao getSessao() { return sessao; }
    public void setSessao(Sessao sessao) { this.sessao = sessao; }
}

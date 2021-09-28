package main.domain;

import java.util.Arrays;

public class Venda {
    private int id;
    private int idCliente;
    private int idVendedor;
    private String dtVenda;
    private String produtos[ ];
    private int idProduto;
    private int qtd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getDtVenda() {
        return dtVenda;
    }

    public void setDtVenda(String dtVenda) {
        this.dtVenda = dtVenda;
    }

    public String[] getProdutos() {
        return produtos;
    }

    public void setProdutos(String[] produtos) {
        this.produtos = produtos;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", idCliente=" + idCliente +
                ", idVendedor=" + idVendedor +
                ", dtVenda='" + dtVenda + '\'' +
                ", produtos=" + Arrays.toString(produtos) +
                ", idProduto=" + idProduto +
                ", qtd=" + qtd +
                '}';
    }
}

package main.domain;

import java.util.Arrays;

public class Compra {
    private int id;
    private int idFornecedor;
    private String dtCompra;
    private String produtos[ ];
    private int idProduto;
    private int qtd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getDtCompra() {
        return dtCompra;
    }

    public void setDtCompra(String dtCompra) {
        this.dtCompra = dtCompra;
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
        return "Compra{" +
                "id=" + id +
                ", idFornecedor=" + idFornecedor +
                ", dtCompra='" + dtCompra + '\'' +
                ", produtos=" + Arrays.toString(produtos) +
                ", idProduto=" + idProduto +
                ", qtd=" + qtd +
                '}';
    }
}

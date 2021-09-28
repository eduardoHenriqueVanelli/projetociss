package main.domain;

public class Usuario {
    private int id;
    private int usuario;
    private int senha;
    private int idVendedor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", senha=" + senha +
                ", idVendedor=" + idVendedor +
                '}';
    }
}

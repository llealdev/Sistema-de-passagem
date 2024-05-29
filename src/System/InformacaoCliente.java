package System;

public class InformacaoCliente {

    private String nome;
    private String cpf;
    private String bairro;
    private String rua;
    private String estado;
    private String telefone;
    private String email;

    public InformacaoCliente(){

    }

    public InformacaoCliente(String nome, String cpf, String bairro, String rua, String estado, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.bairro = bairro;
        this.rua = rua;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

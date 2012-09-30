
package main;

public class Cliente {
    private String nome;
    private String sobreNome;
    private String cpf;
    private int pedido;
    
    public int getPedido(){
        return this.pedido;
    }
    public void setPedido(int Ped){
        this.pedido = Ped;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobreNome() {
        return sobreNome;
    }
    
}
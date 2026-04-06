package modelo;
// Classe responsável por representar uma mercadoria
public class Mercadoria {
    private String nome;
    private String descricao;
    private double peso;
    private double valor;
    private String codigo;

    private Endereco endereco; // vínculo 1:1

    public Mercadoria(String nome, String descricao, double peso, double valor, String codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.peso = peso;
        this.valor = valor;
        this.codigo = codigo;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
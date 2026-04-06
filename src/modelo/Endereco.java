package modelo;

// Classe que representa um endereço de entrega
public class Endereco {
    private String logradouro;
    private String complemento;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, String complemento, String numero, String cep, String cidade, String estado) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }
}
import modelo.*;

public class Main {
    public static void main(String[] args) {

        Usuario user = new Usuario();

        if(user.login("12345678")) {
            System.out.println("Login realizado!");

            Endereco endereco = new Endereco(
                "Rua A", "Casa", "123",
                "75800-000", "Turvelândia", "GO"
            );

            Mercadoria mercadoria = new Mercadoria(
                "Notebook", "Dell", 2.5, 3500, "001"
            );

            mercadoria.setEndereco(endereco);

            System.out.println("Mercadoria cadastrada com sucesso!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
// Classe responsável pela autenticação do usuário
package modelo;

public class Usuario {
    private String senha = "12345678";

    public boolean login(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }
}
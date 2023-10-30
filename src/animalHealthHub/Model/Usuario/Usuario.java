package animalHealthHub.Model.Usuario;

import animalHealthHub.Model.Cliente.Individuo;

public class Usuario extends Individuo {
    private String senha;
    private String nivelAcesso;

    //Construtor

    public Usuario(String senha, String nivelAcesso) {
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
}

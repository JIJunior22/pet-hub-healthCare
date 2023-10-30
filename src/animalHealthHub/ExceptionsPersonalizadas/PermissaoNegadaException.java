package animalHealthHub.ExceptionsPersonalizadas;

public class PermissaoNegadaException extends RuntimeException{
    public PermissaoNegadaException() {
        super("Erro: Permissão Negada!");
    }
}

package animalHealthHub.ExceptionsPersonalizadas;

public class ProdutoNaoEncontradoException extends RuntimeException{
    public ProdutoNaoEncontradoException(){
        super("Erro: Produto não encontrado!");
    }
}

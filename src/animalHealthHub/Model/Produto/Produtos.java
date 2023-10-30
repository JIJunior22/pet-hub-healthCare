package animalHealthHub.Model.Produto;

public abstract class Produtos {
    //Atributos
    private int idProduto;
    private String nome;
    private int quantidadeEstoque;
    private double preco;
    private String fornecedores;

    //Construtor vazio
    public Produtos(){

    }
    //Construtor parametrizado

    public Produtos(int idProduto, String nome, int quantidadeEstoque, double preco, String fornecedores) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
        this.fornecedores = fornecedores;
    }

    //Metodos especiais

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(String fornecedores) {
        this.fornecedores = fornecedores;
    }
}

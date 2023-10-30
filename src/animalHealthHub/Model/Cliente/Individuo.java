package animalHealthHub.Model.Cliente;
import java.util.Random;

public abstract class Individuo {

    //Atributos

    private String nome;
    private String endereco;
    private String email;
    private String nomeUsuario;
    private String telefone;

    //Gerar id automaticamente
    Random rd=new Random();
    private int id=rd.nextInt(300,9999);


    //Construtor vazio
    public Individuo(){

    }
    //Construtor parametrizado
    public Individuo(String nome, String endereco, String email, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.nomeUsuario=email.split("@")[0];
    }
    //Metodos especiais

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}

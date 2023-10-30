package animalHealthHub.Model.Cliente;

import animalHealthHub.Interfaces.Clientes.Cadastrar;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cliente extends Individuo implements Cadastrar {
    private Map<String, Cliente> clientesDic = new HashMap<>();

    //Construtor vazio
    public Cliente() {

    }

    //Construtor parametrizado
    public Cliente(String nome, String endereco, String email, String telefone) {
        super(nome, endereco, email, telefone);

    }

    @Override
    public void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("= AREA CADASTRAL =");
        System.out.print("Nome do Cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Endereço: ");
        String enderecoCliente = sc.nextLine();
        System.out.print("E-mail: ");
        String emailCliente = sc.next();

        System.out.print("Telefone: ");
        String telefoneCliente = sc.next();
        String mascara = "(##) #####-####"; // Máscara
        String telefoneFormatado = formatarTelefone(telefoneCliente, mascara);

        Cliente cliente = new Cliente(nomeCliente, enderecoCliente, emailCliente, telefoneFormatado);
        clientesDic.put(nomeCliente, cliente);
    }

    @Override
    public void exibirInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("== BANCO DE DADOS DE CLIENTES ==");
        System.out.print("Digite o nome do Cliente que deseja localizar: ");
        String localizarPorNomeCliente = sc.nextLine();
        Cliente localizarCliente = clientesDic.get(localizarPorNomeCliente);

        if (localizarCliente != null) {
            System.out.println("= DADOS DA CONSULTA DE CLIENTE =");
            System.out.println("Cód.: " + localizarCliente.getId());
            System.out.println("Nome: " + localizarCliente.getNome().toUpperCase());
            System.out.println("Endereço: " + localizarCliente.getEndereco());
            System.out.println("E-mail: " + localizarCliente.getEmail());
            System.out.println("Nome de usuário: " + localizarCliente.getNomeUsuario().split("@")[0]);
            System.out.println("Telefone: " + localizarCliente.getTelefone());
            System.out.println("-".repeat(15));

        }

    }

    public String formatarTelefone(String numero, String mascara) {
        numero = numero.replaceAll("[^0-9]", ""); // Remove caracteres não numéricos

        if (numero.length() != mascara.chars().filter(ch -> ch == '#').count()) {
            throw new IllegalArgumentException("Número e máscara têm tamanhos diferentes.");
        }

        StringBuilder telefoneFormatado = new StringBuilder();
        int indexNumero = 0;

        for (int i = 0; i < mascara.length(); i++) {
            if (mascara.charAt(i) == '#') {
                telefoneFormatado.append(numero.charAt(indexNumero));
                indexNumero++;
            } else {
                telefoneFormatado.append(mascara.charAt(i));
            }
        }

        return telefoneFormatado.toString();
    }
}








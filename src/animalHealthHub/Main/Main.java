package animalHealthHub.Main;

import animalHealthHub.Model.Cliente.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente junior=new Cliente();
        Cliente luke=new Cliente();
        junior.cadastrarCliente();
        junior.exibirInfo();

        luke.cadastrarCliente();
        luke.exibirInfo();


    }
}
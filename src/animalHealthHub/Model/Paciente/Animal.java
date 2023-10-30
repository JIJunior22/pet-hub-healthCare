package animalHealthHub.Model.Paciente;

import java.time.LocalDate;

public abstract class Animal {
    //Atributos
    private int idPaciente;
    private String nomePaciente;
    private String raca;
    private String especie;
    private LocalDate dataNascimento;
    private String historicoMedico;
    //Construtor vazio
    public Animal(){

    }

    //Construtor parametrizado

    public Animal(int idPaciente, String nomePaciente,
                  String raca, String especie,
                  LocalDate dataNascimento,
                  String historicoMedico) {

        this.idPaciente = idPaciente;
        this.nomePaciente = nomePaciente;
        this.raca = raca;
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.historicoMedico = historicoMedico;
    }
    //Metodos especiais

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }
}

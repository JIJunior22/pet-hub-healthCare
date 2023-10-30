package animalHealthHub.Model.Paciente;

public class AtendimentoMedico {
    //Atributos
    private int idAtendimento;
    private String diagnostico;
    private String tratamento;
    private String examesRealizados;
    private String Procedimentos;

    //Construtor vazio
    public AtendimentoMedico(){

    }
    //Construtor parametrizado

    public AtendimentoMedico(int idAtendimento, String diagnostico, String tratamento, String examesRealizados, String procedimentos) {
        this.idAtendimento = idAtendimento;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
        this.examesRealizados = examesRealizados;
        Procedimentos = procedimentos;
    }
}

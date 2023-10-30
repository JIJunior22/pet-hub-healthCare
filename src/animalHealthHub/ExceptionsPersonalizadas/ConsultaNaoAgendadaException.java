package animalHealthHub.ExceptionsPersonalizadas;

public class ConsultaNaoAgendadaException extends RuntimeException{
    public ConsultaNaoAgendadaException(){
        super("Erro: Consulta naã agendada!");
    }

}

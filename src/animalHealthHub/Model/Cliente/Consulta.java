package animalHealthHub.Model.Cliente;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    //Atributos
    private int idConsulta;
    private LocalDate data;
    private LocalTime hora;
    private String veterinarioResponsavel;
    private String motivoConsulta;

    //Construtor vazio
    public Consulta(){

    }
    //Construtor parametrizado


    public Consulta(int idConsulta, LocalDate data, LocalTime hora, String veterinarioResponsavel, String motivoConsulta) {
        this.idConsulta = idConsulta;
        this.data = data;
        this.hora = hora;
        this.veterinarioResponsavel = veterinarioResponsavel;
        this.motivoConsulta = motivoConsulta;
    }
}

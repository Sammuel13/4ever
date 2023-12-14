package modelo;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

//obrigatório
public class Participante {
    private String cpf;
    private String nascimento;
    private ArrayList<Ingresso> ingressos = new ArrayList<>();

    public Participante(String c, String n) {
        cpf = c;
        nascimento = n;
    }

    // obrigatório
    public int calcularIdade() {
        LocalDate dataNascimento = LocalDate.parse(nascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public String getCpf() {
        return cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void adicionar(Ingresso ing) {
        ingressos.add(ing);
        ing.setParticipante(this);
    }

    public void remover(Ingresso ing) {
        ingressos.remove(ing);
        ing.setParticipante(null);
    }

	@Override
	public String toString() {
		return "Participante [cpf=" + cpf + ", nascimento=" + nascimento + ", ingressos=" + ingressos + "]";
	}

    
}

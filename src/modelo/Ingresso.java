package modelo;

public class Ingresso {
	private String codigo;
	private String telefone;
	private Evento evento;
	private Participante participante;

	public Ingresso(String c, String cpf, String t) {
		codigo = c;
		telefone = t;
		// associar cpf com participante
	}

	public double calcularPreco() {
		return evento.getPreco();
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTelefone() {
		return telefone;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento e) {
		evento = e;
	}

	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante p) {
		participante = p;
	}

}
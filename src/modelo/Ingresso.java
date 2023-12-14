package modelo;

//obrigatório
public class Ingresso {
	private String codigo;
	private String telefone;
	private Evento evento;
	private Participante participante;

	public Ingresso(String c, String cpf, String t) {
		codigo = c;
		telefone = t;
	}

	// obrigatório
	public double calcularPreco() {
		return evento.getPreco() * (1 - calcularDesconto());
	}

	private double calcularDesconto() {
		double desconto = 0;
		if (participante.calcularIdade() < 18)
			desconto += .1;
		else if (participante.calcularIdade() >= 60)
			desconto += .2;
		if (participante instanceof Convidado)
			desconto += .5;
		return desconto;
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

	@Override
	public String toString() {
		return "Ingresso [codigo=" + codigo + "]";
	}
	
	

}
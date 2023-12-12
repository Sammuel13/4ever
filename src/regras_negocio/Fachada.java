package regras_negocio;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import modelo.Participante;
import modelo.Ingresso;
import modelo.Evento;
import modelo.Convidado;
import repositorio.Repositorio;

public class Fachada {
	private static Repositorio repositorio = new Repositorio();

	public static void criarEvento(String da, String de, int c, double p) throws Exception {
		if (c < 2)
			throw new Exception("capacidade invalida: " + c);
		if (p < 0)
			throw new Exception("preco invalido: " + p);
		if (da == null || da.trim().equals(""))
			throw new Exception("data invalida: " + da);
		if (de == null || de.trim().equals(""))
			throw new Exception("descricao invalida: " + de);
		int idEvento = repositorio.gerarId();
		Evento ev = new Evento(idEvento, da, de, c, p);
		repositorio.adicionar(ev);
		repositorio.salvarObjetos();
	}

	public static void criarParticipante(String cpf, String datNasc) throws Exception {
		Participante p = repositorio.localizarParticipante(cpf);
		if (p != null)
			throw new Exception("participante ja existe: " + cpf);
		if (datNasc == null || datNasc.trim().equals(""))
			throw new Exception("data invalida: " + datNasc);
		p = new Participante(cpf, datNasc);
		repositorio.adicionar(p);
		repositorio.salvarObjetos();
	}

	public static void criarConvidado(String cpf, String datNasc, String empresa) throws Exception {
		Participante p = repositorio.localizarParticipante(cpf);
		if (p != null)
			throw new Exception("convidado ja existe: " + cpf);
		if (datNasc == null || datNasc.trim().equals(""))
			throw new Exception("data invalida: " + datNasc);
		if (empresa == null || empresa.trim().equals(""))
			throw new Exception("empresa invalida: " + empresa);
		p = new Convidado(cpf, datNasc, empresa);
		repositorio.adicionar(p);
		repositorio.salvarObjetos();
	}

	public static void criarIngresso(int idEvento, String cpf, String telefone) throws Exception {
		Participante p = repositorio.localizarParticipante(cpf);
		if (p == null)
			throw new Exception("participante inexistente: " + cpf);
		Evento e = repositorio.localizarEvento(idEvento);
		if (e == null)
			throw new Exception("evento inexistente: " + idEvento);
		if (e.quantidadeIngressos() >= e.getCapacidade())
			throw new Exception("evento lotado: " + idEvento);
		if (telefone == null || telefone.trim().equals(""))
			throw new Exception("telefone invalido: " + telefone);
		Ingresso i = repositorio.localizarIngresso(idEvento + "-" + cpf);
		if (i != null)
			throw new Exception("ingresso ja existe: " + idEvento + "-" + cpf);

		i = new Ingresso(idEvento + "-" + cpf, cpf, telefone);

		i.setEvento(e);
		i.setParticipante(p);
		e.adicionar(i);
		p.adicionar(i);
		repositorio.adicionar(i);
		repositorio.salvarObjetos();
	}

	public static void apagarEvento(int idEvento) throws Exception {
		Evento e = repositorio.localizarEvento(idEvento);
		if (e == null)
			throw new Exception("evento inexistente: " + idEvento);
		if (e.quantidadeIngressos() > 0)
			throw new Exception("evento com ingressos vendidos: " + idEvento);

		repositorio.remover(e);
		repositorio.salvarObjetos();
	}

	public static void apagarParticipante(String cpf) throws Exception {
		Participante p = repositorio.localizarParticipante(cpf);
		if (p == null)
			throw new Exception("participante inexistente: " + cpf);

		if (p.getIngressos().isEmpty()) {
			repositorio.remover(p);
			return;
		}

		LocalDate dataUltimoIngresso = LocalDate
				.parse(p.getIngressos().get(p.getIngressos().size() - 1).getEvento().getData(), repositorio.df);
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataUltimoIngresso, dataAtual);

		if (periodo.getDays() < 0)
			throw new Exception("participante tem ingressos");
		// else
		// for (Ingresso i : p.getIngressos())
		// apagarIngresso(i.getCodigo());

		else if (p.getIngressos().size() > 0)
			for (int i = p.getIngressos().size() - 1; i >= 0; i--)
				apagarIngresso(p.getIngressos().get(i).getCodigo());

		repositorio.remover(p);
		repositorio.salvarObjetos();
	}

	public static void apagarConvidado(String cpf) throws Exception {
		apagarParticipante(cpf);
	}

	public static void apagarIngresso(String codigo) throws Exception {
		Ingresso i = repositorio.localizarIngresso(codigo);
		if (i == null)
			throw new Exception("ingresso inexistente: " + codigo);

		i.getEvento().remover(i);
		i.getParticipante().remover(i);
		repositorio.remover(i);
		repositorio.salvarObjetos();
	}

	public static ArrayList<Participante> listarParticipantes() {
		return repositorio.getParticipantes();
	}

	public static ArrayList<Ingresso> listarIngressos() {
		return repositorio.getIngressos();
	}

	public static ArrayList<Evento> listarEventos() {
		return repositorio.getEventos();
	}

}

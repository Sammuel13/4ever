package repositorio;

import java.util.ArrayList;

import modelo.Participante;
import modelo.Ingresso;
import modelo.Evento;

public class Repositorio {
	private ArrayList<Evento> eventos = new ArrayList<>();
	private ArrayList<Participante> participantes = new ArrayList<>();
	private ArrayList<Ingresso> ingressos = new ArrayList<>();;

	public void adicionar(Evento t) 	{
		eventos.add(t);
	}
	public void remover(Evento t) {
		eventos.remove(t);
	}
	public Evento localizarTurma(int id) {
		for(Evento t : eventos)
			if (t.getId() == id)	return t;

		return null;
	}

	public void adicionar(Participante a) 	{
		participantes.add( a);
	}
	public void remover(Participante a) {
		participantes.remove(a);
	}
	public Participante localizarAluno(String nome) {
		for(Participante a: participantes)
			if(a.getNome().equals(nome))
				return a;
		return null;
	}
	

	public void adicionar(Ingresso p) 	{
		ingressos.add(p);
	}
	public void remover(Ingresso p) {
		ingressos.remove(p);
	}
	public Ingresso localizarProfessor(String nome) {
		for(Ingresso p: ingressos)
			if(p.getNome().equals(nome))
				return p;
		return null;
	}


	public ArrayList<Evento> getTurmas() {
		return eventos;
	}
	public ArrayList<Participante> getAlunos() {
		return participantes;
	}
	public ArrayList<Ingresso> getProfessores() {
		return ingressos;
	}

	public int getTotalTurmas(){
		return eventos.size();
	}
	public int getTotalAlunos(){
		return participantes.size();
	}
	public int getTotalProfessores(){
		return ingressos.size();
	}

	
	public int gerarId() {
		if (eventos.isEmpty())
			return 1;
		else {
			Evento ultima = eventos.get(eventos.size()-1);
			return ultima.getId() + 1;
		}
	}
}

package modelo;

import java.util.ArrayList;

public class Evento {
	private int id;
	private String data;
	private String descricao;
	private int capacidade;
	private double preco;
	private ArrayList<Ingresso> ingressos = new ArrayList<>();

	public Evento(int id, String da, String de, int c, double p) throws Exception {
		if (c < 2)
			throw new Exception("capacidade invalida: " + c);
		if (preco < 0)
			throw new Exception("preco invalido: " + p);
		this.id = id;
		data = da;
		descricao = de;
		capacidade = c;
		preco = p;
	}

	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public double getPreco() {
		return preco;
	}

	public boolean lotado() {
		return ingressos.size() == capacidade;
	}

	public ArrayList<Ingresso> getIngressos() {
		return ingressos;
	}

	public int quantidadeIngressos() {
		return ingressos.size();
	}

	public double totalArrecadado() {
		return ingressos.size() * preco;
	}

	public void adicionar(Ingresso ing) throws Exception {
		if (lotado())
			throw new Exception("evento lotado");
		ingressos.add(ing);
		ing.setEvento(this);
	}

	public void remover(Ingresso ing) {
		ingressos.remove(ing);
		ing.setEvento(null);
	}

}

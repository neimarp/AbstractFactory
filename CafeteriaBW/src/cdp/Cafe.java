package cdp;

import java.util.ArrayList;

public class Cafe {
	private String nome;
	private double valor;
	private ArrayList<Ingrediente> ingredientes= new ArrayList<Ingrediente>();
	
	public void setIngredientes(Ingrediente ... ingredientes) {
		for(Ingrediente valor : ingredientes){
			this.ingredientes.add(valor);
		}
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	/*
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	
	public double getValor() {
		return valor;
	}
	*/
	
	@Override
    public String toString() {
        return "Cafe{" + "tipo=" + nome + " valor=" + valor + "}"+"\nComposicao: "+ingredientes;
    }

}

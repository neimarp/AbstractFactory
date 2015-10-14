package cdp;

public abstract class Ingrediente {
	private String nome;
	private int qtd;
	private String unidade;
	public Ingrediente(String nome, int qtd,String unidade){
		this.nome=nome;
		this.qtd=qtd;
		this.unidade=unidade;
	}
	public String getNome(){
		return nome;
	}
	@Override
	public String toString()
    {
        return nome+" "+qtd+unidade;
    }
}

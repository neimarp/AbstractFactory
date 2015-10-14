package util;

import cdp.Acucar;
import cdp.Agua;
import cdp.Cafe;
import cdp.CafeDescafeinado;
import cdp.Ingrediente;
import cdp.Leite;

public class FabricaCafeDescafeinado implements Fabrica {

	@Override
	public Cafe criaCafe() {
		Cafe cafe = new Cafe();
		cafe.setNome("Descafeinado");
		cafe.setValor(3.00);
		return cafe;
	}

	@Override
	public Ingrediente[] setIngrendientes() {
		Ingrediente[] ing= new Ingrediente[4];
		ing[0]=(new Agua(100));
		ing[1]=(new CafeDescafeinado(50));
		ing[2]=(new Acucar(200));
		ing[3]=(new Leite(100));
		return ing;
	}

}

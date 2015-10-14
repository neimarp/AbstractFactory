package util;

import cdp.Acucar;
import cdp.Agua;
import cdp.Cafe;
import cdp.CafeSoluvel;
import cdp.Ingrediente;
import cdp.Leite;

public class FabricaCafeNormal implements Fabrica {

	@Override
	public Cafe criaCafe() {
		Cafe cafe = new Cafe();
		cafe.setNome("Normal");
		cafe.setValor(2.00);
		return cafe;
	}

	@Override
	public Ingrediente[] setIngrendientes() {
		Ingrediente[] ing= new Ingrediente[4];
		ing[0]=(new Agua(100));
		ing[1]=(new CafeSoluvel(50));
		ing[2]=(new Acucar(200));
		ing[3]=(new Leite(100));
		return ing;
	}

}

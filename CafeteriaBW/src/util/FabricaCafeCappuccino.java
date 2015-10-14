package util;


import cdp.Acucar;
import cdp.Agua;
import cdp.Bicabornato;
import cdp.Cafe;
import cdp.CafeSoluvel;
import cdp.Canela;
import cdp.Chocolate;
import cdp.Ingrediente;
import cdp.LeitePo;

public class FabricaCafeCappuccino implements Fabrica {

	@Override
	public Cafe criaCafe() {
		Cafe cafe = new Cafe();
		cafe.setNome("Cappuccino");
		cafe.setValor(5.00);
		cafe.setIngredientes(new Agua(100), new CafeSoluvel(100), new Acucar(200), new LeitePo(100), new Chocolate(50),new Bicabornato(1),new Canela(1));
		return cafe;
	}

	@Override
	public Ingrediente[] setIngrendientes() {
		
		Ingrediente[] ing= new Ingrediente[7];
		ing[0]=(new Agua(100));
		ing[1]=(new CafeSoluvel(100));
		ing[2]=(new Acucar(200));
		ing[3]=(new LeitePo(100));
		ing[4]=(new Chocolate(50));
		ing[5]=(new Bicabornato(1));
		ing[6]=(new Canela(1));
		return ing;
	}

}

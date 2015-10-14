package util;

import cdp.Cafe;

public class FabricaCafe {

	public static Cafe criaCafe(String tipoCafe) {
		Fabrica fabrica = null;
		switch (tipoCafe){
		case "normal":
			fabrica = new FabricaCafeNormal();
			break;
		case "descafeinado":
			fabrica = new FabricaCafeDescafeinado();
			break;
		case "cappuccino":
			fabrica = new FabricaCafeCappuccino();
			break;
		}
		Cafe cafe;
		cafe = fabrica.criaCafe();
		cafe.setIngredientes(fabrica.setIngrendientes());
		return cafe;
	}
	

}

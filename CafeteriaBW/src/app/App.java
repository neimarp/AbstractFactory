package app;

import cdp.*;
import util.*;

public class App {

	public static void main(String[] args) {
		//Cafe teste = FabricaCafe.
		Cafe cafe = FabricaCafe.criaCafe("normal");
        System.out.println(cafe);
        
        cafe = FabricaCafe.criaCafe("descafeinado");
        System.out.println(cafe);
        
        cafe = FabricaCafe.criaCafe("cappuccino");
        System.out.println(cafe);
       
	}

}

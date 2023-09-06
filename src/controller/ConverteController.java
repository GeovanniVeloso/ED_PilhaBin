package controller;
import model.PlhaInt;
import model.No;

public class ConverteController {

	public ConverteController() {
		super();
	}
	
	public String ConverteBin(int valor) {
		PlhaInt p = new PlhaInt();
		int rest;
		while(valor>=1) {
			rest = valor%2;
			valor = valor/2;
			p.push(rest);
		}
		String bin = "";
		try {
		while(!p.isEmpty()) {
				bin += Integer.toString(p.pop());
			}
			}catch (Exception e) {
				System.err.println(e);
		}
		return bin;
	}

}

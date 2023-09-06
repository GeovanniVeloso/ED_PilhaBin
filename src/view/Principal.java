package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController cc = new ConverteController();
		String binv = "";
		int n;
		do {
			
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor a ser convertido"));
			
		}while(n<=1000);
		try {
			binv = cc.ConverteBin(n);
		} catch (Exception e) {
			System.err.println(e);
		}
		System.out.println(binv);
		

	}

}

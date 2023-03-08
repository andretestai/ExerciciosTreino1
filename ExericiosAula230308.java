package br.com.fiap;

import javax.swing.JOptionPane;

public class ExericiosAula230308 {

	public static void main(String[] args) {
		float prova1 = 0, prova2 = 0, prova3= 0, prova4= 0;
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite a nota da prova 1: ");
			prova1 = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digite a nota da prova 2: ");
			prova2 = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digite a nota da prova 3: ");
			prova3 = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digite a nota da prova 4: ");
			prova4 = Float.parseFloat(aux);
			JOptionPane.showMessageDialog(null, "Sua média é de: " + ((prova1+prova2+prova3+prova4)/4));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Formato inváildo!");
		}

	}

}

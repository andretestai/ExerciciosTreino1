package br.com.fiap;

import javax.swing.JOptionPane;

public class ExercicioAula230308Parte3 {

	public static void main(String[] args) {
		float raio = 0, pi= 3.14f;
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog(null, "Digite o raio da área: ");
			raio = Float.parseFloat(aux);
			JOptionPane.showMessageDialog(null, "A área será de: " + ((raio * raio) * pi) );
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato inválido!");
		}

	}

}

package prjMegaSena;

import javax.swing.JOptionPane;

public class Aplicacao {

	public static void main(String[] args) {
		
		int [] a = new int [6];
		
		for(int i=0;i<a.length;i++)
		{
			 a[i]=(int)Double.parseDouble(JOptionPane.showInputDialog("Digite um numero de 0 a 60 "));		
			 System.out.print(" "+ a[i] );
		}
		
		
		
 }// fim main
}// fim Aplicação

package listajava03_ifelseifelse_ternario;

import java.util.Scanner;

public class listajava03_01 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*01. Escreva um programa que leia um n�mero e informe 'par' ou '�mpar'. */

	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	
//forma 1:
	
	if (numero %2 == 0) System.out.println("Par.");
	else System.out.println("�mpar.");

	
//forma 2:
	
	String resultado = (numero %2 == 0) ? ("Par.")
			: ("�mpar.");
	System.out.println(resultado);
	
			
teclado.close();		
		
	}

}

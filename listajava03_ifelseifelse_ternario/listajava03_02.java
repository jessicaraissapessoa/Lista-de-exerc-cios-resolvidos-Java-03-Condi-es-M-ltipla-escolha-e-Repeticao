package listajava03_ifelseifelse_ternario;

import java.util.Scanner;

public class listajava03_02 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*02. Fa�a um programa que pe�a um valor e mostre na tela se o valor � 'positivo' (<0) ou 'negativo' (<0). */

	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	if (numero < 0) System.out.println(numero + " � um n�mero negativo.");
	else if (numero > 0) System.out.println(numero + " � um n�mero positivo.");
	else System.out.println(numero + " n�o � positivo nem negativo.");

			
teclado.close();		
		
	}

}

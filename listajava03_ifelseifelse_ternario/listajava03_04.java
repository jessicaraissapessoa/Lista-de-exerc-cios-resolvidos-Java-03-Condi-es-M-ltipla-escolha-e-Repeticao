package listajava03_ifelseifelse_ternario;

import java.util.Scanner;

public class listajava03_04 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*04. Escreva um algoritmo que receba um n�mero e imprima uma das mensagens: "� m�ltiplo de 3" ou "N�o � m�ltiplo de 3". */

	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
//forma 1:
	
	if (numero %3 == 0) System.out.println(numero + " � m�ltiplo de 3.");
	else System.out.println(numero + " n�o � m�ltiplo de 3.");


//forma 2:
	
	String resultado = (numero %3 == 0) ? (numero + " n�o � m�ltiplo de 3.") : (numero + " n�o � m�ltiplo de 3.");
	System.out.println(resultado);
	
	
teclado.close();		
		
	}

}

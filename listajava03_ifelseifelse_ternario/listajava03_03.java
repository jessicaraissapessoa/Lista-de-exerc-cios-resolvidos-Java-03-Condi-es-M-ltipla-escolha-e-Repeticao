package listajava03_ifelseifelse_ternario;

import java.util.Scanner;

public class listajava03_03 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*03. Leia dois n�meros e efetue a adi��o. Caso o valor resultante da adi��o seja maior que 20, esse dever� ser apresentado somando a ele 8.
 * Caso o valor resultante da adi��o seja menor ou igual a 20, esse dever� ser apresentado subtraindo dele 5. */

	System.out.println("Informe o primeiro n�mero: ");
	int num1 = teclado.nextInt();
	
	System.out.println("Informe o segundo n�mero: ");
	int num2 = teclado.nextInt();
	
	int soma = num1 + num2;
	
	int maiorque20 = soma + 8;
	int menorigual20 = soma - 5;

	
//forma 1:
	
	if (soma > 20)
	{
		System.out.println(num1 + " + " + num2 + " = " + soma);
		System.out.println(soma + " + 8 = " + maiorque20);
	}
	else
	{
		System.out.println(num1 + " + " + num2 + " = " + soma);
		System.out.println(soma + " - 5 = " + menorigual20);
	}

	
//forma 2:
	
	String resultado = (soma > 20) ? (soma + " + 8 = " + maiorque20) : (soma + " - 5 = " + menorigual20);
	System.out.println(resultado);
	
			
teclado.close();		
		
	}

}

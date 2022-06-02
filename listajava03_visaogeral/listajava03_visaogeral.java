package listajava03_visaogeral;

import java.text.DecimalFormat;
import java.util.Scanner;

public class listajava03_visaogeral {

	public static void main(String[] args) {
	
//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
/*


//if/else if/else; Tern�rio 
 

	/*01. Escreva um programa que leia um n�mero e informe 'par' ou '�mpar'.

	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	
	//forma 1:
	
	if (numero %2 == 0) System.out.println("Par.");
	else System.out.println("�mpar.");

	
	//forma 2:
	
	String resultado = (numero %2 == 0) ? ("Par.")
			: ("�mpar.");
	System.out.println(resultado);
		
		
		
		
	/*02. Fa�a um programa que pe�a um valor e mostre na tela se o valor � 'positivo' (<0) ou 'negativo' (<0).

	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	if (numero < 0) System.out.println(numero + " � um n�mero negativo.");
	else if (numero > 0) System.out.println(numero + " � um n�mero positivo.");
	else System.out.println(numero + " n�o � positivo nem negativo.");
		
		
		
		
	/*03. Leia dois n�meros e efetue a adi��o. Caso o valor resultante da adi��o seja maior que 20, esse dever� ser apresentado somando a ele 8.
	Caso o valor resultante da adi��o seja menor ou igual a 20, esse dever� ser apresentado subtraindo dele 5.

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
		
		
		
		
	/*04. Escreva um algoritmo que receba um n�mero e imprima uma das mensagens: "� m�ltiplo de 3" ou "N�o � m�ltiplo de 3". 

	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	//forma 1:
	
	if (numero %3 == 0) System.out.println(numero + " � m�ltiplo de 3.");
	else System.out.println(numero + " n�o � m�ltiplo de 3.");


	//forma 2:
	
	String resultado = (numero %3 == 0) ? (numero + " n�o � m�ltiplo de 3.") : (numero + " n�o � m�ltiplo de 3.");
	System.out.println(resultado);

		
		
		
//M�ltipla escolha: switch-case
 

	/*05. Fa�a um programa que verifique se uma letra digitada � "F" ou "M". Conforme a letra, imprimir: "F - Feminino", "M - Masculino", "Sexo Inv�lido".

	System.out.println("Informe 'F' para feminino ou 'M' para masculino: ");
	String foum = teclado.next();
	
	
	switch (foum.toUpperCase())
	{
	case "F": System.out.println("Feminino.");
	break;
	case "M": System.out.println("Masculino.");
	break;
	default: System.out.println("Sexo inv�lido.");
	}
		
		
		
		
	/*06. Implemente um programa que informe se uma letra que foi informada � uma vogal.

	System.out.println("Informe uma letra: ");
	String letra = teclado.next();
	
	
	switch (letra.toLowerCase())
	{
	case "a": System.out.println(letra + " � uma vogal.");
	break;
	case "e": System.out.println(letra + " � uma vogal.");
	break;
	case "i": System.out.println(letra + " � uma vogal.");
	break;
	case "o": System.out.println(letra + " � uma vogal.");
	break;
	case "u": System.out.println(letra + " � uma vogal.");
	break;
	default: System.out.println(letra + " n�o � uma vogal.");
	}
		
		
		
		
	/*07. Escreva um programa para imprimir o menu abaixo:
	1 - Solteiro(a)
	2 - Desquitado(a)
	3 - Casado(a)
	4 - Divorciado(a)
	5 - Vi�vo(a)
	O usu�rio dever� selecionar uma das op��es do menu. O programa dever� imprimir o estado civil de acordo com a op��o selecionada pelo usu�rio.
	Uma mensagem de erro dever� ser emitida caso seja selecionada uma op��o inexistente.

	System.out.println("Informe o n�mero para escolher uma das op��es de estado civil: \n");
	System.out.println("1 - Solteiro(a)");
	System.out.println("2 - Desquitado(a)");
	System.out.println("3 - Casado(a)");
	System.out.println("4 - Divorciado(a)");
	System.out.println("5 - Vi�vo(a)");
	
	
	int estadocivil = teclado.nextInt();
	
	
	switch (estadocivil)
	{
	case 1: System.out.println("Voc� � solteiro(a).");
	break;
	case 2: System.out.println("Voc� � desquitado(a)");
	break;
	case 3: System.out.println("Voc� � casado(a)");
	break;
	case 4: System.out.println("Voc� � Divorciado(a)");
	break;
	case 5: System.out.println("Voc� � vi�vo(a)");
	break;
	default: System.out.println("Op��o inv�lida");
	}
		
		
		
		
	/*08. Implemente um programa que realize uma das quatro opera��es (+), (-), (*) ou (/) entre duas vari�veis
	a partir da escolha do usu�rio.

	System.out.println("Digite '+', '-', '*' ou '/' para escolher qual opera��o matem�tica deseja realizar: \n");
	System.out.println("+ - Adi��o");
	System.out.println("- - Subtra��o");
	System.out.println("* - Multiplica��o");
	System.out.println("/ - Divis�o \n");
	
	String operacao = teclado.next();
	
	System.out.println("Escolha o primeiro n�mero da opera��o: ");
	double num1 = teclado.nextDouble();
	System.out.println("Escolha o segundo n�mero da opera��o: ");
	double num2 = teclado.nextDouble();
		

	switch (operacao)
	{
	case "+": 
		{
			double adicao = num1 + num2;
			
			System.out.println(num1 + " + " + num2 + " = " + adicao);
		}
	break;
	
	case "-": 
		{
			double subtra��o = num1 - num2;
			
			System.out.println(num1 + " - " + num2 + " = " + subtra��o);
		}
	break;
	
	case "*": 
		{
			double multiplicacao = num1 * num2;
			
			System.out.println(num1 + " * " + num2 + " = " + multiplicacao);
		}
	break;
	
	case "/": 
		{
			double divisao = num1 / num2;
			
			System.out.println(num1 + " / " + num2 + " = " + divisao);
		}
	break;
	
	default: System.out.println("Op��o inv�lida");
	}
	
		
		
		
//Repeti��o
 

	/*09. Escrever seu nome na tela 10 vezes. Um nome por linha.

	int contagem = 1;
	
	while (contagem <=10)
	{
		System.out.println("J�ssica Raissa Pessoa");
		contagem++;
	}
		
		
		
		
	/*10. Imprimir os n�meros pares de 2 a 50.

	for (int numero = 2; numero <= 50; numero++)
	{
		if (numero %2 == 0) System.out.println(numero);
	}
		
		
		
		
	/*11. Imprimir os n�meros 11, 21, 31,..., 101.

	int numero = 11;

	while (numero <= 101)
	{
	System.out.println(numero);
	numero = numero + 10;
	}
		
		
		
		
	/*12. Exibir a soma dos n�meros compreendidos de 1 a 5.

	int soma = 0;
	int numero = 1;

	while (numero <= 5)
	{
	soma = soma + numero;
	numero++;
	}

	System.out.println(soma);
			
	teclado.close();
		
		
		
		
	*13. Desenvolver um programa que efetue a soma de todos os n�meros �mpares que s�o m�ltiplos de tr�s
	e que se encontram no conjunto dos n�meros de 1 a 100.

	int soma = 0;
	
	for ( int numero = 1; numero <= 100; numero++)
	{
		
		if  (numero %2 != 0)
		{
			
			if (numero %3 == 0)
			{
				
				soma = soma + numero;
				
			}
			
		}
		
	}


	System.out.println("A soma dos n�meros �mpares e m�ltiplos de 3 de 1 a 100 �: " + soma);
		
		
		
		
	/*14. Escreva um programa que gere os n�meros de 1000 a 1999, designando se s�o ou n�o divis�veis por 11
	e se o m�dulo (resto) da divis�o por 11 � ou n�o 5.
	A sa�da do programa deve seguir o seguinte exemplo:
	Ex:
	1000 n�o � divis�vel por 11 e o m�dulo da divis�o n�o � 5.
	1001 � divis�vel por 11 e o m�dulo da divis�o n�o � 5.
	1017 n�o � divis�vel por 11 e o m�dulo da divis�o � 5.*/

	
	for ( int numero = 1000; numero <= 1999; numero++)
	{
		
		if (numero %11 == 0) System.out.println(numero + " � divis�vel por 11 e o m�dulo da divis�o n�o � 5.");
		else if (numero %11 == 5) System.out.println(numero + " n�o � divis�vel por 11 e o m�dulo da divis�o � 5.");
		else System.out.println(numero + " n�o � divis�vel por 11 e o m�dulo da divis�o n�o � 5.");
			
	}
			
	
	
	
	//Desafio
	 

	/*DESAFIO
	 * Escreva um programa que leia os n�meros de 1999 para 100 e:
	 * a) Mostre quais s�o divis�veis por 11: 
	 *    quantos s�o, qual o resultado da soma entre esses n�meros, quantos s�o pares e quantos s�o �mpares;
	 * b) Mostre quais n�o s�o divis�veis por 11 cujo m�dulo da divis�o por 11 seja 5: 
	 *    quantos s�o, qual o resultado da soma entre esses n�meros, quantos s�o pares e quantos s�o �mpares;
	 * c) Informe a quantidade de n�meros de 1999 a 100;
	 * d) Informe a soma dos n�meros de 1999 a 100.


	/*a) Mostre quais s�o divis�veis por 11: 
	quantos s�o, qual o resultado da soma entre esses n�meros, quantos s�o pares e quantos s�o �mpares;

	int contadorgeralA = 0;
	int contadorparesA = 0;
	int contadorimparesA = 0;

	int somaA = 0;

		for (int numeroA = 1999; numeroA >= 100; numeroA--)
		{
			
			if (numeroA %11 == 0)
			{
				contadorgeralA++;
				
				System.out.println(numeroA);
				
				somaA = somaA + numeroA;
				
				if (numeroA %2 == 0) contadorparesA++;
				else contadorimparesA++;
				
			}
					
		}
		
		System.out.println("Quantos n�meros divis�veis por 11 de 1999 a 100: " + contadorgeralA);
		System.out.println("A soma dos n�meros divis�veis por 11 de 1999 a 100: " + somaA);
		System.out.println("Quantos n�meros pares divis�veis por 11 de 1999 a 100: " + contadorparesA);
		System.out.println("Quantos n�meros �mpares divis�veis por 11 de 1999 a 100: " + contadorimparesA);


	/*b) Mostre quais n�o s�o divis�veis por 11 cujo m�dulo da divis�o por 11 seja 5: 
	quantos s�o, qual o resultado da soma entre esses n�meros, quantos s�o pares e quantos s�o �mpares;
		
	int contadorgeralB = 0;
	int contadorparesB = 0;
	int contadorimparesB = 0;

	int somaB = 0;

		for (int numeroB = 1999; numeroB >= 100; numeroB--)
		{
			
			if (numeroB %11 == 5)
			{
				
				contadorgeralB++;
				
				System.out.println(numeroB);
				
				somaB = somaB + numeroB;
				
				if (numeroB %2 == 0) contadorparesB++;
				else contadorimparesB++;
					
			}
			
		}
		
		System.out.println("Quantos n�meros n�o divis�veis por 11 com m�dulo 5 de 1999 a 100: " + contadorgeralB);
		System.out.println("A soma dos n�meros n�o divis�veis por 11 com m�dulos 5 de 1999 a 100: " + somaB);
		System.out.println("Quantos n�meros pares n�o divis�veis por 11 com m�dulo 5 de 1999 a 100: " + contadorparesB);
		System.out.println("Quantos n�meros �mpares divis�veis por 11 com m�dulo 5 de 1999 a 100: " + contadorimparesB);
		
		
	/*c) Informe a quantidade de n�meros de 1999 a 100;
		
	int contadorgeralC = 0;

		for (int numeroC = 1999; numeroC >= 100; numeroC--)
		{
			
			contadorgeralC++;
			
		}
		
		System.out.println("Quantidade de n�meros de 1999 a 100: " + contadorgeralC);
		
		
	/*d) d) Informe a soma dos n�meros de 1999 a 100.
		
	int somaD = 0;

		for (int numeroD = 1999; numeroD >= 100; numeroD--)
		{
			somaD = somaD + numeroD;
		}
		
		System.out.println("Soma dos n�meros de 1999 a 100: " + somaD);
				
		
				
		
*/		
teclado.close();		

	}

}

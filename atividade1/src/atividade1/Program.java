package atividade1;

public class Program {

	public static void main(String[] args) {
		
		//  1. um algoritmo que armazene um valor em uma vari�vel A 
		//  e outro valor em uma vari�vel B e imprima a divis�o das
		//  duas.

		int num1 = 6;
		int num2 = 2;
		int div = num1 / num2;
		System.out.println(num1+" dividido por "+num2+" � "+div);
		
		//  um c�digo no qual L� um valor num�rico de uma
		//  vari�vel e imprime o seu sucessor.
		
		int numero = 10;
		int sucessor = numero + 1;
		System.out.println("o sucessor do "+numero+" � "+sucessor);
		
		//  altere o c�digo anterior para que imprima tamb�m o antecessor.
		
		int numA = 10;
		int antecessor = numA - 1;
		System.out.println("o antecessor do "+numA+" � "+antecessor);
		
		// calcular o quanto gasta um fumante. 
		
		float num_anos = 10;
		float num_cig = 20;
		float precoc = 10;
		float precou = precoc/20;
		float gastou = (num_cig * precou * 365 * num_anos);
		System.out.println("o fumante que fuma a 10 anos gastou "+gastou+"R$ em cigarro");

		// qual das op��es abaixo inclui apenas nomes v�lidos para
		// vari�veis na linguagem Java.
		
		// a) if, 2a, num, _good
		// b) i, a, String, class
		// c) num, cor, man, saldo
		// d) 3Num, a, b, c
		
		// resposta: letra c
		
		// escreva um programa que l� duas notas de um aluno (nota1 e
		// nota2). e calcule a m�dia do aluno e depois imprima a
	    // mesma na tela.
		
		float nota1 = 8;
		float nota2 = 6;
		float media = (nota1 + nota2) / 2;
		System.out.println("a m�dia do aluno � "+media);
		
		// inicie o programa com uma vari�vel nome que receber� o nome do
		// aluno e imprima na tela algo como:
		
		float notaum = 8;
		float notadois = 6;
		float media1 = (notaum + notadois) / 2;
		String nome = "Daniell Wendyson";
		System.out.println("C�LCULO DA M�DIA"+"\nAluno: "+nome+"\nNota 1: "+notaum+"\nNota 2: "+notadois+"\nM�dia: "+media1);
		
		// um c�digo que tem tr�s vari�veis, nome, peso e
		// altura de uma pessoa. calcule o IMC e imprima na tela.
		
		String nome1 = "Daniell Wendyson";
		double peso = 60;
		double altura = 1.75;
		double imc = peso / altura * 2;
		System.out.println("C�UCULO IMC"+"\nNome: "+nome1+"\nPeso: "+peso+"\nAltura: "+altura+"\nIMC: "+imc);
		
		// um programa que l� uma temperatura fornecida em 
		// graus Celsius (�C) e converta para graus Fahrenheit (�F)
		
		float c = 23;
		double f = (c * 1.8) + 32;
		System.out.println("a temperatura em celcius "+c+"C convertida para fahrenheit � "+f+"F");
		
		double valor_hora = 5;
		double num_hora = 8;
		double recebe = ((valor_hora * num_hora) * 30);
		double recebera = recebe + recebe * 5 / 100;
		System.out.println("o trabalhador recebe "+recebera+" por m�s.");
		
		// um c�digo que armazene o valor 10 numa vari�vel A e 20 na vari�vel B.
		// imprima o valor das duas. depois, A recebe o valor de B e B o valor de A
		// e imprima os novos valores na tela.
		
		int numeroum = 10;
		int numerodois = 20;
		int aux;
		
		System.out.println("n�mero um vale: "+numeroum+"\nn�mero dois vale: "+numerodois);
		System.out.println("agora vamos trocar os valores entre numero um e numero dois!");
		
		aux = numeroum;
		numeroum = numerodois;
		numerodois = aux;
		
		System.out.println("num�ro um vale: "+numeroum+"\nn�mero dois vale: "+numerodois);
		
		
		
		
		
		

	}

}
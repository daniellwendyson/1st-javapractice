package atividade1;

public class Program {

	public static void main(String[] args) {
		
		//  1. um algoritmo que armazene um valor em uma variável A 
		//  e outro valor em uma variável B e imprima a divisão das
		//  duas.

		int num1 = 6;
		int num2 = 2;
		int div = num1 / num2;
		System.out.println(num1+" dividido por "+num2+" é "+div);
		
		//  um código no qual Lê um valor numérico de uma
		//  variável e imprime o seu sucessor.
		
		int numero = 10;
		int sucessor = numero + 1;
		System.out.println("o sucessor do "+numero+" é "+sucessor);
		
		//  altere o código anterior para que imprima também o antecessor.
		
		int numA = 10;
		int antecessor = numA - 1;
		System.out.println("o antecessor do "+numA+" é "+antecessor);
		
		// calcular o quanto gasta um fumante. 
		
		float num_anos = 10;
		float num_cig = 20;
		float precoc = 10;
		float precou = precoc/20;
		float gastou = (num_cig * precou * 365 * num_anos);
		System.out.println("o fumante que fuma a 10 anos gastou "+gastou+"R$ em cigarro");

		// qual das opções abaixo inclui apenas nomes válidos para
		// variáveis na linguagem Java.
		
		// a) if, 2a, num, _good
		// b) i, a, String, class
		// c) num, cor, man, saldo
		// d) 3Num, a, b, c
		
		// resposta: letra c
		
		// escreva um programa que lê duas notas de um aluno (nota1 e
		// nota2). e calcule a média do aluno e depois imprima a
	    // mesma na tela.
		
		float nota1 = 8;
		float nota2 = 6;
		float media = (nota1 + nota2) / 2;
		System.out.println("a média do aluno é "+media);
		
		// inicie o programa com uma variável nome que receberá o nome do
		// aluno e imprima na tela algo como:
		
		float notaum = 8;
		float notadois = 6;
		float media1 = (notaum + notadois) / 2;
		String nome = "Daniell Wendyson";
		System.out.println("CÁLCULO DA MÉDIA"+"\nAluno: "+nome+"\nNota 1: "+notaum+"\nNota 2: "+notadois+"\nMédia: "+media1);
		
		// um código que tem três variáveis, nome, peso e
		// altura de uma pessoa. calcule o IMC e imprima na tela.
		
		String nome1 = "Daniell Wendyson";
		double peso = 60;
		double altura = 1.75;
		double imc = peso / altura * 2;
		System.out.println("CÁUCULO IMC"+"\nNome: "+nome1+"\nPeso: "+peso+"\nAltura: "+altura+"\nIMC: "+imc);
		
		// um programa que lê uma temperatura fornecida em 
		// graus Celsius (°C) e converta para graus Fahrenheit (°F)
		
		float c = 23;
		double f = (c * 1.8) + 32;
		System.out.println("a temperatura em celcius "+c+"C convertida para fahrenheit é "+f+"F");
		
		double valor_hora = 5;
		double num_hora = 8;
		double recebe = ((valor_hora * num_hora) * 30);
		double recebera = recebe + recebe * 5 / 100;
		System.out.println("o trabalhador recebe "+recebera+" por mês.");
		
		// um código que armazene o valor 10 numa variável A e 20 na variável B.
		// imprima o valor das duas. depois, A recebe o valor de B e B o valor de A
		// e imprima os novos valores na tela.
		
		int numeroum = 10;
		int numerodois = 20;
		int aux;
		
		System.out.println("número um vale: "+numeroum+"\nnúmero dois vale: "+numerodois);
		System.out.println("agora vamos trocar os valores entre numero um e numero dois!");
		
		aux = numeroum;
		numeroum = numerodois;
		numerodois = aux;
		
		System.out.println("numéro um vale: "+numeroum+"\nnúmero dois vale: "+numerodois);
		
		
		
		
		
		

	}

}
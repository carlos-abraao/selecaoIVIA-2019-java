package br.com.ivia.selecao;

public class Contador {
	
	//Metodo "numero" recebe um número qualquer e retorna a quatidade de letras contidas em cada um dos númeoros que o compõem (ex: 1000 = 1 ("um"), 0 ("zero"), 0 ("zero"), 0 ("zero"). 14 letras).
	public int numero(int n){
		//O vetor "qtde" armazena a quantidade de letras dos números de 0 a 9 (ex: qtde[1] = 2, pois "um" possui duas letras)
		int qtde[] = {4, 2, 4, 4, 6, 5, 4, 4, 4, 4};
		
		//O método procede convertendo o número recebido "n" em string, para poder acessar os algarismos facilmente.
		String str = Integer.toString(n);
		
		//A variável "comprimento" armazena a quatidade de algarismos que o número possui
		int comprimento = str.length();
		
		//A variável "retorno" irá receber a quatidade final de letras e a variavel "unidade" será utilizada de maneira auxiliar dentro do laço.
		int retorno = 0, unidade;
		
		//A variável "aux" irá receber cada algarismo nas iterações do laço. O uso dessa variável é necessário pois ao tentar converter str[i] em inteiro, o método convencional não era aceito.
		char aux;

		for (int i = 0; i < comprimento; i++) {
			//Convertendo o algarismo em str[i] para o tipo char
			aux = str.charAt(i);
			
			//A variável "unidade" recebera o algarismo da iteração atual, convertendo o conteúdo do char aux em inteiro
			unidade = Character.getNumericValue(aux);
			
			//"retorno" recebe a quantidade de letras do algarismo atual
			retorno += qtde[unidade];
		}
		return retorno;
	}

	public int acumula(int n){
		//nesse método é recebido um número "n" e, utilizando o método "numero" a quantidade de letras de 1 até "n" é calculada.
		int retorno = 0;
		for (int i = 1; i <= n ; i++) {
			retorno += numero(i);		
		}
		return retorno;
	}
}

package br.com.ivia.selecao;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContadorTests {
	//São realizados 4 testes sobre o método "numero", um para cada quantidade de algarismos do escopo do problema. Uma vez que todos os casos são validados, podemos gaarntir a corretude do método.
	@Test
	public void contarUnidade() {
		Contador contador = new Contador();
		int result = contador.numero(4);
		assertEquals(6, result);
	}
	
	@Test
	public void contarDezena() {
		Contador contador = new Contador();
		int result = contador.numero(13);
		assertEquals(6, result);
	}
	
	@Test
	public void contarCentena() {
		Contador contador = new Contador();
		int result = contador.numero(131);
		assertEquals(8, result);
	}
	
	@Test
	public void contarMil() {
		Contador contador = new Contador();
		int result = contador.numero(1000);
		assertEquals(14, result);
	}
	
	//Em seguida é ralizado um teste para o método "acumula", como o método é altamente dependente do método "número", ele também está válido.	
	@Test
	public void acumulador() {
		Contador contador = new Contador();
		int result = contador.acumula(12);
		assertEquals(53, result);
	}

}

package com.empresa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculadoraTest {

	private static int testContador = 0;
	private static int passContador = 0;

	@BeforeAll
	public static void testInicio() {
		System.out.println("********************************");
		System.out.println("*      Testes Iniciados        *");
		System.out.println("********************************");
	}

	@BeforeEach
	public void testSetup() {
		System.out.print(++testContador + "º Teste Iniciado...");
	}

	@AfterEach
	public void testEnd() {
		System.out.println("(run)!");
	}

	@AfterAll
	public static void testRelatorio() {
		System.out.println("********************************");
		System.out.println("Total de Testes = " + testContador);
		System.out.println("Sucessos = " + passContador);
		System.out.println("Falhas = " + (testContador - passContador));
		float porcentagem = ((float) passContador / testContador) * 100;
		System.out.println("Porcentagem = " + porcentagem + "%");
		System.out.println("********************************");
	}

	@Test
	public void testSoma() {
		Calculadora calc = new Calculadora();
		Assertions.assertTrue(calc.somar(2, 3) == 5);
		Assertions.assertEquals(5, calc.somar(2, 3));
		++passContador;
		System.out.print(" Pass ");
	}

	@Test
	public void testSubtrair() {
		Calculadora calc = new Calculadora();
		// Teste Valores Positivos
		Assertions.assertTrue(calc.subtrair(2, 3) == -1);
		Assertions.assertEquals(-1, calc.subtrair(2, 3));

		// Teste Valores Negativos
		Assertions.assertTrue(calc.subtrair(2, -3) == 5);
		Assertions.assertEquals(5, calc.subtrair(2, -3));

		// Teste de Valor Zero
		Assertions.assertTrue(calc.subtrair(2, 0) == 2);
		Assertions.assertEquals(2, calc.subtrair(2, 0));
		++passContador;
		System.out.print(" Pass ");
	}

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		// Teste Valores Positivos
		Assertions.assertTrue(calc.somar(2, 3) == 5);
		Assertions.assertEquals(5, calc.somar(2, 3));

		// Teste Valores Negativos
		Assertions.assertTrue(calc.somar(2, -3) == -1);
		Assertions.assertEquals(-1, calc.somar(2, -3));

		// Teste de Valor Zero
		Assertions.assertTrue(calc.somar(2, 0) == 2);
		Assertions.assertEquals(2, calc.somar(2, 0));
		++passContador;
		System.out.print(" Pass ");
	}

	@Test
	public void testDividirValoresInteiroPositivosRetornaInteiro() {
		Calculadora calc = new Calculadora();
		float resultado = calc.dividir(4, 2);
		Assertions.assertEquals(2, resultado);
		++passContador;
		System.out.print(" Pass ");
	}

	@Test
	public void testDividirValoresInteiroPositivosRetornaNegativo() {
		Calculadora calc = new Calculadora();
		float resultado = calc.dividir(6, -3);
		Assertions.assertEquals(-2, resultado);
		++passContador;
		System.out.print(" Pass ");
	}

	@Test
	public void testDividirValorInteiroPositivoRetornaFloat() {
		Calculadora calc = new Calculadora();
		float resultado = calc.dividir(10, 3);
		System.out.println(resultado);
		Assertions.assertEquals(3.33, resultado, 0.01);
		++passContador;
		System.out.print(" Pass ");
	}

	@Test
	public void testDividirValorInteiroNegativoRetornaInteiro() {
		Calculadora calc = new Calculadora();
		float resultado = calc.dividir(6, -3);
		Assertions.assertEquals(-2, resultado);
		++passContador;
		System.out.print(" Pass ");
	}

	@Test
	public void testDividirValorInteiroPositivoRetornaInteiro() {
		Calculadora calc = new Calculadora();
		float resultado = calc.dividir(4, 2);
		Assertions.assertEquals(2, resultado);
		++passContador;
		System.out.print(" Pass ");
	}

	@ParameterizedTest
	@ValueSource(strings = { "teste 1, teste 2" })
	public void testStrings(String param) {
		System.out.print(param);

	}
}

package com.empresa;

public class Calculadora {

	public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }
    
    public float multiplicar(int numerador, int denominador) {
    	return numerador * denominador;
    }
    
    public float dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        } else {
            return (float) numerador / denominador;
        }
    }
}
    
    


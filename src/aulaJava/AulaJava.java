package aulaJava;

public class AulaJava {

	public static void main(String[] args) {
		
		//7 - Calcule a área de uma circunferência com raio 12, onde PI = 3.1415 e área = PI * r²
		double r = 12;
		double p = 3.1415;
		double area = p * Math.pow(r, 2); //Math.pow = elevado
		
		//8 - Calcule o resto da divisão de 99 por 4
		int a = 99;
		int b = 4;
		
		//9 - Divida um numero por 2 sem utilizar o operador /
		double div = 50 * 0.5; //0.5 é o equivalente a metade (50%)
		
		//10 - Multiplique um numero por 8, sem utilizar o operador *.
		double n = 5;
		double mult = (n + n + n + n + n + n + n + n); //quantidade de n = 8
		
		//Desafio 2 - Declare um inteiro de valor 10 e mostre na tela o valor
		//do terceiro bit mais significativo (da direita para esquerda)
		int i = 10 << 3;
		
		System.out.println (area);
		System.out.println (a % b);
		System.out.println (div);
		System.out.println (mult);
		System.out.println (i);
	}
}
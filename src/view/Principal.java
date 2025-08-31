package view;

import controller.OrdenaVetor;

public class Principal {

	public static void main(String[] args) {
		OrdenaVetor o = new OrdenaVetor();
		double tempoInicial , tempoFinal, tempoTotal;
		
		int[] vetor1 = new int[1499];
		int[] vetor2 = new int[1499];
		int[] vetor3 = new int[1499];
		
		for (int i = 1499; i > 0; i--) {
			 vetor1[1499 - i] = i;
			 vetor2[1499 - i] = i;
			 vetor3[1499 - i] = i;
		}
		//Bubble
		tempoInicial = System.nanoTime(); // Inicia Tempo
		o.bubble(vetor1); // Ordena
		tempoFinal = System.nanoTime(); // Finaliza Tempo
		tempoTotal = tempoFinal - tempoInicial; // Resultado = Final - Inicial
		tempoTotal = tempoTotal / Math.pow(10, 9); // Converte para seg.
		System.out.printf("Tempo Bubble => %.8f s%n", tempoTotal); // Print
		
		//Merge
		tempoInicial = System.nanoTime();
		int fim2 = vetor2.length - 1;
		o.merge(vetor2, 0, fim2);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.printf("Tempo Merge => %.8f s%n", tempoTotal);

		// Quick
		tempoInicial = System.nanoTime();
		int fim3 = vetor3.length - 1;
		o.quick(vetor3, 0, fim3);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.printf("Tempo Quick => %.8f s%n", tempoTotal);

	}

}

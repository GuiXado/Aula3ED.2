package controller;

import br.gui.ordenacao.*;

public class OrdenaVetor {

	public OrdenaVetor() {
		super();
	}
	
	public void bubble(int[] vetor) {
		OrdenacaoBubble b = new OrdenacaoBubble();
		b.bubbleSort(vetor);
	}
	
	public void merge(int[] vetor, int inicio, int fim) {
		OrdenacaoMerge m = new OrdenacaoMerge();
		m.mergeSort(vetor, inicio, fim);
	}
	
	public void quick(int[] vetor, int inicio, int fim) {
		OrdenacaoQuick s = new OrdenacaoQuick();
		s.quickSort(vetor, inicio, fim);
	}
	
}

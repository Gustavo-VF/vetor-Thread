package controller;

public class ThreadVetor extends Thread {
	private int valor;
	private int[] vetor;
	private int percorrer;

	public ThreadVetor(int i, int[] vet) {
		valor = i;
		vetor = vet;
	}

	public void run() {
		if ((valor % 2) != 0) {
			double tempInicio = System.nanoTime();
			for (int Vetor : vetor) {
				percorrer = Vetor;
			}
			double tempFinal = System.nanoTime();
			double tempTotal = tempFinal - tempInicio;
			tempTotal *= 1000;
			System.out.println("forach -> " + tempTotal);
		} else {
			double tempInicio = System.nanoTime();
			for (int i = 0; i < vetor.length; i++) {
				percorrer = vetor[i];
			}

			double tempFinal = System.nanoTime();
			double tempTotal = tempFinal - tempInicio;
			tempTotal *= 1000;
			System.out.println("for -> " + tempTotal);
		}

	}

}

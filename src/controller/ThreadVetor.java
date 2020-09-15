package controller;

public class ThreadVetor extends Thread {
	private int num;
	private int[] vetor = new int[1000];
	
	public ThreadVetor(int num, int[] vet) {
		this.num = num;
		this.vetor = vet;
	}
	
	
	public void run () {
		if (num % 2 == 0) {
			lacoFor();
		}
		else {
			lacoForEach();
		}
	}
	private void lacoForEach() {
		double tinicial = System.nanoTime();
		for (int r : vetor){
			r = r + r;
		}
		double tfinal = System.nanoTime();
		double tempo = (tfinal - tinicial)/Math.pow(10, 9);
		System.out.println("Duração FoeEach: " + tempo + " seg.");
	}


	private void lacoFor() {
		int r = 0;
		double tinicial = System.nanoTime();
		for (int i = 0; i < vetor.length; i++) {
			r = r + vetor[i];
		}
		double tfinal = System.nanoTime();
		double tempo = (tfinal - tinicial)/Math.pow(10, 9);
		System.out.println("Duração For: " + tempo + " seg.");
		
	}
}
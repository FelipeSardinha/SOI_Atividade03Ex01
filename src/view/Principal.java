package view;
import java.util.Arrays;
import controller.ThreadVetor;
public class Principal {
	public static void main(String[] args) {
		int[] vet = new int[1000];
		for(int i = 0; i < 1000; i ++) {
			vet[i] = (int) (Math.random() * (101 - 0)) + 1;
		}
		System.out.println("Vetor: " + Arrays.toString(vet) + "\n");
		
		Thread arrayFor = new ThreadVetor(2, vet);
		arrayFor.start();
		
		Thread arrayForEach = new ThreadVetor(1, vet);
		arrayForEach.start();
	}

}

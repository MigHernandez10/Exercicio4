package Atividade4;
import java.util.Scanner;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        ArrayList<Integer> numeros = new ArrayList<>();

	        while (true) {
	            System.out.print("Digite um número (ou 99 para encerrar): ");
	            int valor = scanner.nextInt();

	            if (valor == 99) {
	                break;
	            }

	            numeros.add(valor);
	        }

	        System.out.println("\nValores inseridos:");
	        for (int num : numeros) {
	            System.out.println(num);
	        }

	        scanner.close();
	    }
	}
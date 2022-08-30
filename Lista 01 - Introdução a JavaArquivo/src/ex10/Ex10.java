package ex10;

import java.util.Arrays;

public class Ex10 {

	/*
	 * 10. Crie um vetor de String (String[]) com os biomas brasileiros:
	 * {“Amazônia”, “Mata Atlântica”, “Cerrado”, “Caatinga”, “Pampa”, “Pantanal”}.
	 * Remova o elemento na posição 3 e realoque os demais elementos de modo que, ao
	 * exibir o vetor com elemento removido, o resultado seja: [“Amazônia”, “Mata
	 * Atlântica”, “Cerrado”, “Pampa”, “Pantanal”]
	 */

	public static void main(String[] args) {

		String[] arrayString = new String[] { "Amazônia", "Mata Atlântica", "Cerrado", "Caatinga", "Pampa", "Pantanal"};
		String[] newArray = new String[] {};

		System.out.println("Array com as informações originais: " + Arrays.toString(arrayString));

		String elementToBeDeleted = "Caatinga";

		for (int i = 0; i < arrayString.length - 1; i++) {
			if (arrayString[i] == elementToBeDeleted) {
				newArray = new String[arrayString.length - 1];
				for (int index = 0; index < i; index++) {
					newArray[index] = arrayString[index];
				}
				for (int j = i; j < arrayString.length - 1; j++) {
					newArray[j] = arrayString[j + 1];
				}
			}
		}
		System.out.println("Novo array com informação deletada: " + Arrays.toString(newArray));
	}
}
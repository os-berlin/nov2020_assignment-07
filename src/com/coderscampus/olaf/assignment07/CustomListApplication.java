package com.coderscampus.olaf.assignment07;

import java.util.Random;
import java.util.Scanner;

public class CustomListApplication {

	public static void main(String[] args) {

		Random randomInt = new Random();
		Scanner scanner = new Scanner(System.in);

		CustomList<Integer> myCustomArray = new CustomArrayList<>();

		System.out.print("How many elements myCustomArray should have to start with? ");
		Integer elementCount = scanner.nextInt();

		for (int i = 0; i < elementCount; i++) {
			myCustomArray.add(randomInt.nextInt(1000));
		}

		printArray(myCustomArray);

		System.out.print("Enter an element (int) you want to add: ");
		Integer addElement = scanner.nextInt();
		System.out.print("At which position \"" + addElement + "\" should be added? ");
		Integer elementIndex = scanner.nextInt();

		myCustomArray.add(elementIndex, addElement);

		printArray(myCustomArray);

		System.out.print("At which index you want to remove the element? ");
		Integer indexRemoveElement = scanner.nextInt();

		Integer removedItem = myCustomArray.remove(indexRemoveElement);
		if (removedItem != null) {
			System.out.println("\nElement \"" + removedItem + "\" at index " + indexRemoveElement
					+ " has been removed from the list.");
		}

		printArray(myCustomArray);
		scanner.close();
	}

	private static void printArray(CustomList<Integer> integers) {
		System.out.println("\nElements in CustomArrayList (Integers):\n");
		for (int i = 0; i < integers.getSize(); i++) {
			System.out.println("index " + i + " : " + integers.get(i));
		}
		System.out.println("----------\n");
	}

}

package br.com.trustsystems.lecture2;

import java.util.Arrays;

public class GridContainer extends Container {
	private Component[][] elementsArray;
	private int lineCounter;
	private int columnCounter;
	private int width;
	private int height;

	public GridContainer(int width, int height) {
		this.width = width;
		this.height = height;
		elementsArray = new Component[width][height];
	}

	@Override
	public void addComponent(Component c) {
		if (lineCounter == height && columnCounter == width) {
			System.out.println("It's not possible to add new elements");
		} else {
			elementsArray[lineCounter][columnCounter] = c;
			columnCounter++;
			if (columnCounter == width) {
				lineCounter++;
				if (lineCounter < height) {
					columnCounter = 0;
				}
			}
		}
	}

	@Override
	public void removeComponent(Component c) {
		for (int i = 0; i < elementsArray.length; i++) {
			for (int j = 0; j < elementsArray[i].length; j++) {
				if (elementsArray[i][j] == c) {
					elementsArray[i][j] = null;
				}
			}
		}
	}

	@Override
	public void doLayout() {
		System.out.println("The Container being used is the GridContainer");
		System.out.println("That's elements presented in this Container");
		System.out.println(Arrays.deepToString(elementsArray));
		System.out.println("Using of inheritance to close Container");
		dispose();
	}
}

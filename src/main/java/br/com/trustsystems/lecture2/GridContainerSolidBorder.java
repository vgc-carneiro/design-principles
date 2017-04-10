/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trustsystems.lecture2;

import java.util.Arrays;

/**
 *
 * @author administrador
 */
public class GridContainerSolidBorder extends GridContainer {
    
    public GridContainerSolidBorder(int width, int height) {
        super(width, height);
    }
    
    @Override
    public void doLayout() {
		System.out.println("The Container being used is the GridContainer");
		System.out.println("That's elements presented in this Container");
		System.out.println(Arrays.deepToString(super.getElementsArray()));
                System.out.println("Now, the container has a solid border");
		System.out.println("Using of inheritance to close Container");
		dispose();
	}
    
}

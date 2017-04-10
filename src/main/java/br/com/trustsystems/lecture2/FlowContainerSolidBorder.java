/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trustsystems.lecture2;

/**
 *
 * @author administrador
 */
public class FlowContainerSolidBorder extends FlowContainer {
    
    
    @Override
    public void doLayout(){
        System.out.println("The Container being used is the FlowContainerSolidBorder");
        System.out.println("That's elements presented in this Container");
        System.out.println(super.getClass());
        System.out.println("Now, the container has a solid border");
        System.out.println("Using of inheritance to close container");
        dispose();
    }
    
}

package br.com.trustsystems.lecture1;

import java.util.ArrayList;
import java.util.List;

public class FlowContainer extends Container {
    private List<Component> elements;

    public FlowContainer() {
        elements = new ArrayList<Component>();
    }

    @Override
    public void addComponent(Component c) {
        elements.add(c);
    }

    @Override
    public void removeComponent(Component c) {
        elements.remove(c);
    }

    @Override
    public void doLayout() {
        System.out.println("The Container being used is the FlowContainer");
        System.out.println("That's elements presented in this Container");
        System.out.println(elements);
        System.out.println("Using of inheritance to close container");
        dispose();
    }
}
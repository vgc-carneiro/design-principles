package br.com.trustsystems.lecture2;

public abstract class Container {
    public abstract void addComponent(Component c);

    public abstract void removeComponent(Component c);

    public abstract void doLayout();

    public void dispose() {
        System.out.println("Closing the Container");
    }
}

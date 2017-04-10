package br.com.trustsystems.lecture2;

public class TestInheritance {
	// Creating container and adding elements to it
	public static void main(String... args) {
		Container c1 = new GridContainer(2, 2);

		Component button = new Component("Button");
		Component textArea = new Component("TextArea");
		Component textField = new Component("TextField");
		Component checkBox = new Component("CheckBox");

		c1.addComponent(button);
		c1.addComponent(textArea);
		c1.addComponent(textField);
		c1.addComponent(checkBox);

		c1.doLayout();

		// Creating FlowContainer and adding elements to it
		Container c2 = new FlowContainer();

		Component radioButton = new Component("RadioButton");

		c2.addComponent(radioButton);
		c2.addComponent(button);
		c2.addComponent(textArea);
		c2.addComponent(textField);
		c2.addComponent(checkBox);

		c2.doLayout();
	}
}

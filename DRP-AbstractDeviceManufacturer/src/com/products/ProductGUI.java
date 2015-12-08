package com.products;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.abstracts.Product;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public abstract class ProductGUI implements Product, Runnable {
	Label label;
	String device_name = "Product";
	Shell shell;
	/**
	 * Launch the application.
	 * @param args
	 */
	/**
	 * @wbp.parser.entryPoint
	 */

	public void main(String[] args) {
		Display display = Display.getDefault();
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText(this.device_name);
				
		Group grpStatus = new Group(shell, SWT.NONE);
		grpStatus.setText("Status");
		grpStatus.setBounds(139, 10, 188, 213);
		
		label = new Label(grpStatus, SWT.NONE);
		label.setBounds(10, 20, 168, 15);


		Button btnTurnOn = new Button(shell, SWT.NONE);
		btnTurnOn.setBounds(10, 10, 75, 25);
		btnTurnOn.setText("Turn on");
		btnTurnOn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				label.setText(turnOn());
			}
		});
		
		Button btnTurnOff = new Button(shell, SWT.NONE);
		btnTurnOff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				label.setText(switchOff());
			}
		});
		btnTurnOff.setBounds(10, 50, 75, 25);
		btnTurnOff.setText("Turn off");
		
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	@Override
	public void run(){
		this.main(null);
	}
}

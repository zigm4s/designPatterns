package com.main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.abstracts.AbstractDeviceFactory;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Manufacturer implements Runnable {

	Shell shell;
	AbstractDeviceFactory factory;
	
	public Manufacturer(AbstractDeviceFactory adf){
		this.factory = adf;
	}
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
//			Manufacturer window = new Manufacturer();
//			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		shell = new Shell();
		shell.setSize(284, 217);
		shell.setText("SWT Application");
		
		Group group = new Group(shell, SWT.NONE);
		group.setText("Manufacture");
		group.setBounds(10, 10, 251, 163);
		
		Button button = new Button(group, SWT.NONE);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Display.getDefault().asyncExec((Runnable) factory.ManufacturePhone());
			}
		});
		button.setText("Manufacture a phone");
		button.setBounds(53, 43, 148, 25);
		
		Button button_1 = new Button(group, SWT.NONE);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Display.getDefault().asyncExec((Runnable) factory.ManufactureTV());				
			}
		});
		button_1.setText("Manufacture a TV");
		button_1.setBounds(53, 74, 148, 25);
		
		Button button_2 = new Button(group, SWT.NONE);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Display.getDefault().asyncExec((Runnable) factory.ManufactureTablet	());
			}
		});
		button_2.setText("Manufacture a tablet");
		button_2.setBounds(53, 105, 148, 25);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
//	public void manufacture(Product p){	
//			Display.getDefault().asyncExec((Runnable) p);
//			p.testDevice();
//	}
	
//	public void assignFactory(AbstractDeviceFactory adf){	
//		factory = adf;
////		p.testDevice();
//	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.open();
//		main(null);
		
	}

}

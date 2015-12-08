package com.main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.abstracts.AbstractDeviceFactory;
import com.concretes.AppleFactory;
import com.concretes.SamsungFactory;

import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.MessageBox;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Combo;

public class Application {

	protected Shell shell;

	AbstractDeviceFactory deviceFactory = null;
	
	List<AbstractDeviceFactory> familyList = new ArrayList<AbstractDeviceFactory>();
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Application window = new Application();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public AbstractDeviceFactory getFactroy(String className){
		for(AbstractDeviceFactory adf: familyList){
			if(className.equals(adf.toString())){
				return adf;
			}
		}
		return null;
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(287, 234);
		shell.setText("SWT Application");
		
		familyList.add(new AppleFactory());
		familyList.add(new SamsungFactory());
		

		Group grpSelectProductFamily = new Group(shell, SWT.NONE);
		grpSelectProductFamily.setText("Select product family");
		grpSelectProductFamily.setBounds(10, 10, 251, 82);

		Combo combo = new Combo(grpSelectProductFamily, SWT.NONE);
		combo.setBounds(10, 30, 195, 23);
		for(AbstractDeviceFactory adf: familyList){
			combo.add(adf.toString());
		}
		
		Button btnRunManufacturer = new Button(shell, SWT.NONE);
		btnRunManufacturer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				deviceFactory = getFactroy(combo.getText());
				if(deviceFactory == null){
					MessageBox dialog = 
							  new MessageBox(shell, SWT.ICON_WARNING | SWT.OK);
							dialog.setText("Warning");
							dialog.setMessage("You have not selected a family of products");
							dialog.open();
				}
				else{
					Display.getDefault().asyncExec(new Manufacturer(deviceFactory));
				}
			}
		});
		btnRunManufacturer.setBounds(26, 137, 127, 25);
		btnRunManufacturer.setText("Run Manufacturer");
		
		
	}
}

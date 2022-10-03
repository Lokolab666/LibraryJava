package edu.uptc.execution;

import edu.uptc.control.Controller;
import edu.uptc.view.MainWindow;

public class Execution {

	public static void main(String[] args) {
		MainWindow mainWindow = new MainWindow();
		Controller controller = new Controller(mainWindow);
		mainWindow.initialProgram(controller);
	}

}

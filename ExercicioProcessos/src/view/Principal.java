package view;

import controller.ProcessosController;

public class Principal {

	public static void main(String[] args) {
		
		ProcessosController procCont = new ProcessosController();
		
		// String process = "C:\\Windows\\explorer.exe";
		// procCont.callProcess(process);
		System.out.println(procCont.os());
		System.out.println(procCont.arch());
		System.out.println(procCont.version());
	}

}

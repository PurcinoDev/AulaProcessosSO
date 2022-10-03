package controller;

import java.io.IOException;

public class ProcessosController {

	public ProcessosController() {
		super();
	}
	
	// Retorna o Sistema Operacional em execu��o na m�quina.
	public String os() {
		String os = System.getProperty("os.name");
		return os;
	}
	
	// Retorna a arquitetura da m�quina
	public String arch() {
		String arch = System.getProperty("os.arch");
		return arch;
	}
	
	// Retorna a vers�o do Sistema Operacional
	public String version() {
		String version = System.getProperty("os.version");
		return version;
	}
	
	// Chama um processo espec�fico
	public void callProcess(String process) {
		try {
			Runtime.getRuntime().exec(process);
		} catch (Exception e) {
			String msgError = e.getMessage();
			if (msgError.contains("740")) {
				StringBuffer buffer = new StringBuffer();
				buffer.append("cmd /c " + process);
				try {
					Runtime.getRuntime().exec(buffer.toString());
				} catch (IOException e1) {
					System.err.println(e1.getMessage());
				}
			}
		}
	}
}
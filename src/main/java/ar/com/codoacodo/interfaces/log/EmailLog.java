package ar.com.codoacodo.interfaces.log;

public class EmailLog implements ILog {

	@Override
	public void log() {
		System.out.println("Enviando por mail este mensaje");
	}

}

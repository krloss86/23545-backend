package ar.com.codoacodo.interfaces.log;

public class SmsLog implements ILog {

	@Override
	public void log() {
		System.out.println("Enviando sms a +54911...");
	}

}
//ctrl+n
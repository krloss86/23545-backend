package ar.com.codoacodo.interfaces.log;

public class MainLogger {

	public static void main(String[] args) {
		String target = "C";
		ILog logger = LogManager.getLogger(target);
		logger.log();
	}

}

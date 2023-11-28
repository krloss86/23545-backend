package ar.com.codoacodo.interfaces.log;

public class FsLog implements ILog {

	@Override
	public void log() {
		System.out.println("Loguendo en FileSystem c://invento");
	}

}


public class Reader extends Thread {

	private ReaderWriterMonitor monitor;
	private Message msg;
	
	public Reader(ReaderWriterMonitor monitor, Message message, String name) {
		super(name);
		
		this.msg = message;
		this.monitor = monitor;
	}

	@Override
	public void run() {
		try {
			
			for(int i = 0; i < 10; i++) {
				Thread.sleep((long) (Math.random()*3001));
				monitor.beginRead();
				System.out.println(getName() +" reads: "+ msg.read());
				monitor.endRead();
			}
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}	
}

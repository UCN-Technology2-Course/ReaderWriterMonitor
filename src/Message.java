
public class Message {

	private String msg = "";


	public void write(String word) {

		msg += " " + word;
	}


	public String read() {

		return msg;
	}
}

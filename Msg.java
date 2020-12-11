public class Msg {

	//data members
	private String contents, source, destination;
	private char type;
	
	//constructors
	public Msg(String contents, String source, String destination, char type) {
		super();
		this.contents = contents;
		this.source = source;
		this.destination = destination;
		this.type = type;
	}


	public Msg(String contents) {
		super();
		this.contents = contents;
	}


	public Msg() {
		super();
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public char getType() {
		return type;
	}


	public void setType(char type) {
		this.type = type;
	}
	
	//method that calculates and returns the cost of transfer
	public double costOfTransfer() {
		double cost=0;
		if(type=='e')
			cost=0;
		else if(type=='t')
			cost=0.25;
		else
			cost=1.50;
		
		return cost;
	}
	
	//method that encrypts and returns the message 
	public String encrypt() {
		String[] words = contents.split(" ");
		for (int i = 0; i < words.length; i++) {
				StringBuilder sb1 = new StringBuilder(words[i]).reverse();
				words[i] = sb1.toString();			
		}

		String nl = String.join(" ", words);		
		return nl;
		
	}
	
	//method that decrypts and returns the message 
	public String decrypt() {
		String[] words = encrypt().split(" ");
		for (int i = 0; i < words.length; i++) {
				StringBuilder sb1 = new StringBuilder(words[i]).reverse();
				words[i] = sb1.toString();			
		}

		String nl = String.join(" ", words);		
		return nl;
	}
}

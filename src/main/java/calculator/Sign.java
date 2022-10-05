package calculator;

public enum Sign {
	PLUS("+"),
	MINUS("-"),
	MULTIPLY("*"),
	DIVIDE("/");
	
	Sign(String calculateSign) {
		this.calculateSign = calculateSign;
	}

	private String calculateSign;
	
	public String getCalculateSign() {
		return calculateSign;
	}
}

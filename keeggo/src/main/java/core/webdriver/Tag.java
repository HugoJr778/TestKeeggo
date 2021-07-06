package core.webdriver;

public enum Tag {
	
	SELECT("select"),
	SPAN("span"),
	LABEL("label"),
	INPUT("input"),
	DIV("div");
	
	private String value;
	
	Tag(final String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
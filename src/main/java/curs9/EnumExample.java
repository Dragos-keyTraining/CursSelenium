package curs9;

public enum EnumExample {
	
	DEV("http://dev.com"),
	QA("http://qa.com"),
	PP("http://pp.com"),
	PROD("http://prod.com");
	
	private String url;

	EnumExample(String string) {
		
		this.url = string;
	}
	
	public String getUrl() {
		return url;
	}
	
	

}

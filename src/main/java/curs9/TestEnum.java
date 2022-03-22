package curs9;

public class TestEnum {

	public static void main(String[] args) {

		System.out.println(EnumExample.DEV.getUrl());
		
		for(EnumExample env : EnumExample.values()) {
			System.out.println( env.name());
			System.out.println( env.getUrl());

		}
		
	}

}

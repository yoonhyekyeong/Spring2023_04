package kr.co.softsoldesk.beans;

public class SamgsungTV implements TV{
	
	public SamgsungTV() {
		
		System.out.println("====>samgsungTV 객체 생성");
	}

	
	@Override
	public void powerOn() {
		System.out.println("====>samgsungTV  켜기");
		
	}

	@Override
	public void powerOff() {
		System.out.println("====>samgsungTV 끄기");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("====>samgsungTV 볼륨업");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("====>samgsungTV 볼륨 다운");
		
	}


	
	
}

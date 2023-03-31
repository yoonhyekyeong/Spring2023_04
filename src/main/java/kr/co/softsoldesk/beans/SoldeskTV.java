package kr.co.softsoldesk.beans;

public class SoldeskTV implements TV {
	
	public SoldeskTV() {
		System.out.println("SoldeskTV 객체생성");
	}
		
	@Override
	public void powerOn() {
		 System.out.println("soldesktv 전원켜기");
		
	}

	@Override
	public void powerOff() {
		 System.out.println("soldesktv 전원끄기");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("soldesktv 볼륨업");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("soldesktv 볼륨다운");
		
	}
	

}


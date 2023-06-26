package com.sp.app0626.music;

public class UseTool {
	public static void main(String[] args) {
		//추상 클래스는 불완전하기 때문에 자식에 의해 완성되기 전 까지는
		//직접 new에 의해 인스턴스화될 수 없음
		//즉, 자식에 의해 메모리에 올라가며, 자식을 new하면 됨
		//new MusicPlayer(); //불완전한 클래스는 new할 수 없음
		
		Ipod p=new Ipod();
		
	}
}

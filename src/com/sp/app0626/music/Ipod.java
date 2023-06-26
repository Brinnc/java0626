package com.sp.app0626.music;

//사원 중 한명의 개발자가 Ipod을 정의함
//주의) 다음 사항은 반드시 필수로 포함되어야함 1) mp3파일 재생 기능 2) 볼륨 조절 기능
//-> 자바언어에서 *구현 강제의 방법을 찾아보자!
public class Ipod extends MusicPlayer implements JetEngine, Roller{
						 /*is a*/ 					 /*is a*/ 
	//1) Ipod is a MusicPlayer, 2) Ipod is a JetEngine, Roller
	//따라서 ★Ipod 과 ☆MusicPlayer, ☆JetEngine, ☆Roller 간 형변환이 가능함 (★<->☆)
	//추상클래스를 상속받는 자식클래스는 부모의 재산을 물려받은 것이 아닌
	//부모의 빚(채무)을 떠안은 것과 마찬가지임
	//따라서 부모가 물려준 불완전한 메서드의 완성의무를 자식이 부담함
	public void playMp3() {
		System.out.println("아이팟에서 mp3를 재생함");
		
	}

	public void setVolume(int v) {
		System.out.println("아이팟에서 볼륨을 "+v+"로 설정함");
		
	}
	
	public void fly() {
		System.out.println("아이팟을 타고 날라감");
		
	}
	
	public void roll() {
		System.out.println("아이팟을 타고 구름");
		
	}
	
}

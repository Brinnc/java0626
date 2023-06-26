package com.sp.app0626.music;

public abstract class MusicPlayer {
	//아래의 메서드는 실수에 의함이 아닌 고의로 불완전하게 정의하였음
	//이렇게 몸체 즉, {}가 없는 메서드를 가리켜 추상메서드라 함
	//추상메서드는 개발시점에 그 내용을 알 수 없거나, 작성하지 않아야할 때,
	//즉 내용없이 기준만을 세울때 사용됨
	//주의! 단 하나라도 추상메서드가 포함된 클래스는 불완전하다고 하여 전체가 추상클래스가 됨
	public abstract void playMp3(); //mp3재생
	
	public abstract void setVolume(int v); //볼륨조절
	
	public void charge() { //몸체{}있는 메서드도 추상클래스 안에 함께 있을 수 있음
		
	}
}

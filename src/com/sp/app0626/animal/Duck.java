package com.sp.app0626.animal;

//최상위 클래스인 Object를 import하지 않아도 사용가능한 이유??
//자바 프로그램 개발 시 그 사용 빈도가 너무너무 높은 경우, java.lang이라는 패키지에서
//주요 클래스들을 지원하며, 이 java.lang 패키지는 개발자가 import하지 않아도 접근이 가능함
//즉, Object도 java.lang에 들어있음

public class Duck extends Bird{ 
	String name="도날드";
	
	public void fly() {
		System.out.println("오리가 날아감");
	}
	
	public static void main(String[] args) {
		Duck d=new Duck(); //시스템 상 최상위 객체인 Object(가장 큰, 범위가 넓은 자료형)가 먼저 존재함
		//d.toString(); //최상위 클래스인 Object의 메서드임
		//String x="5";
		//Integer.parseInt(x); //java.lang에 들어있음
		
		//★★★ 형변환 시 *원칙: 해당 자료형을 따라감, ※예외: 오버라이딩 된 메서드가 있다면 업데이트된 자식의 메서드를 호출함
		Bird b=d;
		System.out.println(b.name); //변수는 앞의 자료형을 따라가면 됨, 따라서 이것은 Bird의 name
		System.out.println(d.name); //d의 자료형은 Duck이므로 Duck의 name
		b.fly();//자식이 업그레이드한 경우 무조건 자식의 메서드 호출
		
		Bird k=new Duck();
		//k.name; //Bird의 name변수를 가리킴
		//자식이 업그레이드한 경우 무조건 자식의 메서드 호출
		k.fly(); //오버라이딩 된 메서드가 존재하므로 k는 Bird형이지만 자식의 메서드를 호출함
	}
}

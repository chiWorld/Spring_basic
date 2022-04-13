package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1.원격 호출가능한 프로그램으로 등록
@Controller
public class Hello {
	int iv = 10; //인스턴스 변수
	static int cv = 20; //static변수
	
	//2. URL과 메서드를 연결
	@RequestMapping("/hello")
	public void main() { //인스턴스 메서드 : 객체생성후 호출가능 -> 호출하면 톰켓이 객체생성 해주면서 메서드를 호출함 / iv, cv 둘 다 사용 가능
		System.out.println("Hello - static");
		System.out.println(cv); //ok
		System.out.println(iv); //ok
	}
	
	public static void main2() { //static메서드 - cv만 사용가능
		System.out.println(cv); //ok
//		System.out.println(iv); //에러
	}
	
	@RequestMapping("/helloPrivate")
	private void main3() { //내부에서는 private지만 외부에서 호출가능.
		System.out.println("Hello - private");
		System.out.println(cv); //ok
		System.out.println(iv); //ok		
	}
}

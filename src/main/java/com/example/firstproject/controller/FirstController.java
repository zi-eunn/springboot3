package com.example.firstproject.controller;

// 컨트롤러 선언과 동시에 자동으로 임포트
import org.springframework.stereotype.Controller;

@Controller // 컨트롤러 선언
public class FirstController {
	public String niceToMeetYou() { // 메서드 작성
		return "greetings"; //서버가 알아서 templates 디렉터리에서 greetings.mustache 파일을 찾아 웹 브라우저로 전송
	}
}

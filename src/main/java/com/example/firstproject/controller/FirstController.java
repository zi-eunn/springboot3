package com.example.firstproject.controller;

// 컨트롤러 선언과 동시에 자동으로 임포트
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model; // Model 클래스 패키지 자동 임포트

@Controller // 컨트롤러 선언
public class FirstController {

	@GetMapping("/hi") // url 요청 접수 -> /hi로 접속하면 greetings.mustache 파일을 찾아 반환해라
	public String niceToMeetYou(Model model) { // 메서드 작성
		//model 객체가 "값"을 "username"에 연결해 웹 브라우저로 보냄
		model.addAttribute("username", "hongpark");
		return "greetings"; //서버가 알아서 templates 디렉터리에서 greetings.mustache 파일을 찾아 웹 브라우저로 전송
	}

	@GetMapping("/bye")
	public String seeYouNext(Model model) {
		model.addAttribute("username", "hongpark");;
		return "goodbye";
	}

}

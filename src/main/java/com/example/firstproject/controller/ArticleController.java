package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.firstproject.dto.ArticleForm;

@Controller
public class ArticleController {
	@GetMapping("/articles/new")
	public String newArticle() {
		return "articles/new";
	}

	@PostMapping("/articles/create") // post 형식으로 정보를 전달 받았으니까 post임. 보통 로그인 등 중요한 정보를 담음
	public String createArticle(ArticleForm form) { // 폼 데이터를 dto로 받기
		System.out.println(form.toString()); // dto에 폼 데이터가 잘 담겼는지 확인
		return "";
	}
}

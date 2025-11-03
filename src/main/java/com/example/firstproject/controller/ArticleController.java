package com.example.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.firstproject.repository.ArticleRepository;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;

import lombok.extern.slf4j.Slf4j;

@Slf4j // println을 삭제하기 위한 로깅 기능.
@Controller
public class ArticleController {
	@GetMapping("/articles/new")
	public String newArticle() {
		return "articles/new";
	}

	@Autowired
	private ArticleRepository articleRepository;

	@PostMapping("/articles/create") // post 형식으로 정보를 전달 받았으니까 post임. 보통 로그인 등 중요한 정보를 담음
	public String createArticle(ArticleForm form) { // 폼 데이터를 dto로 받기
		//System.out.println(form.toString()); // dto에 폼 데이터가 잘 담겼는지 확인
		log.info(form.toString());

		//1. DTO를 엔티티로 변환
		Article article = form.toEntity(); //form 객체의 toEntity라는 메서드를 호출해서 반환값을 Article 타입의 article 엔티티에 저장
		//System.out.println(article.toString());
		log.info(article.toString());

		//2. 리파지터리로 엔티티를 DB에 저장
		Article saved = articleRepository.save(article); //article 엔티티를 저장해 saved 객체에 반환
		//System.out.println(saved.toString());
		log.info(saved.toString());
		return "";
	}

	@GetMapping("/articles/{id}") // 서버의 컨트롤러가 url 요청을 받는 것
	public String show(@PathVariable Long id) { // 매개변수로 id 받아오기
		log.info("id: " + id);
		return "";
	}
}
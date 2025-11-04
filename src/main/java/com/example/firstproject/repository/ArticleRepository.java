package com.example.firstproject.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.firstproject.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {

	@Override
	ArrayList<Article> findAll(); //entends에서 alt+insert로 메서드 정의 선택 후 Iterable -> ArrayList로 수정
}

package com.example.firstproject.entity;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Getter
public class Article {
	@Id
	@GeneratedValue // 엔티티 id 자동 생성 기능
	private Long id;
	@Column
	private String title;
	@Column
	private String content;

	// 롬복 사용으로 코드 간소화 가능
	// public Long getId() { // String -> Long으로 타입 변경
	// 	return id;
	// }

	// @NoArgsconstructor으로 변경
	// Article() {
	//
	// }

	// public Article(Long id, String title, String content) {
	// 	this.id = id;
	// 	this.title = title;
	// 	this.content = content;
	// }
	//
	// @Override
	// public String toString() {
	// 	return "Article{" +
	// 		"id=" + id +
	// 		", title='" + title + '\'' +
	// 		", content='" + content + '\'' +
	// 		'}';
	// }
}

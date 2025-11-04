package com.example.firstproject.entity;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Article {
	@Id
	@GeneratedValue // 엔티티 id 자동 생성 기능
	private Long id;
	@Column
	private String title;
	@Column
	private String content;

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

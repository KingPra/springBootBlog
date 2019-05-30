package com.techtalentsouth.TechTalentBlog.BlogPost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost {
	// @Id sets the id as the primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String author;
	private String blogEntry;

	public BlogPost() {
		// non argument constructor needed for jpa;
	}

	public BlogPost(String title, String author, String blogEntry) {
		this.title = title;
		this.author = author;
		this.blogEntry = blogEntry;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getBlogEntry() {
		return blogEntry;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}

	@Override
	public String toString() {
		return "BlogPost [id=" + id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
	}
}

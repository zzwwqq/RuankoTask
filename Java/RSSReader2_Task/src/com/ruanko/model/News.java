package com.ruanko.model;

public class News {

	private String title;         //新闻标题
	private String link;          //新闻链接
	private String author;        //新闻作者
	private String guid;          //新闻网址
	private String category;      //新闻版块
	private String pubDate;       //新闻发布日期
	private String comments;      //新闻要闻
	private String description;   //新闻描述
	
	
	public News(){
		this.title = "";
		this.link = "";
		this.author = "";
		this.guid = "";
		this.category = "";
		this.pubDate = "";
		this.comments = "";
		this.description = "";
		
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getGuid() {
		return guid;
	}


	public void setGuid(String guid) {
		this.guid = guid;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getPubDate() {
		return pubDate;
	}


	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	

	public String newsToString (News news) {
		String content = null;
		content = "标题："
				+ news.getTitle()
				+"\r\n"
				+"链接："
				+news.getLink()
				+"\r\n"
				+"作者："
				+news.getAuthor()
				+"\r\n"
				+"发布时间："
				+news.getPubDate()
				+"\r\n"
				+"----------------------------------------------------------------\r\n"
		        + news.getDescription()+"\r\n"+"\r\n";
	return content;
	}
	
}

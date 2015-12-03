package org.junk.domain;

import java.util.Date;

public class BoardVO {

	private Integer bno;
	private String	content;
	private	String	title;
	private	String 	writer;
	private Date	regDate;
	private Date	updateDate;
	private Integer	viewCount;
	public Integer getBno() {
		return bno;
	}
	public Integer getViewCount() {
		return viewCount;
	}
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", content=" + content + ", title=" + title + ", writer=" + writer + ", regDate="
				+ regDate + ", updateDate=" + updateDate + ", viewCount=" + viewCount + "]";
	}
	
	
	
	
}

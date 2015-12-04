package org.junk.domain;

public class Criteria {

	private int pageNo;
	private String type;
	private String keyword;
	private int perPage;
	private String searchType;
	
	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public Criteria() {
		this.pageNo = 1;
		this.perPage = 10;
	}
	
	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "Criteria [pageNo=" + pageNo + ", type=" + type + ", keyword=" + keyword + ", perPage=" + perPage
				+ ", searchType=" + searchType + "]";
	}
	
}

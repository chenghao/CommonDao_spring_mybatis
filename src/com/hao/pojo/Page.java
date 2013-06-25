package com.hao.pojo;

public class Page extends Base {
	
	private Integer pageNo;//当前页数
	private Integer pageSize;//每页显示行数
	private Integer pageNoCount;//一共多少页
	private Integer pageCount;//一共多少条数据

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNoCount() {
		return pageNoCount;
	}

	public void setPageNoCount(Integer pageNoCount) {
		this.pageNoCount = pageNoCount;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
}

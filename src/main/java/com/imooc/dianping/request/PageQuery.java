package com.imooc.dianping.request;

public class PageQuery {

    private Integer page = 1;

    private Integer size = 5;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
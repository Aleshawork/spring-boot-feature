package com.example.web.dto;

public class Paging {

    private final int limit;
    private final int offset;

    public Paging(int limit, int offset) {
        this.limit = limit;
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public int getOffset() {
        return offset;
    }
}

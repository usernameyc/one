package com.entity;

import java.util.List;

/**
 * 分页响应实体
 * @param <T>
 */
public class PageResult<T> {

    private Long total; //总记录数
    private List<T> rows;//当前页数据

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}

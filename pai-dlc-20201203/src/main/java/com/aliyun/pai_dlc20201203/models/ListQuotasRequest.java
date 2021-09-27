// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListQuotasRequest extends TeaModel {
    // 当前页
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页返回的作业数
    @NameInMap("PageSize")
    public Integer pageSize;

    // 按返回字段排序
    @NameInMap("SortBy")
    public String sortBy;

    // 排序顺序
    @NameInMap("Order")
    public String order;

    public static ListQuotasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasRequest self = new ListQuotasRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListQuotasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQuotasRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListQuotasRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

}

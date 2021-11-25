// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListEcsSpecsRequest extends TeaModel {
    // 排序顺序
    @NameInMap("Order")
    public String order;

    // 查询第几页数据
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 设置查询的分页大写
    @NameInMap("PageSize")
    public Integer pageSize;

    // 按返回字段排序
    @NameInMap("SortBy")
    public String sortBy;

    public static ListEcsSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEcsSpecsRequest self = new ListEcsSpecsRequest();
        return TeaModel.build(map, self);
    }

    public ListEcsSpecsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListEcsSpecsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEcsSpecsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEcsSpecsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}

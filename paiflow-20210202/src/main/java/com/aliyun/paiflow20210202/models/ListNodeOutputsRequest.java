// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListNodeOutputsRequest extends TeaModel {
    // 节点往下拿多少层子节点
    @NameInMap("Depth")
    public Integer depth;

    // 节点名字
    @NameInMap("Name")
    public String name;

    // 当前页，页码从1开始
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页返回的输出数目
    @NameInMap("PageSize")
    public Integer pageSize;

    // 排序字段
    @NameInMap("SortBy")
    public String sortBy;

    // 排序顺序， 顺序：ASC，倒序：DESC
    @NameInMap("Order")
    public String order;

    // artifact 类型
    @NameInMap("Type")
    public String type;

    public static ListNodeOutputsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeOutputsRequest self = new ListNodeOutputsRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeOutputsRequest setDepth(Integer depth) {
        this.depth = depth;
        return this;
    }
    public Integer getDepth() {
        return this.depth;
    }

    public ListNodeOutputsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListNodeOutputsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodeOutputsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodeOutputsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListNodeOutputsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListNodeOutputsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

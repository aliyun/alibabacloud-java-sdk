// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelineRunNodeOutputsRequest extends TeaModel {
    @NameInMap("Depth")
    public Integer depth;

    @NameInMap("Name")
    public String name;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Type")
    public String type;

    public static ListPipelineRunNodeOutputsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunNodeOutputsRequest self = new ListPipelineRunNodeOutputsRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunNodeOutputsRequest setDepth(Integer depth) {
        this.depth = depth;
        return this;
    }
    public Integer getDepth() {
        return this.depth;
    }

    public ListPipelineRunNodeOutputsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPipelineRunNodeOutputsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListPipelineRunNodeOutputsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPipelineRunNodeOutputsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPipelineRunNodeOutputsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListPipelineRunNodeOutputsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

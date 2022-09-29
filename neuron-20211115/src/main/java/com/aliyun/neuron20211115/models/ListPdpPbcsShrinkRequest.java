// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpPbcsShrinkRequest extends TeaModel {
    @NameInMap("developer_id")
    public String developerId;

    @NameInMap("keyword")
    public String keyword;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("page_number")
    public Integer pageNumber;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("pbcIds")
    public String pbcIdsShrink;

    public static ListPdpPbcsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPdpPbcsShrinkRequest self = new ListPdpPbcsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPdpPbcsShrinkRequest setDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }
    public String getDeveloperId() {
        return this.developerId;
    }

    public ListPdpPbcsShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListPdpPbcsShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPdpPbcsShrinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListPdpPbcsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPdpPbcsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPdpPbcsShrinkRequest setPbcIdsShrink(String pbcIdsShrink) {
        this.pbcIdsShrink = pbcIdsShrink;
        return this;
    }
    public String getPbcIdsShrink() {
        return this.pbcIdsShrink;
    }

}

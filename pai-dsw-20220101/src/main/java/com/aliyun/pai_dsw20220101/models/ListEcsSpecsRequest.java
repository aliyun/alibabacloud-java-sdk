// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListEcsSpecsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    public static ListEcsSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEcsSpecsRequest self = new ListEcsSpecsRequest();
        return TeaModel.build(map, self);
    }

    public ListEcsSpecsRequest setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public ListEcsSpecsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListEcsSpecsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListEcsSpecsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListEcsSpecsV2Request extends TeaModel {
    // 加速类型
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    // 排序顺序
    @NameInMap("Order")
    public String order;

    // 页数
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 每页大小
    @NameInMap("PageSize")
    public Long pageSize;

    // 排序字段
    @NameInMap("SortBy")
    public String sortBy;

    public static ListEcsSpecsV2Request build(java.util.Map<String, ?> map) throws Exception {
        ListEcsSpecsV2Request self = new ListEcsSpecsV2Request();
        return TeaModel.build(map, self);
    }

    public ListEcsSpecsV2Request setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public ListEcsSpecsV2Request setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListEcsSpecsV2Request setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListEcsSpecsV2Request setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListEcsSpecsV2Request setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}

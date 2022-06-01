// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListResourceGroupsRequest extends TeaModel {
    // pai resource group display name
    @NameInMap("Name")
    public String name;

    // 排序顺序, 枚举值 desc 或者 asc
    @NameInMap("Order")
    public String order;

    // 分页数
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 页面容量
    @NameInMap("PageSize")
    public Long pageSize;

    // 用于排序的字段名，可选字段名：DisplayName, GmtCreated, GmtModified,RegionID Duration PricingCycle PayType
    @NameInMap("SortBy")
    public String sortBy;

    // resource group的状态
    @NameInMap("Status")
    public String status;

    public static ListResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsRequest self = new ListResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListResourceGroupsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListResourceGroupsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListResourceGroupsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListResourceGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

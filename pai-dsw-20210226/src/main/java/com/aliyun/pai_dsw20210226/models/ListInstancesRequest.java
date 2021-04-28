// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    // 实例名称关键字
    @NameInMap("InstanceNameContains")
    public String instanceNameContains;

    // 实例状态
    @NameInMap("InstanceStatusEquals")
    public String instanceStatusEquals;

    // 当前页
    @NameInMap("PageNumber")
    public String pageNumber;

    // 每页返回的实例数
    @NameInMap("PageSize")
    public String pageSize;

    // 升序降序
    @NameInMap("SortOrder")
    public String sortOrder;

    // 排序字段
    @NameInMap("SortBy")
    public String sortBy;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setInstanceNameContains(String instanceNameContains) {
        this.instanceNameContains = instanceNameContains;
        return this;
    }
    public String getInstanceNameContains() {
        return this.instanceNameContains;
    }

    public ListInstancesRequest setInstanceStatusEquals(String instanceStatusEquals) {
        this.instanceStatusEquals = instanceStatusEquals;
        return this;
    }
    public String getInstanceStatusEquals() {
        return this.instanceStatusEquals;
    }

    public ListInstancesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListInstancesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListInstancesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}

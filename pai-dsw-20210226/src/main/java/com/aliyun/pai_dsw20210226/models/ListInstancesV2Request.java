// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstancesV2Request extends TeaModel {
    // 实例名称
    @NameInMap("InstanceName")
    public String instanceName;

    // 排列顺序
    @NameInMap("Order")
    public String order;

    // 页码
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 分页数量大小
    @NameInMap("PageSize")
    public Long pageSize;

    // 排序字段
    @NameInMap("SortBy")
    public String sortBy;

    // 实例状态
    @NameInMap("Status")
    public String status;

    // 工作空间Id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListInstancesV2Request build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesV2Request self = new ListInstancesV2Request();
        return TeaModel.build(map, self);
    }

    public ListInstancesV2Request setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListInstancesV2Request setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListInstancesV2Request setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesV2Request setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListInstancesV2Request setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListInstancesV2Request setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListInstancesV2Request setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

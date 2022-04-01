// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOperationTasksParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // nodeId
    @NameInMap("nodeId")
    public String nodeId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // operationId
    @NameInMap("operationId")
    public String operationId;

    // operationNodeId
    @NameInMap("operationNodeId")
    public Long operationNodeId;

    // orderBy
    @NameInMap("orderBy")
    public java.util.List<String> orderBy;

    // pageNumber
    @NameInMap("pageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Long pageSize;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // sort
    @NameInMap("sort")
    public String sort;

    // statusList
    @NameInMap("statusList")
    public java.util.List<String> statusList;

    public static ListClusterOperationTasksParam build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationTasksParam self = new ListClusterOperationTasksParam();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationTasksParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterOperationTasksParam setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ListClusterOperationTasksParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListClusterOperationTasksParam setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ListClusterOperationTasksParam setOperationNodeId(Long operationNodeId) {
        this.operationNodeId = operationNodeId;
        return this;
    }
    public Long getOperationNodeId() {
        return this.operationNodeId;
    }

    public ListClusterOperationTasksParam setOrderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public java.util.List<String> getOrderBy() {
        return this.orderBy;
    }

    public ListClusterOperationTasksParam setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterOperationTasksParam setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClusterOperationTasksParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListClusterOperationTasksParam setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListClusterOperationTasksParam setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}

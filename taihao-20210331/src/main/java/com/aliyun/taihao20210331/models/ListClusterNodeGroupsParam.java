// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterNodeGroupsParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // nodeGroupIdList
    @NameInMap("nodeGroupIdList")
    public java.util.List<String> nodeGroupIdList;

    // nodeGroupNameList
    @NameInMap("nodeGroupNameList")
    public java.util.List<String> nodeGroupNameList;

    // nodeGroupTypeList
    @NameInMap("nodeGroupTypeList")
    public java.util.List<String> nodeGroupTypeList;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // orderBy
    @NameInMap("orderBy")
    public java.util.List<String> orderBy;

    // pageNumber
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Integer pageSize;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // sort
    @NameInMap("sort")
    public String sort;

    // statusList
    @NameInMap("statusList")
    public java.util.List<String> statusList;

    public static ListClusterNodeGroupsParam build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodeGroupsParam self = new ListClusterNodeGroupsParam();
        return TeaModel.build(map, self);
    }

    public ListClusterNodeGroupsParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterNodeGroupsParam setNodeGroupIdList(java.util.List<String> nodeGroupIdList) {
        this.nodeGroupIdList = nodeGroupIdList;
        return this;
    }
    public java.util.List<String> getNodeGroupIdList() {
        return this.nodeGroupIdList;
    }

    public ListClusterNodeGroupsParam setNodeGroupNameList(java.util.List<String> nodeGroupNameList) {
        this.nodeGroupNameList = nodeGroupNameList;
        return this;
    }
    public java.util.List<String> getNodeGroupNameList() {
        return this.nodeGroupNameList;
    }

    public ListClusterNodeGroupsParam setNodeGroupTypeList(java.util.List<String> nodeGroupTypeList) {
        this.nodeGroupTypeList = nodeGroupTypeList;
        return this;
    }
    public java.util.List<String> getNodeGroupTypeList() {
        return this.nodeGroupTypeList;
    }

    public ListClusterNodeGroupsParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListClusterNodeGroupsParam setOrderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public java.util.List<String> getOrderBy() {
        return this.orderBy;
    }

    public ListClusterNodeGroupsParam setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterNodeGroupsParam setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterNodeGroupsParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListClusterNodeGroupsParam setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListClusterNodeGroupsParam setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}

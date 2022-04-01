// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodesParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // componentName
    @NameInMap("componentName")
    public java.util.List<String> componentName;

    // nodeFleetIdList
    @NameInMap("nodeFleetIdList")
    public java.util.List<String> nodeFleetIdList;

    // nodeGroupIdList
    @NameInMap("nodeGroupIdList")
    public java.util.List<String> nodeGroupIdList;

    // nodeIds
    @NameInMap("nodeIds")
    public java.util.List<String> nodeIds;

    // nodeNameList
    @NameInMap("nodeNameList")
    public java.util.List<String> nodeNameList;

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

    // privateIp
    @NameInMap("privateIp")
    public String privateIp;

    // publicIp
    @NameInMap("publicIp")
    public String publicIp;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // sort
    @NameInMap("sort")
    public String sort;

    // statusList
    @NameInMap("statusList")
    public java.util.List<String> statusList;

    public static ListNodesParam build(java.util.Map<String, ?> map) throws Exception {
        ListNodesParam self = new ListNodesParam();
        return TeaModel.build(map, self);
    }

    public ListNodesParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListNodesParam setComponentName(java.util.List<String> componentName) {
        this.componentName = componentName;
        return this;
    }
    public java.util.List<String> getComponentName() {
        return this.componentName;
    }

    public ListNodesParam setNodeFleetIdList(java.util.List<String> nodeFleetIdList) {
        this.nodeFleetIdList = nodeFleetIdList;
        return this;
    }
    public java.util.List<String> getNodeFleetIdList() {
        return this.nodeFleetIdList;
    }

    public ListNodesParam setNodeGroupIdList(java.util.List<String> nodeGroupIdList) {
        this.nodeGroupIdList = nodeGroupIdList;
        return this;
    }
    public java.util.List<String> getNodeGroupIdList() {
        return this.nodeGroupIdList;
    }

    public ListNodesParam setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public ListNodesParam setNodeNameList(java.util.List<String> nodeNameList) {
        this.nodeNameList = nodeNameList;
        return this;
    }
    public java.util.List<String> getNodeNameList() {
        return this.nodeNameList;
    }

    public ListNodesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListNodesParam setOrderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public java.util.List<String> getOrderBy() {
        return this.orderBy;
    }

    public ListNodesParam setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesParam setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesParam setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public ListNodesParam setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public ListNodesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListNodesParam setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListNodesParam setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}

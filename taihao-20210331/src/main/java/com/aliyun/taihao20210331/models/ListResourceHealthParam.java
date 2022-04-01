// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListResourceHealthParam extends TeaModel {
    // 应用名称
    @NameInMap("applicationName")
    public String applicationName;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // 组件名称
    @NameInMap("componentName")
    public String componentName;

    // 健康状态
    @NameInMap("healthStatuses")
    public java.util.List<String> healthStatuses;

    // 节点Id列表
    @NameInMap("nodeIds")
    public java.util.List<String> nodeIds;

    // 节点名称列表
    @NameInMap("nodeNames")
    public java.util.List<String> nodeNames;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // pageNumber
    @NameInMap("pageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Long pageSize;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // 查询的目标资源类型，合法值：APPLICATION, COMPONENT, COMPONENT_INSTANCE
    @NameInMap("resourceType")
    public String resourceType;

    public static ListResourceHealthParam build(java.util.Map<String, ?> map) throws Exception {
        ListResourceHealthParam self = new ListResourceHealthParam();
        return TeaModel.build(map, self);
    }

    public ListResourceHealthParam setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListResourceHealthParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListResourceHealthParam setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ListResourceHealthParam setHealthStatuses(java.util.List<String> healthStatuses) {
        this.healthStatuses = healthStatuses;
        return this;
    }
    public java.util.List<String> getHealthStatuses() {
        return this.healthStatuses;
    }

    public ListResourceHealthParam setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public ListResourceHealthParam setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public ListResourceHealthParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListResourceHealthParam setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceHealthParam setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListResourceHealthParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListResourceHealthParam setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}

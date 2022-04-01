// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigsParam extends TeaModel {
    // applicationName
    @NameInMap("applicationName")
    public String applicationName;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // configFileName
    @NameInMap("configFileName")
    public String configFileName;

    // configItemKey
    @NameInMap("configItemKey")
    public String configItemKey;

    // configScope
    @NameInMap("configScope")
    public String configScope;

    // configType
    @NameInMap("configType")
    public String configType;

    // nodeGroupId
    @NameInMap("nodeGroupId")
    public String nodeGroupId;

    // nodeId
    @NameInMap("nodeId")
    public String nodeId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

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

    // tagName
    @NameInMap("tagNames")
    public java.util.List<String> tagNames;

    public static ListConfigsParam build(java.util.Map<String, ?> map) throws Exception {
        ListConfigsParam self = new ListConfigsParam();
        return TeaModel.build(map, self);
    }

    public ListConfigsParam setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListConfigsParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListConfigsParam setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

    public ListConfigsParam setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey;
        return this;
    }
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    public ListConfigsParam setConfigScope(String configScope) {
        this.configScope = configScope;
        return this;
    }
    public String getConfigScope() {
        return this.configScope;
    }

    public ListConfigsParam setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public ListConfigsParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ListConfigsParam setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ListConfigsParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListConfigsParam setOrderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public java.util.List<String> getOrderBy() {
        return this.orderBy;
    }

    public ListConfigsParam setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListConfigsParam setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListConfigsParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListConfigsParam setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListConfigsParam setTagNames(java.util.List<String> tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public java.util.List<String> getTagNames() {
        return this.tagNames;
    }

}

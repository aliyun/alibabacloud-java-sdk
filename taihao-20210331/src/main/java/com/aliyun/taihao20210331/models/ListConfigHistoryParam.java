// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigHistoryParam extends TeaModel {
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

    // configVersion
    @NameInMap("configVersion")
    public String configVersion;

    // description
    @NameInMap("description")
    public String description;

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

    public static ListConfigHistoryParam build(java.util.Map<String, ?> map) throws Exception {
        ListConfigHistoryParam self = new ListConfigHistoryParam();
        return TeaModel.build(map, self);
    }

    public ListConfigHistoryParam setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListConfigHistoryParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListConfigHistoryParam setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

    public ListConfigHistoryParam setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey;
        return this;
    }
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    public ListConfigHistoryParam setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }
    public String getConfigVersion() {
        return this.configVersion;
    }

    public ListConfigHistoryParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListConfigHistoryParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ListConfigHistoryParam setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ListConfigHistoryParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListConfigHistoryParam setOrderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public java.util.List<String> getOrderBy() {
        return this.orderBy;
    }

    public ListConfigHistoryParam setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListConfigHistoryParam setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListConfigHistoryParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListConfigHistoryParam setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}

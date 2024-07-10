// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebApplicationInstancesRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>c-667d143a-17b4e0fa-46d3a2******</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    /**
     * <strong>example:</strong>
     * <p>001</p>
     */
    @NameInMap("VersionIds")
    public java.util.List<String> versionIds;

    public static ListWebApplicationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWebApplicationInstancesRequest self = new ListWebApplicationInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListWebApplicationInstancesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListWebApplicationInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListWebApplicationInstancesRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public ListWebApplicationInstancesRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListWebApplicationInstancesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListWebApplicationInstancesRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public ListWebApplicationInstancesRequest setVersionIds(java.util.List<String> versionIds) {
        this.versionIds = versionIds;
        return this;
    }
    public java.util.List<String> getVersionIds() {
        return this.versionIds;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebApplicationInstancesShrinkRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>c-667d143a-17b4e0fa-46d3a2******</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

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
    public String statusesShrink;

    /**
     * <strong>example:</strong>
     * <p>001</p>
     */
    @NameInMap("VersionIds")
    public String versionIdsShrink;

    public static ListWebApplicationInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWebApplicationInstancesShrinkRequest self = new ListWebApplicationInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWebApplicationInstancesShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListWebApplicationInstancesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public ListWebApplicationInstancesShrinkRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public ListWebApplicationInstancesShrinkRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListWebApplicationInstancesShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListWebApplicationInstancesShrinkRequest setStatusesShrink(String statusesShrink) {
        this.statusesShrink = statusesShrink;
        return this;
    }
    public String getStatusesShrink() {
        return this.statusesShrink;
    }

    public ListWebApplicationInstancesShrinkRequest setVersionIdsShrink(String versionIdsShrink) {
        this.versionIdsShrink = versionIdsShrink;
        return this;
    }
    public String getVersionIdsShrink() {
        return this.versionIdsShrink;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListEdgeWorkersShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required for renewal scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-14T15:20:37+08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of cluster IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;hive-4fbf3928d40e43948b98acdb4fb5aaed&quot;]</p>
     */
    @NameInMap("HiveIds")
    public String hiveIdsShrink;

    /**
     * <p>The list of payload IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>ew-xxxxxx</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The page number of the query. The value starts from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. The maximum value is 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of package IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;pk-4fbf3928d40e43948b98acdb4fb5aaed&quot;]</p>
     */
    @NameInMap("PlanIds")
    public String planIdsShrink;

    /**
     * <p>Specification</p>
     * 
     * <strong>example:</strong>
     * <p>ew.gn8t6xlarge-rb.x1p</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The parameter for filtering by time range. The time must be in ISO 8601 format and use UTC. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-25T06:35:26+08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The list of statuses.</p>
     */
    @NameInMap("Statuses")
    public String statusesShrink;

    public static ListEdgeWorkersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeWorkersShrinkRequest self = new ListEdgeWorkersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListEdgeWorkersShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListEdgeWorkersShrinkRequest setHiveIdsShrink(String hiveIdsShrink) {
        this.hiveIdsShrink = hiveIdsShrink;
        return this;
    }
    public String getHiveIdsShrink() {
        return this.hiveIdsShrink;
    }

    public ListEdgeWorkersShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public ListEdgeWorkersShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEdgeWorkersShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEdgeWorkersShrinkRequest setPlanIdsShrink(String planIdsShrink) {
        this.planIdsShrink = planIdsShrink;
        return this;
    }
    public String getPlanIdsShrink() {
        return this.planIdsShrink;
    }

    public ListEdgeWorkersShrinkRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public ListEdgeWorkersShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListEdgeWorkersShrinkRequest setStatusesShrink(String statusesShrink) {
        this.statusesShrink = statusesShrink;
        return this;
    }
    public String getStatusesShrink() {
        return this.statusesShrink;
    }

}

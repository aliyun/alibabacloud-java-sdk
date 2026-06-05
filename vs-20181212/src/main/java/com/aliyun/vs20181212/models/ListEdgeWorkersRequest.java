// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListEdgeWorkersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-05-14T15:20:37+08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>[&quot;hive-4fbf3928d40e43948b98acdb4fb5aaed&quot;]</p>
     */
    @NameInMap("HiveIds")
    public java.util.List<String> hiveIds;

    /**
     * <strong>example:</strong>
     * <p>ew-xxxxxx</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>[&quot;pk-4fbf3928d40e43948b98acdb4fb5aaed&quot;]</p>
     */
    @NameInMap("PlanIds")
    public java.util.List<String> planIds;

    /**
     * <strong>example:</strong>
     * <p>ew.gn8t6xlarge-rb.x1p</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <strong>example:</strong>
     * <p>2026-05-25T06:35:26+08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    public static ListEdgeWorkersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeWorkersRequest self = new ListEdgeWorkersRequest();
        return TeaModel.build(map, self);
    }

    public ListEdgeWorkersRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListEdgeWorkersRequest setHiveIds(java.util.List<String> hiveIds) {
        this.hiveIds = hiveIds;
        return this;
    }
    public java.util.List<String> getHiveIds() {
        return this.hiveIds;
    }

    public ListEdgeWorkersRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListEdgeWorkersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEdgeWorkersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEdgeWorkersRequest setPlanIds(java.util.List<String> planIds) {
        this.planIds = planIds;
        return this;
    }
    public java.util.List<String> getPlanIds() {
        return this.planIds;
    }

    public ListEdgeWorkersRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public ListEdgeWorkersRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListEdgeWorkersRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

}

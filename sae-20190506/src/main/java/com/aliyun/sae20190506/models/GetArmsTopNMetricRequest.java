// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetArmsTopNMetricRequest extends TeaModel {
    @NameInMap("AppSource")
    public String appSource;

    @NameInMap("CpuStrategy")
    public String cpuStrategy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetArmsTopNMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArmsTopNMetricRequest self = new GetArmsTopNMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetArmsTopNMetricRequest setAppSource(String appSource) {
        this.appSource = appSource;
        return this;
    }
    public String getAppSource() {
        return this.appSource;
    }

    public GetArmsTopNMetricRequest setCpuStrategy(String cpuStrategy) {
        this.cpuStrategy = cpuStrategy;
        return this;
    }
    public String getCpuStrategy() {
        return this.cpuStrategy;
    }

    public GetArmsTopNMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetArmsTopNMetricRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public GetArmsTopNMetricRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetArmsTopNMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetArmsTopNMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

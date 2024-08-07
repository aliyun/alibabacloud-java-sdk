// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetWarningEventMetricRequest extends TeaModel {
    /**
     * <p>The SAE application type. Valid values:</p>
     * <ul>
     * <li><strong>micro_service</strong></li>
     * <li><strong>web</strong></li>
     * <li><strong>job</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>micro_service</p>
     */
    @NameInMap("AppSource")
    public String appSource;

    /**
     * <p>The CPU allocation policy. Valid values:</p>
     * <ul>
     * <li><strong>request</strong>: CPU cores are allocated only when a request is initiated.</li>
     * <li><strong>always</strong>: Fixed CPU cores are always allocated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>always</p>
     */
    @NameInMap("CpuStrategy")
    public String cpuStrategy;

    /**
     * <p>The end of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1675824035951</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of entries to return. Valid values: 0 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1675823135951</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetWarningEventMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWarningEventMetricRequest self = new GetWarningEventMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetWarningEventMetricRequest setAppSource(String appSource) {
        this.appSource = appSource;
        return this;
    }
    public String getAppSource() {
        return this.appSource;
    }

    public GetWarningEventMetricRequest setCpuStrategy(String cpuStrategy) {
        this.cpuStrategy = cpuStrategy;
        return this;
    }
    public String getCpuStrategy() {
        return this.cpuStrategy;
    }

    public GetWarningEventMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetWarningEventMetricRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public GetWarningEventMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetWarningEventMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetAvailabilityMetricRequest extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetAvailabilityMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAvailabilityMetricRequest self = new GetAvailabilityMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetAvailabilityMetricRequest setAppSource(String appSource) {
        this.appSource = appSource;
        return this;
    }
    public String getAppSource() {
        return this.appSource;
    }

    public GetAvailabilityMetricRequest setCpuStrategy(String cpuStrategy) {
        this.cpuStrategy = cpuStrategy;
        return this;
    }
    public String getCpuStrategy() {
        return this.cpuStrategy;
    }

    public GetAvailabilityMetricRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public GetAvailabilityMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

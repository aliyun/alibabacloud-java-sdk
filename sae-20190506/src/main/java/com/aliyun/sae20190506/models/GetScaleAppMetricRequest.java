// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetScaleAppMetricRequest extends TeaModel {
    @NameInMap("AppSource")
    public String appSource;

    @NameInMap("CpuStrategy")
    public String cpuStrategy;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("RegionId")
    public String regionId;

    public static GetScaleAppMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScaleAppMetricRequest self = new GetScaleAppMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetScaleAppMetricRequest setAppSource(String appSource) {
        this.appSource = appSource;
        return this;
    }
    public String getAppSource() {
        return this.appSource;
    }

    public GetScaleAppMetricRequest setCpuStrategy(String cpuStrategy) {
        this.cpuStrategy = cpuStrategy;
        return this;
    }
    public String getCpuStrategy() {
        return this.cpuStrategy;
    }

    public GetScaleAppMetricRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public GetScaleAppMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

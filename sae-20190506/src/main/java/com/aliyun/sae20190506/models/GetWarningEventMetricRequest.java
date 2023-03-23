// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetWarningEventMetricRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetWarningEventMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWarningEventMetricRequest self = new GetWarningEventMetricRequest();
        return TeaModel.build(map, self);
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

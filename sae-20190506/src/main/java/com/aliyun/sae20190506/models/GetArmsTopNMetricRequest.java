// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetArmsTopNMetricRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetArmsTopNMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArmsTopNMetricRequest self = new GetArmsTopNMetricRequest();
        return TeaModel.build(map, self);
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

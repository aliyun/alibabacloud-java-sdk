// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTagKeyRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("SpanName")
    public String spanName;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static GetTagKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTagKeyRequest self = new GetTagKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetTagKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTagKeyRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetTagKeyRequest setSpanName(String spanName) {
        this.spanName = spanName;
        return this;
    }
    public String getSpanName() {
        return this.spanName;
    }

    public GetTagKeyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetTagKeyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTagValRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("SpanName")
    public String spanName;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TagKey")
    public String tagKey;

    public static GetTagValRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTagValRequest self = new GetTagValRequest();
        return TeaModel.build(map, self);
    }

    public GetTagValRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetTagValRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTagValRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetTagValRequest setSpanName(String spanName) {
        this.spanName = spanName;
        return this;
    }
    public String getSpanName() {
        return this.spanName;
    }

    public GetTagValRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetTagValRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

}

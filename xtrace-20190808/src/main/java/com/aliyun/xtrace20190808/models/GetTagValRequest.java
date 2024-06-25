// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTagValRequest extends TeaModel {
    /**
     * <p>The timestamp of the end time of the time range to query. The timestamp is accurate to milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1575622455686</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>appTest</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The name of the span.</p>
     * 
     * <strong>example:</strong>
     * <p>createOrder</p>
     */
    @NameInMap("SpanName")
    public String spanName;

    /**
     * <p>The timestamp of the start time of the time range to query. The timestamp is accurate to milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1575561600000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The tag key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>span.kind</p>
     */
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

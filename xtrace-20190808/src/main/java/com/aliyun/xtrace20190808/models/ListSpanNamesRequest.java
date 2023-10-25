// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class ListSpanNamesRequest extends TeaModel {
    /**
     * <p>The timestamp of the end time of the time range to query. The timestamp is accurate to milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The timestamp of the start time of the time range to query. The timestamp is accurate to milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListSpanNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSpanNamesRequest self = new ListSpanNamesRequest();
        return TeaModel.build(map, self);
    }

    public ListSpanNamesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListSpanNamesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSpanNamesRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListSpanNamesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

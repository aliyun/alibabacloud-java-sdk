// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class ListIpOrHostsRequest extends TeaModel {
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
     * <p>The name of the application. If you do not set this parameter, the IP addresses of all applications in the specified region are returned.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The timestamp of the start time of the time range to query. The timestamp is accurate to milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListIpOrHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpOrHostsRequest self = new ListIpOrHostsRequest();
        return TeaModel.build(map, self);
    }

    public ListIpOrHostsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListIpOrHostsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIpOrHostsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListIpOrHostsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

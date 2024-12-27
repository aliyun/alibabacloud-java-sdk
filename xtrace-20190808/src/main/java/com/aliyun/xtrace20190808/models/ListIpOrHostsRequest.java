// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class ListIpOrHostsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a timestamp that is accurate to milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1583723776974</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the service. If you do not specify this parameter, the IP addresses of all applications in the specified region are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>service1</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The beginning of the time range to query. The value is a timestamp that is accurate to milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1583683200000</p>
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

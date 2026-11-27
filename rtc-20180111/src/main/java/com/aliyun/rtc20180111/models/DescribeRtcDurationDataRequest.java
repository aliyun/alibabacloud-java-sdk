// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcDurationDataRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can specify only one ID.</p>
     * <p>If you leave this parameter empty, data for all your applications is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end of the time range to query. Specify the time in UTC format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>The end time must be later than the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-04T07:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the query, in seconds.</p>
     * <p>Valid values are <strong>3600</strong> (1 hour) and <strong>86400</strong> (1 day). The default value is <strong>3600</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The area where the service is deployed. The default value is CN, which indicates China.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("ServiceArea")
    public String serviceArea;

    /**
     * <p>The start of the time range to query. Specify the time in UTC format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-04T05:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRtcDurationDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcDurationDataRequest self = new DescribeRtcDurationDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcDurationDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRtcDurationDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRtcDurationDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeRtcDurationDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRtcDurationDataRequest setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }
    public String getServiceArea() {
        return this.serviceArea;
    }

    public DescribeRtcDurationDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

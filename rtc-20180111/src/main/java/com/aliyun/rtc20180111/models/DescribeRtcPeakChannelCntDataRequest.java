// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcPeakChannelCntDataRequest extends TeaModel {
    /**
     * <p>The application ID. Only a single ID can be specified.</p>
     * <p>By default, all application IDs are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time for the data query. Specify the time in the UTC format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>The end time must be later than the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-29T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity for the data query, in seconds.</p>
     * <p>Valid values: <strong>3600</strong> (1 hour) or <strong>86400</strong> (1 day). Default value: <strong>3600</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The service area. CN: China (default value).</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("ServiceArea")
    public String serviceArea;

    /**
     * <p>The start time for the data query. Specify the time in the UTC format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-29T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRtcPeakChannelCntDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcPeakChannelCntDataRequest self = new DescribeRtcPeakChannelCntDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcPeakChannelCntDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRtcPeakChannelCntDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRtcPeakChannelCntDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeRtcPeakChannelCntDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRtcPeakChannelCntDataRequest setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }
    public String getServiceArea() {
        return this.serviceArea;
    }

    public DescribeRtcPeakChannelCntDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

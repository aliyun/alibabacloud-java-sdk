// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcUserCntDataRequest extends TeaModel {
    /**
     * <p>The application ID. You can specify only one ID.</p>
     * <p>By default, all application IDs are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the queried data. The time is displayed in UTC. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>The end time must be later than the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-29T01:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity at which the data is queried. Unit: seconds.</p>
     * <p>Valid values: <strong>3600</strong> (one hour) or <strong>86400</strong> (one day). Default value: <strong>3600</strong>.</p>
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
     * <p>The start time of the queried data. The time is displayed in UTC. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-29T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRtcUserCntDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserCntDataRequest self = new DescribeRtcUserCntDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserCntDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRtcUserCntDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRtcUserCntDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeRtcUserCntDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRtcUserCntDataRequest setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }
    public String getServiceArea() {
        return this.serviceArea;
    }

    public DescribeRtcUserCntDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcPeakUserCntDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ServiceArea")
    public String serviceArea;

    @NameInMap("Interval")
    public String interval;

    public static DescribeRtcPeakUserCntDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcPeakUserCntDataRequest self = new DescribeRtcPeakUserCntDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcPeakUserCntDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRtcPeakUserCntDataRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public DescribeRtcPeakUserCntDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRtcPeakUserCntDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRtcPeakUserCntDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRtcPeakUserCntDataRequest setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }
    public String getServiceArea() {
        return this.serviceArea;
    }

    public DescribeRtcPeakUserCntDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

}

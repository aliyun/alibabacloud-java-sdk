// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcUserCntDataRequest extends TeaModel {
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

    public static DescribeRtcUserCntDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserCntDataRequest self = new DescribeRtcUserCntDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserCntDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRtcUserCntDataRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public DescribeRtcUserCntDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRtcUserCntDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRtcUserCntDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRtcUserCntDataRequest setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }
    public String getServiceArea() {
        return this.serviceArea;
    }

    public DescribeRtcUserCntDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

}

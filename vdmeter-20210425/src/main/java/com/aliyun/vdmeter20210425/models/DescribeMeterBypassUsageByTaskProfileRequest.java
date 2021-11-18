// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterBypassUsageByTaskProfileRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("ServiceArea")
    public String serviceArea;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeMeterBypassUsageByTaskProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterBypassUsageByTaskProfileRequest self = new DescribeMeterBypassUsageByTaskProfileRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterBypassUsageByTaskProfileRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeMeterBypassUsageByTaskProfileRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMeterBypassUsageByTaskProfileRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeMeterBypassUsageByTaskProfileRequest setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }
    public String getServiceArea() {
        return this.serviceArea;
    }

    public DescribeMeterBypassUsageByTaskProfileRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

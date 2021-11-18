// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcBandWidthUsageRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("ServiceArea")
    public String serviceArea;

    @NameInMap("StartTs")
    public Long startTs;

    public static DescribeMeterRtcBandWidthUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcBandWidthUsageRequest self = new DescribeMeterRtcBandWidthUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcBandWidthUsageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeMeterRtcBandWidthUsageRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeMeterRtcBandWidthUsageRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeMeterRtcBandWidthUsageRequest setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }
    public String getServiceArea() {
        return this.serviceArea;
    }

    public DescribeMeterRtcBandWidthUsageRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}

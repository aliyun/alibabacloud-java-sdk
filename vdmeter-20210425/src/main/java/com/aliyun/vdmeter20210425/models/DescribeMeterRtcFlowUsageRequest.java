// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcFlowUsageRequest extends TeaModel {
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

    public static DescribeMeterRtcFlowUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcFlowUsageRequest self = new DescribeMeterRtcFlowUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcFlowUsageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeMeterRtcFlowUsageRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeMeterRtcFlowUsageRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeMeterRtcFlowUsageRequest setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }
    public String getServiceArea() {
        return this.serviceArea;
    }

    public DescribeMeterRtcFlowUsageRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}

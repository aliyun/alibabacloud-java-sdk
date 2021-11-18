// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRecordUsageByTaskProfileRequest extends TeaModel {
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

    public static DescribeMeterRecordUsageByTaskProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRecordUsageByTaskProfileRequest self = new DescribeMeterRecordUsageByTaskProfileRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRecordUsageByTaskProfileRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeMeterRecordUsageByTaskProfileRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeMeterRecordUsageByTaskProfileRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeMeterRecordUsageByTaskProfileRequest setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }
    public String getServiceArea() {
        return this.serviceArea;
    }

    public DescribeMeterRecordUsageByTaskProfileRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}

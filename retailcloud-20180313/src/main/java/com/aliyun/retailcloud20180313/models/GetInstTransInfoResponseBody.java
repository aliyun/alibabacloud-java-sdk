// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class GetInstTransInfoResponseBody extends TeaModel {
    @NameInMap("chargeType")
    public String chargeType;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("isAutoRenew")
    public Boolean isAutoRenew;

    @NameInMap("renewCycle")
    public Integer renewCycle;

    @NameInMap("startTime")
    public Long startTime;

    public static GetInstTransInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstTransInfoResponseBody self = new GetInstTransInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstTransInfoResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public GetInstTransInfoResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetInstTransInfoResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstTransInfoResponseBody setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    public GetInstTransInfoResponseBody setRenewCycle(Integer renewCycle) {
        this.renewCycle = renewCycle;
        return this;
    }
    public Integer getRenewCycle() {
        return this.renewCycle;
    }

    public GetInstTransInfoResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

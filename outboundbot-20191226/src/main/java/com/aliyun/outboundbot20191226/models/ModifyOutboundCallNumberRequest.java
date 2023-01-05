// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyOutboundCallNumberRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Number")
    public String number;

    @NameInMap("OutboundCallNumberId")
    public String outboundCallNumberId;

    @NameInMap("RateLimitCount")
    public Integer rateLimitCount;

    @NameInMap("RateLimitPeriod")
    public Integer rateLimitPeriod;

    public static ModifyOutboundCallNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOutboundCallNumberRequest self = new ModifyOutboundCallNumberRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOutboundCallNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyOutboundCallNumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public ModifyOutboundCallNumberRequest setOutboundCallNumberId(String outboundCallNumberId) {
        this.outboundCallNumberId = outboundCallNumberId;
        return this;
    }
    public String getOutboundCallNumberId() {
        return this.outboundCallNumberId;
    }

    public ModifyOutboundCallNumberRequest setRateLimitCount(Integer rateLimitCount) {
        this.rateLimitCount = rateLimitCount;
        return this;
    }
    public Integer getRateLimitCount() {
        return this.rateLimitCount;
    }

    public ModifyOutboundCallNumberRequest setRateLimitPeriod(Integer rateLimitPeriod) {
        this.rateLimitPeriod = rateLimitPeriod;
        return this;
    }
    public Integer getRateLimitPeriod() {
        return this.rateLimitPeriod;
    }

}

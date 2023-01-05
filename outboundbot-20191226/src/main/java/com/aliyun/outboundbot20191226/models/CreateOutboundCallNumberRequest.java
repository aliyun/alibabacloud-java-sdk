// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateOutboundCallNumberRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Number")
    public String number;

    @NameInMap("RateLimitCount")
    public Integer rateLimitCount;

    @NameInMap("RateLimitPeriod")
    public Integer rateLimitPeriod;

    public static CreateOutboundCallNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundCallNumberRequest self = new CreateOutboundCallNumberRequest();
        return TeaModel.build(map, self);
    }

    public CreateOutboundCallNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOutboundCallNumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public CreateOutboundCallNumberRequest setRateLimitCount(Integer rateLimitCount) {
        this.rateLimitCount = rateLimitCount;
        return this;
    }
    public Integer getRateLimitCount() {
        return this.rateLimitCount;
    }

    public CreateOutboundCallNumberRequest setRateLimitPeriod(Integer rateLimitPeriod) {
        this.rateLimitPeriod = rateLimitPeriod;
        return this;
    }
    public Integer getRateLimitPeriod() {
        return this.rateLimitPeriod;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateOutboundCallNumberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95187</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RateLimitCount")
    public Integer rateLimitCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyOutboundCallNumberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>52e80b02-0126-4556-a1e6-ef5b3747ed53/a9a3ddc7-d7d7-48cd-82b5-b31bb5510e71_2a66f8ad-dfbb-4980-9b84-439171295a11.xlsx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10088</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fa0e21e9-caab-4629-9121-1e341243d599</p>
     */
    @NameInMap("OutboundCallNumberId")
    public String outboundCallNumberId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RateLimitCount")
    public Integer rateLimitCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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

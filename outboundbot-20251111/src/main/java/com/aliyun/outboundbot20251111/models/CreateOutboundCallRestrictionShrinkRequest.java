// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateOutboundCallRestrictionShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The outbound call restriction.</p>
     */
    @NameInMap("OutboundCallRestriction")
    public String outboundCallRestrictionShrink;

    /**
     * <p>The policy. Valid values:
     * 0: blacklist.
     * 1: whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Policy")
    public Integer policy;

    public static CreateOutboundCallRestrictionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundCallRestrictionShrinkRequest self = new CreateOutboundCallRestrictionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOutboundCallRestrictionShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOutboundCallRestrictionShrinkRequest setOutboundCallRestrictionShrink(String outboundCallRestrictionShrink) {
        this.outboundCallRestrictionShrink = outboundCallRestrictionShrink;
        return this;
    }
    public String getOutboundCallRestrictionShrink() {
        return this.outboundCallRestrictionShrink;
    }

    public CreateOutboundCallRestrictionShrinkRequest setPolicy(Integer policy) {
        this.policy = policy;
        return this;
    }
    public Integer getPolicy() {
        return this.policy;
    }

}

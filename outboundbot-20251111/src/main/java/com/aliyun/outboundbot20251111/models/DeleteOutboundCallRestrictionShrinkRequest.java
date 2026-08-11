// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class DeleteOutboundCallRestrictionShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of outbound call restriction IDs.</p>
     */
    @NameInMap("RestrictionIdList")
    public String restrictionIdListShrink;

    public static DeleteOutboundCallRestrictionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOutboundCallRestrictionShrinkRequest self = new DeleteOutboundCallRestrictionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOutboundCallRestrictionShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteOutboundCallRestrictionShrinkRequest setRestrictionIdListShrink(String restrictionIdListShrink) {
        this.restrictionIdListShrink = restrictionIdListShrink;
        return this;
    }
    public String getRestrictionIdListShrink() {
        return this.restrictionIdListShrink;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class DeleteOutboundCallRestrictionRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of outbound restriction IDs.</p>
     */
    @NameInMap("RestrictionIdList")
    public java.util.List<String> restrictionIdList;

    public static DeleteOutboundCallRestrictionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOutboundCallRestrictionRequest self = new DeleteOutboundCallRestrictionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOutboundCallRestrictionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteOutboundCallRestrictionRequest setRestrictionIdList(java.util.List<String> restrictionIdList) {
        this.restrictionIdList = restrictionIdList;
        return this;
    }
    public java.util.List<String> getRestrictionIdList() {
        return this.restrictionIdList;
    }

}

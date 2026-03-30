// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DisableSubscriptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSubscriptionRequest self = new DisableSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public DisableSubscriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

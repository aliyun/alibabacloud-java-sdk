// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateWarmPoolInput extends TeaModel {
    /**
     * <p>The warm pool capacity policy, which includes the base target capacity and optional scheduled rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("capacityPolicy")
    public WarmPoolCapacityPolicyInput capacityPolicy;

    public static UpdateWarmPoolInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarmPoolInput self = new UpdateWarmPoolInput();
        return TeaModel.build(map, self);
    }

    public UpdateWarmPoolInput setCapacityPolicy(WarmPoolCapacityPolicyInput capacityPolicy) {
        this.capacityPolicy = capacityPolicy;
        return this;
    }
    public WarmPoolCapacityPolicyInput getCapacityPolicy() {
        return this.capacityPolicy;
    }

}

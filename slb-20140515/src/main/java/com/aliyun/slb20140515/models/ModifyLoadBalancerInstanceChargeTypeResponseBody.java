// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerInstanceChargeTypeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLoadBalancerInstanceChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerInstanceChargeTypeResponseBody self = new ModifyLoadBalancerInstanceChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerInstanceChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

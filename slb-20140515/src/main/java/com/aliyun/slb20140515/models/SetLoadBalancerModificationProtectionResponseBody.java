// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerModificationProtectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>791D8B68-AE0F-4174-AF54-088C8B3C5D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetLoadBalancerModificationProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerModificationProtectionResponseBody self = new SetLoadBalancerModificationProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerModificationProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

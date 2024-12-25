// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerDeleteProtectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>791D8B68-AE0F-4174-AF54-088C8B3C5D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetLoadBalancerDeleteProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerDeleteProtectionResponseBody self = new SetLoadBalancerDeleteProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerDeleteProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

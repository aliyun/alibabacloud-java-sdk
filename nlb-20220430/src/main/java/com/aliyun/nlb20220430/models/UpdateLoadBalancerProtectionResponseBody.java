// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerProtectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLoadBalancerProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerProtectionResponseBody self = new UpdateLoadBalancerProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

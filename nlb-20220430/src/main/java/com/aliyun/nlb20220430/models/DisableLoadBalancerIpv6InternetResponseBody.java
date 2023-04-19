// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DisableLoadBalancerIpv6InternetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableLoadBalancerIpv6InternetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableLoadBalancerIpv6InternetResponseBody self = new DisableLoadBalancerIpv6InternetResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableLoadBalancerIpv6InternetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

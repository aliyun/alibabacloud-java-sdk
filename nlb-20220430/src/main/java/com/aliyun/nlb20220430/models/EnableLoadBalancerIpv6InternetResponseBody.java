// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class EnableLoadBalancerIpv6InternetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableLoadBalancerIpv6InternetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableLoadBalancerIpv6InternetResponseBody self = new EnableLoadBalancerIpv6InternetResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableLoadBalancerIpv6InternetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

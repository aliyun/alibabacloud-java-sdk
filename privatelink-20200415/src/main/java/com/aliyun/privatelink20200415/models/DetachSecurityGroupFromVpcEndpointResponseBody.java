// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DetachSecurityGroupFromVpcEndpointResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8D778FF9-7640-4C13-BCD6-9265CA9A2F81</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachSecurityGroupFromVpcEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachSecurityGroupFromVpcEndpointResponseBody self = new DetachSecurityGroupFromVpcEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachSecurityGroupFromVpcEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

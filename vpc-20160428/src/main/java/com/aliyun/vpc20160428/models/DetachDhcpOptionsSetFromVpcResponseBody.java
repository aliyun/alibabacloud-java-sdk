// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DetachDhcpOptionsSetFromVpcResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachDhcpOptionsSetFromVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachDhcpOptionsSetFromVpcResponseBody self = new DetachDhcpOptionsSetFromVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachDhcpOptionsSetFromVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

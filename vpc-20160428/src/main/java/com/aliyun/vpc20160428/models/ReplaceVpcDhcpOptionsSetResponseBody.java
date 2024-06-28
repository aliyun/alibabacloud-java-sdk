// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ReplaceVpcDhcpOptionsSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReplaceVpcDhcpOptionsSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceVpcDhcpOptionsSetResponseBody self = new ReplaceVpcDhcpOptionsSetResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceVpcDhcpOptionsSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

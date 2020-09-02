// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ReplaceVpcDhcpOptionsSetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReplaceVpcDhcpOptionsSetResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceVpcDhcpOptionsSetResponse self = new ReplaceVpcDhcpOptionsSetResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceVpcDhcpOptionsSetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

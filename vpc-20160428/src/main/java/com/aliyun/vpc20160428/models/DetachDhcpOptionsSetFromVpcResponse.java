// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DetachDhcpOptionsSetFromVpcResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DetachDhcpOptionsSetFromVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachDhcpOptionsSetFromVpcResponse self = new DetachDhcpOptionsSetFromVpcResponse();
        return TeaModel.build(map, self);
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateRouteTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnassociateRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateRouteTableResponse self = new UnassociateRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateRouteTableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateRouteTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnassociateRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnassociateRouteTableResponseBody self = new UnassociateRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public UnassociateRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeactivateRouterInterfaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeactivateRouterInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeactivateRouterInterfaceResponseBody self = new DeactivateRouterInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeactivateRouterInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

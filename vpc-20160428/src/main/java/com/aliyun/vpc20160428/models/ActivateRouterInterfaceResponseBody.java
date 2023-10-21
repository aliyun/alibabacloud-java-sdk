// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ActivateRouterInterfaceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ActivateRouterInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateRouterInterfaceResponseBody self = new ActivateRouterInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateRouterInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>980960B0-2969-40BF-8542-EBB34FD358AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody self = new UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

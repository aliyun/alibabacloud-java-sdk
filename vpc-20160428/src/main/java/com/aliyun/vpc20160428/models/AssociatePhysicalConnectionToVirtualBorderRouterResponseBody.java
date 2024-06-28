// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociatePhysicalConnectionToVirtualBorderRouterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>980960B0-2969-40BF-8542-EBB34FD358AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociatePhysicalConnectionToVirtualBorderRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociatePhysicalConnectionToVirtualBorderRouterResponseBody self = new AssociatePhysicalConnectionToVirtualBorderRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

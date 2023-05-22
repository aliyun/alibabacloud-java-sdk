// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateGlobalAccelerationInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateGlobalAccelerationInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateGlobalAccelerationInstanceResponseBody self = new AssociateGlobalAccelerationInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateGlobalAccelerationInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateGlobalAccelerationInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AssociateGlobalAccelerationInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateGlobalAccelerationInstanceResponse self = new AssociateGlobalAccelerationInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AssociateGlobalAccelerationInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

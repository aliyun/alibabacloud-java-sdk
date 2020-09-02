// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyGlobalAccelerationInstanceSpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyGlobalAccelerationInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalAccelerationInstanceSpecResponse self = new ModifyGlobalAccelerationInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalAccelerationInstanceSpecResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

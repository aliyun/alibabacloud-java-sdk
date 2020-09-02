// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyGlobalAccelerationInstanceAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyGlobalAccelerationInstanceAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalAccelerationInstanceAttributesResponse self = new ModifyGlobalAccelerationInstanceAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalAccelerationInstanceAttributesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

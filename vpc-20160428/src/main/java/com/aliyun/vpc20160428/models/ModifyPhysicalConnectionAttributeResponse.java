// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyPhysicalConnectionAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyPhysicalConnectionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhysicalConnectionAttributeResponse self = new ModifyPhysicalConnectionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPhysicalConnectionAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

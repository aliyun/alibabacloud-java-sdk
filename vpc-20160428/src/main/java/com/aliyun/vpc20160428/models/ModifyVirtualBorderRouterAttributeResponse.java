// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVirtualBorderRouterAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyVirtualBorderRouterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualBorderRouterAttributeResponse self = new ModifyVirtualBorderRouterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualBorderRouterAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

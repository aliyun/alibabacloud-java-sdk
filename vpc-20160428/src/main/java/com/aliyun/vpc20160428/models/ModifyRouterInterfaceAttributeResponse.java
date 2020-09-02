// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyRouterInterfaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceAttributeResponse self = new ModifyRouterInterfaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRouterInterfaceAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

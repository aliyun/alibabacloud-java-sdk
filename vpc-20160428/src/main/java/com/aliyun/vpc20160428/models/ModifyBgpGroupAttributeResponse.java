// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpGroupAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyBgpGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBgpGroupAttributeResponse self = new ModifyBgpGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBgpGroupAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

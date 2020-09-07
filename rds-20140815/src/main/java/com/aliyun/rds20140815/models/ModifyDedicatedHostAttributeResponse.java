// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDedicatedHostAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAttributeResponse self = new ModifyDedicatedHostAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

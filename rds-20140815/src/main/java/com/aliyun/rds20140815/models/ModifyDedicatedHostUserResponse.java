// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDedicatedHostUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostUserResponse self = new ModifyDedicatedHostUserResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostUserResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

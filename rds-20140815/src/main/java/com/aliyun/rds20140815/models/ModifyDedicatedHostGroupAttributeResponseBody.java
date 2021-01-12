// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostGroupAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDedicatedHostGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostGroupAttributeResponseBody self = new ModifyDedicatedHostGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

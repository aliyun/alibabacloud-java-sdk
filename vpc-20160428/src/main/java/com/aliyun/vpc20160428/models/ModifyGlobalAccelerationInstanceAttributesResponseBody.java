// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyGlobalAccelerationInstanceAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGlobalAccelerationInstanceAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalAccelerationInstanceAttributesResponseBody self = new ModifyGlobalAccelerationInstanceAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalAccelerationInstanceAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

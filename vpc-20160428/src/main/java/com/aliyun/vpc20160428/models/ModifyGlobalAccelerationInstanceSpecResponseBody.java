// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyGlobalAccelerationInstanceSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGlobalAccelerationInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalAccelerationInstanceSpecResponseBody self = new ModifyGlobalAccelerationInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalAccelerationInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

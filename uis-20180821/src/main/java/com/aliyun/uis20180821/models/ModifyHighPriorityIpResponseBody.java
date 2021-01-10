// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyHighPriorityIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHighPriorityIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHighPriorityIpResponseBody self = new ModifyHighPriorityIpResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHighPriorityIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyNetworkOptimizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNetworkOptimizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkOptimizationResponseBody self = new ModifyNetworkOptimizationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkOptimizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

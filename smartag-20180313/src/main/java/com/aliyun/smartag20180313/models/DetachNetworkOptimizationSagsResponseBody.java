// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DetachNetworkOptimizationSagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachNetworkOptimizationSagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachNetworkOptimizationSagsResponseBody self = new DetachNetworkOptimizationSagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachNetworkOptimizationSagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

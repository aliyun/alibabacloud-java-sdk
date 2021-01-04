// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AttachNetworkOptimizationSagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachNetworkOptimizationSagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachNetworkOptimizationSagsResponseBody self = new AttachNetworkOptimizationSagsResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachNetworkOptimizationSagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

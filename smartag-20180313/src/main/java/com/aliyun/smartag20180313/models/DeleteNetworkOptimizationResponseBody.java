// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteNetworkOptimizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkOptimizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkOptimizationResponseBody self = new DeleteNetworkOptimizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkOptimizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

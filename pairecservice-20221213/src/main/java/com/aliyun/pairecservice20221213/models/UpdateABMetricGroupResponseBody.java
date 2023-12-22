// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateABMetricGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateABMetricGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateABMetricGroupResponseBody self = new UpdateABMetricGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateABMetricGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteABMetricGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteABMetricGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteABMetricGroupResponseBody self = new DeleteABMetricGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteABMetricGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteMetricGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMetricGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricGroupResponseBody self = new DeleteMetricGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMetricGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateMetricGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMetricGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetricGroupResponseBody self = new UpdateMetricGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMetricGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

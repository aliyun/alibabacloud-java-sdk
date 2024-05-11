// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateMetricResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetricResponseBody self = new UpdateMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

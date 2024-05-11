// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateMetricGroupResponseBody extends TeaModel {
    @NameInMap("MetricGroupId")
    public String metricGroupId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateMetricGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricGroupResponseBody self = new CreateMetricGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMetricGroupResponseBody setMetricGroupId(String metricGroupId) {
        this.metricGroupId = metricGroupId;
        return this;
    }
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    public CreateMetricGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

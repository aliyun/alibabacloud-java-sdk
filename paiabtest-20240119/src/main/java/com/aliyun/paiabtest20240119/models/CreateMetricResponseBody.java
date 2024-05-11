// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateMetricResponseBody extends TeaModel {
    @NameInMap("MetricId")
    public String metricId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricResponseBody self = new CreateMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMetricResponseBody setMetricId(String metricId) {
        this.metricId = metricId;
        return this;
    }
    public String getMetricId() {
        return this.metricId;
    }

    public CreateMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterPrometheusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Prometheus")
    @Validation(required = true)
    public String prometheus;

    public static DescribeClusterPrometheusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterPrometheusResponse self = new DescribeClusterPrometheusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterPrometheusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterPrometheusResponse setPrometheus(String prometheus) {
        this.prometheus = prometheus;
        return this;
    }
    public String getPrometheus() {
        return this.prometheus;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterPrometheusResponseBody extends TeaModel {
    /**
     * <p>The public endpoint of the Prometheus service that is used to monitor a cluster in the ASM instance.</p>
     */
    @NameInMap("Prometheus")
    public String prometheus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterPrometheusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterPrometheusResponseBody self = new DescribeClusterPrometheusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterPrometheusResponseBody setPrometheus(String prometheus) {
        this.prometheus = prometheus;
        return this;
    }
    public String getPrometheus() {
        return this.prometheus;
    }

    public DescribeClusterPrometheusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

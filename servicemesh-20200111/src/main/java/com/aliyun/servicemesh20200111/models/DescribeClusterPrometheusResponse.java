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

}

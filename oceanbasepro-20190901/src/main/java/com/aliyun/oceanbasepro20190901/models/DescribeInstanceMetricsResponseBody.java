// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceMetricsResponseBody extends TeaModel {
    @NameInMap("InstanceMetrics")
    public String instanceMetrics;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMetricsResponseBody self = new DescribeInstanceMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMetricsResponseBody setInstanceMetrics(String instanceMetrics) {
        this.instanceMetrics = instanceMetrics;
        return this;
    }
    public String getInstanceMetrics() {
        return this.instanceMetrics;
    }

    public DescribeInstanceMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceMetricsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}

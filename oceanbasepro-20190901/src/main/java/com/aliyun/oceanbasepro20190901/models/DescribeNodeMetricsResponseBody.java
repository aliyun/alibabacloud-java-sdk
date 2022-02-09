// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeNodeMetricsResponseBody extends TeaModel {
    // 节点指标信息
    @NameInMap("NodeMetrics")
    public String nodeMetrics;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 总数量
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNodeMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeMetricsResponseBody self = new DescribeNodeMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeMetricsResponseBody setNodeMetrics(String nodeMetrics) {
        this.nodeMetrics = nodeMetrics;
        return this;
    }
    public String getNodeMetrics() {
        return this.nodeMetrics;
    }

    public DescribeNodeMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNodeMetricsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}

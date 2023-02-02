// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeNodeMetricsResponseBody extends TeaModel {
    /**
     * <p>The metrics of the node.</p>
     */
    @NameInMap("NodeMetrics")
    public String nodeMetrics;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count.</p>
     */
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

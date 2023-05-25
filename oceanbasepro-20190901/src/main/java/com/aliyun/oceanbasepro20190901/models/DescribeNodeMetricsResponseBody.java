// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeNodeMetricsResponseBody extends TeaModel {
    @NameInMap("NodeMetrics")
    public String nodeMetrics;

    /**
     * <p>You can call this operation to query the detailed metrics information of an OceanBase Database node.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>```</p>
     * <p>http(s)://[Endpoint]/?Action=DescribeNodeMetrics</p>
     * <p>&InstanceId=ob317v4uif****</p>
     * <p>&PageSize=10</p>
     * <p>&PageNumber=1</p>
     * <p>&TenantId=ob2mr3oae0****</p>
     * <p>&StartTime=2021-06-13 15:40:43</p>
     * <p>&EndTime=2021-09-13 15:40:43</p>
     * <p>&Metrics=tps</p>
     * <p>&NodeName=i-bp16niirq4zdmgvm****</p>
     * <p>&NodeIdList=["i-bp19y05uq6xpacyqnlrc","i-bp1blcr3htr3g3u2vqvu","i-bp1392ikhayhr3hi4fli"]</p>
     * <p>&Common request parameters</p>
     * <p>```</p>
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

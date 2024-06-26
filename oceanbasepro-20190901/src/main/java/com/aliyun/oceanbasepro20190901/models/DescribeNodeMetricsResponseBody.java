// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeNodeMetricsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("NodeMetrics")
    public String nodeMetrics;

    /**
     * <p>You can call this operation to query the detailed metrics information of an OceanBase Database node.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <pre><code>http(s)://[Endpoint]/?Action=DescribeNodeMetrics
     * &amp;InstanceId=ob317v4uif****
     * &amp;PageSize=10
     * &amp;PageNumber=1
     * &amp;TenantId=ob2mr3oae0****
     * &amp;StartTime=2021-06-13 15:40:43
     * &amp;EndTime=2021-09-13 15:40:43
     * &amp;Metrics=tps
     * &amp;NodeName=i-bp16niirq4zdmgvm****
     * &amp;NodeIdList=[&quot;i-bp19y05uq6xpacyqnlrc&quot;,&quot;i-bp1blcr3htr3g3u2vqvu&quot;,&quot;i-bp1392ikhayhr3hi4fli&quot;]
     * &amp;Common request parameters
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>9</p>
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

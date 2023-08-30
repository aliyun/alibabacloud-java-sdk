// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeMonitorDataResponseBody extends TeaModel {
    /**
     * <p>The monitoring data.</p>
     */
    @NameInMap("Datapoints")
    public String datapoints;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The interval at which the monitoring data is queried. Valid values: 60, 300, and 900. Unit: seconds.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>If MetricName is set to FLOW_USED, the value of Period is 3600 (one hour).</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>****</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorDataResponseBody self = new DescribeMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorDataResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
    }

    public DescribeMonitorDataResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMonitorDataResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

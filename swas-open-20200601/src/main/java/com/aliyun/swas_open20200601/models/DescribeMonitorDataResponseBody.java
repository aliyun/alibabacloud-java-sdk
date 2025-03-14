// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeMonitorDataResponseBody extends TeaModel {
    /**
     * <p>The monitoring data.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Datapoints")
    public String datapoints;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nOc1nj4M9UaAZ/I8db***</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The interval at which the monitoring data is queried. Valid values: 60, 300, and 900. Unit: seconds.</p>
     * <blockquote>
     * <p> If you set the MetricName request parameter to FLOW_USED, the value of Period is 3600 (one hour).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
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

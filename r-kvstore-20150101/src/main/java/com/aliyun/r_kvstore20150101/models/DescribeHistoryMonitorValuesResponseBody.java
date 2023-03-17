// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryMonitorValuesResponseBody extends TeaModel {
    /**
     * <p>The monitoring data returned in the JSON format. For more information, see [MonitorKeys](~~189831~~).</p>
     * <br>
     * <p>> * Only metrics whose values are not 0 are returned. This improves data transmission efficiency. Metrics that are not displayed are represented by the default value of **0**.</p>
     * <p>> * The query result is aligned with the data aggregation frequency. If the specified time range to query is less than 10 minutes and the data aggregation frequency is every 5 seconds, query results are returned at an interval of 5 seconds. If the specified StartTime value does not coincide with a point in time for data aggregation, the system returns the latest point in time for data aggregation as the first point in time. For example, if you set the StartTime parameter to 2022-01-20T12:01:48Z, the first point in time returned is 2022-01-20T12:01:45Z.</p>
     */
    @NameInMap("MonitorHistory")
    public String monitorHistory;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHistoryMonitorValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryMonitorValuesResponseBody self = new DescribeHistoryMonitorValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryMonitorValuesResponseBody setMonitorHistory(String monitorHistory) {
        this.monitorHistory = monitorHistory;
        return this;
    }
    public String getMonitorHistory() {
        return this.monitorHistory;
    }

    public DescribeHistoryMonitorValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

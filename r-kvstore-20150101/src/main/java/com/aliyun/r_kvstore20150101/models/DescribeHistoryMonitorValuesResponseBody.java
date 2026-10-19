// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryMonitorValuesResponseBody extends TeaModel {
    /**
     * <p>The monitoring information returned in JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/122091.html">Monitoring parameter description</a>.</p>
     * <blockquote>
     * <p>To improve data transmission efficiency, only non-zero monitoring data is returned. All other monitoring data that is not displayed has a default value of <strong>0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;2022-11-06T00:00:00Z\&quot;:{\&quot;memoryUsage\&quot;:\&quot;6.67\&quot;},\&quot;2022-11-06T00:00:05Z\&quot;:{\&quot;memoryUsage\&quot;:\&quot;6.67\&quot;},\&quot;2022-11-06T00:00:10Z\&quot;:{\&quot;memoryUsage\&quot;:\&quot;6.67\&quot;},\&quot;2022-11-06T00:00:15Z\&quot;:{\&quot;memoryUsage\&quot;:\&quot;6.67\&quot;},\&quot;2022-11-06T00:00:20Z\&quot;:{\&quot;memoryUsage\&quot;:\&quot;6.67\&quot;},\&quot;2022-11-06T00:00:25Z\&quot;:{\&quot;memoryUsage\&quot;:\&quot;6.67\&quot;}}&quot;</p>
     */
    @NameInMap("MonitorHistory")
    public String monitorHistory;

    @NameInMap("MonitorLegend")
    public String monitorLegend;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F0997EE8-F4C2-4503-9168-85177ED7****</p>
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

    public DescribeHistoryMonitorValuesResponseBody setMonitorLegend(String monitorLegend) {
        this.monitorLegend = monitorLegend;
        return this;
    }
    public String getMonitorLegend() {
        return this.monitorLegend;
    }

    public DescribeHistoryMonitorValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

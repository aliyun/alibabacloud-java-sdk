// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryMonitorValuesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MonitorHistory")
    public String monitorHistory;

    public static DescribeHistoryMonitorValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryMonitorValuesResponseBody self = new DescribeHistoryMonitorValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryMonitorValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHistoryMonitorValuesResponseBody setMonitorHistory(String monitorHistory) {
        this.monitorHistory = monitorHistory;
        return this;
    }
    public String getMonitorHistory() {
        return this.monitorHistory;
    }

}

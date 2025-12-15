// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceMonitorResponseBody extends TeaModel {
    /**
     * <p>The collection frequency of the monitoring data. Unit: second.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>276F582D-C6B2-519C-A5ED-2A92BB15EC07</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceMonitorResponseBody self = new DescribeDBInstanceMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceMonitorResponseBody setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDBInstanceMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

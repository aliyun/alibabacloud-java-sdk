// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterMonitorResponseBody extends TeaModel {
    /**
     * <p>The interval at which monitoring data is collected. Unit: seconds.</p>
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
     * <p>593AE1C5-B70C-463F-9207-074639******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterMonitorResponseBody self = new DescribeDBClusterMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterMonitorResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeDBClusterMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterMonitorResponseBody extends TeaModel {
    @NameInMap("Period")
    public String period;

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

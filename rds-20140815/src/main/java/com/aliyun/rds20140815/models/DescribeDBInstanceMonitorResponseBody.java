// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Period")
    public String period;

    public static DescribeDBInstanceMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceMonitorResponseBody self = new DescribeDBInstanceMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceMonitorResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

}

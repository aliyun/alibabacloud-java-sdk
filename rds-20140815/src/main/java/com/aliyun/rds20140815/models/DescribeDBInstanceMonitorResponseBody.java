// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceMonitorResponseBody extends TeaModel {
    /**
     * <p>The monitoring frequency. Unit: seconds.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceMonitorResponseBody self = new DescribeDBInstanceMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceMonitorResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeDBInstanceMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

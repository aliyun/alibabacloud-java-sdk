// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceMonitorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Period")
    @Validation(required = true)
    public String period;

    public static DescribeDBInstanceMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceMonitorResponse self = new DescribeDBInstanceMonitorResponse();
        return TeaModel.build(map, self);
    }

}

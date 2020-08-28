// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterMonitorResponse extends TeaModel {
    @NameInMap("Period")
    @Validation(required = true)
    public String period;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DescribeDBClusterMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterMonitorResponse self = new DescribeDBClusterMonitorResponse();
        return TeaModel.build(map, self);
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAuditLogCollectorResponse extends TeaModel {
    @NameInMap("CollectorStatus")
    @Validation(required = true)
    public String collectorStatus;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DescribeDBClusterAuditLogCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAuditLogCollectorResponse self = new DescribeDBClusterAuditLogCollectorResponse();
        return TeaModel.build(map, self);
    }

}

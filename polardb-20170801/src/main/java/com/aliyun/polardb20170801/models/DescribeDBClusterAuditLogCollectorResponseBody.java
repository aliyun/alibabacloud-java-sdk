// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAuditLogCollectorResponseBody extends TeaModel {
    @NameInMap("CollectorStatus")
    public String collectorStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterAuditLogCollectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAuditLogCollectorResponseBody self = new DescribeDBClusterAuditLogCollectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAuditLogCollectorResponseBody setCollectorStatus(String collectorStatus) {
        this.collectorStatus = collectorStatus;
        return this;
    }
    public String getCollectorStatus() {
        return this.collectorStatus;
    }

    public DescribeDBClusterAuditLogCollectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

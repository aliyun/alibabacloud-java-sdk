// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAuditLogCollectorResponseBody extends TeaModel {
    /**
     * <p>The status of SQL collector. Valid values:</p>
     * <ul>
     * <li>Enable</li>
     * <li>Disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("CollectorStatus")
    public String collectorStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>59011D2B-2A38-4207-A86C-72BC1F882D19</p>
     */
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

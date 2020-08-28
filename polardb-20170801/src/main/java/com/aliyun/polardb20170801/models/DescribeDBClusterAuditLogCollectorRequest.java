// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAuditLogCollectorRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    public static DescribeDBClusterAuditLogCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAuditLogCollectorRequest self = new DescribeDBClusterAuditLogCollectorRequest();
        return TeaModel.build(map, self);
    }

}

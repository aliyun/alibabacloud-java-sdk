// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableMetricsRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeAvailableMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableMetricsRequest self = new DescribeAvailableMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableMetricsRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeAvailableMetricsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

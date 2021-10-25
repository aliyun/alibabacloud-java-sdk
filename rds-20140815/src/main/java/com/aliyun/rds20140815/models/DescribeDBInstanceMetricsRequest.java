// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceMetricsRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    public static DescribeDBInstanceMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceMetricsRequest self = new DescribeDBInstanceMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceMetricsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstanceMetricsRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

}

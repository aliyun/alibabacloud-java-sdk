// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableMetricsRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    public static DescribeAvailableMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableMetricsRequest self = new DescribeAvailableMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableMetricsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAvailableMetricsRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CalculateDBInstanceWeightRequest extends TeaModel {
    /**
     * <p>The primary instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CalculateDBInstanceWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        CalculateDBInstanceWeightRequest self = new CalculateDBInstanceWeightRequest();
        return TeaModel.build(map, self);
    }

    public CalculateDBInstanceWeightRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CalculateDBInstanceWeightRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can specify up to 30 instance IDs in a single request. If you specify multiple instance IDs, separate the instance IDs with commas (,).</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether the instance expires. Valid values:</p>
     * <br>
     * <p>*   **True**: The instance expires.</p>
     * <p>*   **False:** The instance does not expire.</p>
     */
    @NameInMap("Expired")
    public String expired;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeDBInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeRequest self = new DescribeDBInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceAttributeRequest setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeDBInstanceAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

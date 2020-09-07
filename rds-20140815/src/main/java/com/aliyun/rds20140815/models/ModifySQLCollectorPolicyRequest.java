// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorPolicyRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("SQLCollectorStatus")
    @Validation(required = true)
    public String SQLCollectorStatus;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifySQLCollectorPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLCollectorPolicyRequest self = new ModifySQLCollectorPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifySQLCollectorPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifySQLCollectorPolicyRequest setSQLCollectorStatus(String SQLCollectorStatus) {
        this.SQLCollectorStatus = SQLCollectorStatus;
        return this;
    }
    public String getSQLCollectorStatus() {
        return this.SQLCollectorStatus;
    }

    public ModifySQLCollectorPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyReadonlyInstanceDelayReplicationTimeRequest extends TeaModel {
    /**
     * <p>The ID of the read-only instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The latency at which to replicate data from the primary instance to the read-only instance. Unit: seconds.</p>
     */
    @NameInMap("ReadSQLReplicationTime")
    public String readSQLReplicationTime;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyReadonlyInstanceDelayReplicationTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReadonlyInstanceDelayReplicationTimeRequest self = new ModifyReadonlyInstanceDelayReplicationTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReadonlyInstanceDelayReplicationTimeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyReadonlyInstanceDelayReplicationTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyReadonlyInstanceDelayReplicationTimeRequest setReadSQLReplicationTime(String readSQLReplicationTime) {
        this.readSQLReplicationTime = readSQLReplicationTime;
        return this;
    }
    public String getReadSQLReplicationTime() {
        return this.readSQLReplicationTime;
    }

    public ModifyReadonlyInstanceDelayReplicationTimeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyReadonlyInstanceDelayReplicationTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyReadonlyInstanceDelayReplicationTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

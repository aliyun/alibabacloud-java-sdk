// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDelayedReplicationTimeRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/26232.html">DescribeDBInstances</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The replication latency of the read-only instance. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ReadSQLReplicationTime")
    public String readSQLReplicationTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBInstanceDelayedReplicationTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDelayedReplicationTimeRequest self = new ModifyDBInstanceDelayedReplicationTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDelayedReplicationTimeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceDelayedReplicationTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceDelayedReplicationTimeRequest setReadSQLReplicationTime(String readSQLReplicationTime) {
        this.readSQLReplicationTime = readSQLReplicationTime;
        return this;
    }
    public String getReadSQLReplicationTime() {
        return this.readSQLReplicationTime;
    }

    public ModifyDBInstanceDelayedReplicationTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceDelayedReplicationTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

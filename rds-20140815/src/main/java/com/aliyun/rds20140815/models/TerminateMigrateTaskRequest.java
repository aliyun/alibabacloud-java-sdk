// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class TerminateMigrateTaskRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the migration task. You can call the [DescribeMigrateTasks](~~64563~~) operation to query the ID of the migration task.</p>
     */
    @NameInMap("MigrateTaskId")
    public String migrateTaskId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static TerminateMigrateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateMigrateTaskRequest self = new TerminateMigrateTaskRequest();
        return TeaModel.build(map, self);
    }

    public TerminateMigrateTaskRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public TerminateMigrateTaskRequest setMigrateTaskId(String migrateTaskId) {
        this.migrateTaskId = migrateTaskId;
        return this;
    }
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    public TerminateMigrateTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TerminateMigrateTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TerminateMigrateTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

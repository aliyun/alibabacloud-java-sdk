// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOnlineDatabaseTaskRequest extends TeaModel {
    /**
     * <p>The consistency check method after the database is open. Valid values:</p>
     * <ul>
     * <li><strong>SyncExecuteDBCheck</strong>: synchronous database check</li>
     * <li><strong>AsyncExecuteDBCheck</strong>: asynchronous database check</li>
     * </ul>
     * <blockquote>
     * <p>The check methods are supported for RDS instances that run SQL Server 2008 R2.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AsyncExecuteDBCheck</p>
     */
    @NameInMap("CheckDBMode")
    public String checkDBMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The ID of the migration task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5652255443</p>
     */
    @NameInMap("MigrateTaskId")
    public String migrateTaskId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateOnlineDatabaseTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOnlineDatabaseTaskRequest self = new CreateOnlineDatabaseTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOnlineDatabaseTaskRequest setCheckDBMode(String checkDBMode) {
        this.checkDBMode = checkDBMode;
        return this;
    }
    public String getCheckDBMode() {
        return this.checkDBMode;
    }

    public CreateOnlineDatabaseTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateOnlineDatabaseTaskRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateOnlineDatabaseTaskRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateOnlineDatabaseTaskRequest setMigrateTaskId(String migrateTaskId) {
        this.migrateTaskId = migrateTaskId;
        return this;
    }
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    public CreateOnlineDatabaseTaskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateOnlineDatabaseTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateOnlineDatabaseTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateOnlineDatabaseTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

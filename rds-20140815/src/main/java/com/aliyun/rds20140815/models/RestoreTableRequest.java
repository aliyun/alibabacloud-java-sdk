// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestoreTableRequest extends TeaModel {
    /**
     * <p>The ID of the data backup file.</p>
     * <br>
     * <p>You can call the [DescribeBackups](~~26273~~) operation to obtain the ID of the data backup file.</p>
     * <br>
     * <p>>  You must specify at least one of **BackupId** and **RestoreTime** parameters.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to enable the fast individual database and table restoration feature. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the feature.</p>
     * <p>*   **false**: disables the feature.</p>
     * <br>
     * <p>>  For more information, see [Restore individual databases and tables of an ApsaraDB RDS for MySQL instance](~~103175~~).</p>
     */
    @NameInMap("InstantRecovery")
    public Boolean instantRecovery;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which you want to restore data. The point in time must fall within the specified log backup retention period. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> * You must specify at least one of **BackupId** and **RestoreTime** parameters.</p>
     * <p>> * You must enable the log backup feature. For more information, see [Back up an ApsaraDB RDS for MySQL instance](~~98818~~).</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The databases and tables that you want to restore. Format:</p>
     * <br>
     * <p>```</p>
     * <p>[{"type":"db","name":"","newname":"","tables":[{"type":"table","name":"","newname":""},{"type":"table","name":"","newname":""}]},{"type":"db","name":"","newname":"","tables":[{"type":"table","name":"","newname":""},{"type":"table","name":"","newname":""}]}]</p>
     * <p>```</p>
     */
    @NameInMap("TableMeta")
    public String tableMeta;

    public static RestoreTableRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreTableRequest self = new RestoreTableRequest();
        return TeaModel.build(map, self);
    }

    public RestoreTableRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public RestoreTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RestoreTableRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RestoreTableRequest setInstantRecovery(Boolean instantRecovery) {
        this.instantRecovery = instantRecovery;
        return this;
    }
    public Boolean getInstantRecovery() {
        return this.instantRecovery;
    }

    public RestoreTableRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RestoreTableRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RestoreTableRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RestoreTableRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RestoreTableRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public RestoreTableRequest setTableMeta(String tableMeta) {
        this.tableMeta = tableMeta;
        return this;
    }
    public String getTableMeta() {
        return this.tableMeta;
    }

}

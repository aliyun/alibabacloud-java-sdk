// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestoreTableRequest extends TeaModel {
    /**
     * <p>The ID of the backup set.</p>
     * <br>
     * <p>>  You must specify this parameter if you need to restore a database or a table by using a backup set. You can call the [DescribeBackups](https://help.aliyun.com/document_detail/98102.html) operation to query the ID of the backup set.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusters](https://help.aliyun.com/document_detail/98094.html) operation to query the details of all clusters within your account.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time for the restoration. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You must specify this parameter if you need to restore the database or the table to a point in time.</p>
     * <br>
     * <p>*   You can restore your cluster to a particular time only over the past seven days.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The JSON string that contains the information of the database and the table that you want to restore. All values of the database and table information are of the string type. Example: `[ { "tables":[ { "name":"testtb", "type":"table", "newname":"testtb_restore" } ], "name":"testdb", "type":"db", "newname":"testdb_restore" } ]`.</p>
     * <br>
     * <p>>  You can call the [DescribeMetaList](https://help.aliyun.com/document_detail/194770.html) operation to query the names and details of databases and tables that can be restored and enter their information into the corresponding locations in the preceding example.</p>
     * <br>
     * <p>This parameter is required.</p>
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

    public RestoreTableRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
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

    public RestoreTableRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RestoreTableRequest setTableMeta(String tableMeta) {
        this.tableMeta = tableMeta;
        return this;
    }
    public String getTableMeta() {
        return this.tableMeta;
    }

}

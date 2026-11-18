// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestoreTableRequest extends TeaModel {
    /**
     * <p>The backup set ID.</p>
     * <blockquote>
     * <p>This parameter is required if you want to restore the destination databases and tables from a backup set. You can call the <a href="https://help.aliyun.com/document_detail/98102.html">DescribeBackups</a> operation to query the backup set ID.</p>
     * </blockquote>
     * <blockquote>
     * <p>To obtain the backup set ID, call the DescribeBackups operation and specify the StartTime and EndTime parameters. Then, call the DescribeMetaList operation to obtain the metadata of the restorable databases and tables. Operation description: Dependency chain description: To obtain the BackupId, you must call the DescribeBackups operation (the StartTime and EndTime parameters are required). To obtain the database and table names required for TableMeta, you must call the DescribeMetaList operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters within your account.</p>
     * </blockquote>
     * <blockquote>
     * <p>The destination cluster must be in the Running state. You can call the DescribeDBClusterAttribute operation to query the current state. Operation description: Status prerequisite: The cluster must be in the Running state. You can call the DescribeDBClusterAttribute operation to query the current state.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp***************</p>
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
     * <p>The point in time to which you want to restore the data. Specify the time in the YYYY-MM-DDThh:mmZ format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required if you want to restore data to a specific point in time.</li>
     * <li>You can restore data to any point in time within the last seven days.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-10-04T01:40:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The JSON string that contains the information about the destination databases and tables to be restored. All values in the database and table information are of the string type.
     * Example: <code>[    {        &quot;tables&quot;:[            {                &quot;name&quot;:&quot;testtb&quot;,                &quot;type&quot;:&quot;table&quot;,                &quot;newname&quot;:&quot;testtb_restore&quot;            }        ],        &quot;name&quot;:&quot;testdb&quot;,        &quot;type&quot;:&quot;db&quot;,        &quot;newname&quot;:&quot;testdb_restore&quot;    } ]</code>.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/194770.html">DescribeMetaList</a> operation to view the details of the databases and tables that can be restored, and fill in the restorable database and table information in the corresponding positions in the preceding example.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;tables&quot;:[ { &quot;name&quot;:&quot;testtb&quot;, &quot;type&quot;:&quot;table&quot;, &quot;newname&quot;:&quot;testtb_restore&quot; } ], &quot;name&quot;:&quot;testdb&quot;, &quot;type&quot;:&quot;db&quot;, &quot;newname&quot;:&quot;testdb_restore&quot; } ]</p>
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

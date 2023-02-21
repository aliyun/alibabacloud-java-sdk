// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestoreDdrTableRequest extends TeaModel {
    /**
     * <p>The ID of the cross-region backup file that you want to use. You can call the [DescribeCrossRegionBackups](~~121733~~) operation to query the ID of the cross-region backup file.</p>
     * <br>
     * <p>>  If you set the **RestoreType** parameter to **0**, you must also specify the BackupId parameter.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the generated token is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the source instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the destination instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which you want to restore data. The specified point in time must be earlier than the current time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>>  If you set the **RestoreType** parameter to **1**, you must also specify the RestoreTime parameter.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The restoration method that you want to use. Valid values:</p>
     * <br>
     * <p>*   **0**: restores data from a backup file. You must also specify the **BackupId** parameter.</p>
     * <p>*   **1**: restores data to a point in time. You must also specify the **RestoreTime**, **SourceRegion**, and **SourceDBInstanceName** parameters.</p>
     * <br>
     * <p>Default value: **0**.</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The ID of the source instance whose data you want to restore to a point in time.</p>
     * <br>
     * <p>>  If you set the **RestoreType** parameter to **1**, you must also specify the SourceDBInstanceName parameter.</p>
     */
    @NameInMap("SourceDBInstanceName")
    public String sourceDBInstanceName;

    /**
     * <p>The region ID of the source instance whose data you want to restore to a point in time.</p>
     * <br>
     * <p>>  If you set the **RestoreType** parameter to **1**, you must also specify the SourceRegion parameter.</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The names of the databases and tables that you want to restore for the source instance. Syntax:</p>
     * <br>
     * <p>    [{"type":"db","name":"<The name of Database 1>","newname":"<The new name of Database 1>","tables":[{"type":"table","name":"<The name of Table 1 in Database 1>","newname":"<The new name of Table 1>"},{"type":"table","name":"<The name of Table 2 in Database 1>","newname":"<The new name of Table 2>"}]},{"type":"db","name":"<The name of Database 2>","newname":"<The new name of Database 2>","tables":[{"type":"table","name":"<The name of Table 3 in Database 2>","newname":"<The new name of Table 3>"},{"type":"table","name":"<The name of Table 4 in Database 2>","newname":"<The new name of Table 4>"}]}]</p>
     */
    @NameInMap("TableMeta")
    public String tableMeta;

    public static RestoreDdrTableRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreDdrTableRequest self = new RestoreDdrTableRequest();
        return TeaModel.build(map, self);
    }

    public RestoreDdrTableRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public RestoreDdrTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RestoreDdrTableRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RestoreDdrTableRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RestoreDdrTableRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestoreDdrTableRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RestoreDdrTableRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RestoreDdrTableRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RestoreDdrTableRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public RestoreDdrTableRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public RestoreDdrTableRequest setSourceDBInstanceName(String sourceDBInstanceName) {
        this.sourceDBInstanceName = sourceDBInstanceName;
        return this;
    }
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    public RestoreDdrTableRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public RestoreDdrTableRequest setTableMeta(String tableMeta) {
        this.tableMeta = tableMeta;
        return this;
    }
    public String getTableMeta() {
        return this.tableMeta;
    }

}

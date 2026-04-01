// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestoreDdrTableRequest extends TeaModel {
    /**
     * <p>The cross-region backup set ID. You can call the DescribeCrossRegionBackups operation to query the IDs of the backup sets that are available to an instance.</p>
     * <blockquote>
     * <p> If you set the <strong>RestoreType</strong> parameter to <strong>0</strong>, you must also specify the BackupId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>279563</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The source instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bpxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the destination instance. You can call the DescribeRegions operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which you want to restore data. The point in time that you specify must be earlier than the current time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>If <strong>RestoreType</strong> is set to <strong>BackupTime</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-04-25T16:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The method that is used to restore data. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: restores data from a backup set. If you set this parameter to 0, you must also specify the <strong>BackupSetId</strong> parameter.</li>
     * <li><strong>1</strong>: restores data to a point in time. If you set this parameter to 1, you must also specify the <strong>RestoreTime</strong>, <strong>SourceRegion</strong>, and <strong>SourceDBInstanceName</strong> parameters.</li>
     * </ul>
     * <p>Default value: <strong>0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The ID of the source instance whose data you want to restore to a point in time.</p>
     * <blockquote>
     * <p> If you set the <strong>RestoreType</strong> parameter to <strong>1</strong>, you must also specify the SourceDBInstanceName parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bpxxxxx</p>
     */
    @NameInMap("SourceDBInstanceName")
    public String sourceDBInstanceName;

    /**
     * <p>The region ID of the source instance if you want to restore data to a point in time.</p>
     * <blockquote>
     * <p>: If you set <strong>RestoreType</strong> to <strong>1</strong>, you must also specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The names of the databases and tables that you want to restore. The value is in the following format: <code>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;&lt;The name of Database 1 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Database 1 on the destination instance&gt;&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;&lt;The name of Table 1 in Database 1 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Table 1 in Database 1 on the destination instance&gt;&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;&lt;The name of Table 2 in Database 1 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Table 2 in Database 1 on the destination instance&gt;&quot;}]},{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;&lt;The name of Database 2 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Database 2 on the destination instance&gt;&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;&lt;The name of Table 3 in Database 2 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Table 3 in Database 2 on the destination instance&gt;&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;&lt;The name of Table 4 in Database 2 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Table 4 in Database 2 on the destination instance&gt;&quot;}]}]</code></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;testdb1&quot;,&quot;newname&quot;:&quot;testdb1&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;test1&quot;,&quot;newname&quot;:&quot;test1_backup&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;test2&quot;,&quot;newname&quot;:&quot;test2_backup&quot;}]}]</p>
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

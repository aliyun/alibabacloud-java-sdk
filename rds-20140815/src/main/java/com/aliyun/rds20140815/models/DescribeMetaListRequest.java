// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMetaListRequest extends TeaModel {
    /**
     * <p>The ID of the backup set that is used to query data when the restore method is based on a backup set. You can call the DescribeBackups operation to query the ID.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>RestoreType</strong> is set to <strong>BackupSetID</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>14***</p>
     */
    @NameInMap("BackupSetID")
    public Long backupSetID;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The value can be up to 64 ASCII characters in length and cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Instance ID of the instance. You can call the DescribeDBInstances operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database to query. Exact match is used. The specific database name and all tables in the database are returned.</p>
     * <blockquote>
     * <p>If this parameter is left empty, a list of all databases is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testdb1</p>
     */
    @NameInMap("GetDbName")
    public String getDbName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Valid values: any integer greater than <strong>0</strong> and less than or equal to the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when it is used together with <strong>PageSize</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when it is used together with <strong>PageIndex</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the database to query. Fuzzy match is used. Only the matched database names are returned, and table names are not returned.</p>
     * <blockquote>
     * <p>For example, if you specify <code>test</code>, <code>testdb1</code> and <code>testdb2</code> are matched. After you determine the name of the target database, you can specify the exact database name in the <strong>GetDbName</strong> parameter to view the information about all tables in the target database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Pattern")
    public String pattern;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which you want to restore data. The time must be earlier than the current time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC. You can call the DescribeBackups operation to query the time.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>RestoreType</strong> is set to <strong>RestoreTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-05-30T03:29:10Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The restore method. Valid values:</p>
     * <ul>
     * <li><strong>BackupSetID</strong>: restores data from a backup set. If you set this parameter to BackupSetID, you must also specify the <strong>BackupSetID</strong> parameter.</li>
     * <li><strong>RestoreTime</strong>: restores data to a specific point in time. If you set this parameter to RestoreTime, you must also specify the <strong>RestoreTime</strong> parameter.</li>
     * </ul>
     * <p>Default value: <strong>BackupSetID</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupSetID</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    public static DescribeMetaListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaListRequest self = new DescribeMetaListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetaListRequest setBackupSetID(Long backupSetID) {
        this.backupSetID = backupSetID;
        return this;
    }
    public Long getBackupSetID() {
        return this.backupSetID;
    }

    public DescribeMetaListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeMetaListRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeMetaListRequest setGetDbName(String getDbName) {
        this.getDbName = getDbName;
        return this;
    }
    public String getGetDbName() {
        return this.getDbName;
    }

    public DescribeMetaListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeMetaListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public DescribeMetaListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMetaListRequest setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public DescribeMetaListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeMetaListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeMetaListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeMetaListRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public DescribeMetaListRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

}

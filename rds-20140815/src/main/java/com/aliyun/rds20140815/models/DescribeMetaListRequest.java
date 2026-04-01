// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMetaListRequest extends TeaModel {
    /**
     * <p>The ID of the backup set from which you want to restore data. You can call the DescribeBackups operation to query the IDs of data backup files.</p>
     * <blockquote>
     * <p> This parameter is required when you set the <strong>RestoreType</strong> parameter to <strong>BackupSetID</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>14358</p>
     */
    @NameInMap("BackupSetID")
    public Long backupSetID;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxxxxx</p>
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
     * <p>The name of the database to query. The system implements exact match based on the value of this parameter and returns the name of the matched database and the names of all tables contained in the database.</p>
     * <blockquote>
     * <p>If you leave this parameter empty, the system returns all databases that are created on the instance.</p>
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
     * <p>The number of the page to return. Valid values: any non-zero positive integer.**** Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>This parameter only takes effect when you specify the <strong>PageSize</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>This parameter only takes effect when you specify the <strong>PageIndex</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the database to query. The system implements fuzzy match based on the value of this parameter and returns only the name of the matched database.</p>
     * <blockquote>
     * <p>For example, if you set the value to <code>test</code>, the system returns <code>testdb1</code> and <code>testdb2</code>. Then, you can specify the <strong>GetDbName</strong> parameter to query tables in the required database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Pattern")
    public String pattern;

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
     * <p>The point in time to which you want to restore data. The specified point in time must be earlier than the current time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC. You can call the DescribeBackups operation to query the restorable time range.</p>
     * <blockquote>
     * <p> This parameter must be specified when the <strong>RestoreType</strong> parameter is set to <strong>RestoreTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-05-30T03:29:10Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The restoration method that you want to use. Valid values:</p>
     * <ul>
     * <li><strong>BackupSetID</strong>: Data is restored from the backup set. If you use this value, you must also specify the <strong>BackupSetID</strong> parameter.</li>
     * <li><strong>RestoreTime</strong>: Data is restored to a specific point in time. If you use this value, you must also specify the <strong>RestoreTime</strong> parameter.</li>
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

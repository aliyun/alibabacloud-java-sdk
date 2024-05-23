// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMetaListRequest extends TeaModel {
    /**
     * <p>The ID of the backup set from which you want to restore data. You can call the DescribeBackups operation to query the IDs of data backup files.</p>
     * <br>
     * <p>>  This parameter is required when you set the **RestoreType** parameter to **BackupSetID**.</p>
     */
    @NameInMap("BackupSetID")
    public Long backupSetID;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database to query. The system implements exact match based on the value of this parameter and returns the name of the matched database and the names of all tables contained in the database.</p>
     * <br>
     * <p>> If you leave this parameter empty, the system returns all databases that are created on the instance.</p>
     */
    @NameInMap("GetDbName")
    public String getDbName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Valid values: any non-zero positive integer.**** Default value: **1**.</p>
     * <br>
     * <p>> This parameter only takes effect when you specify the **PageSize** parameter.</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries to return on each page. Default value: **1**.</p>
     * <br>
     * <p>> This parameter only takes effect when you specify the **PageIndex** parameter.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the database to query. The system implements fuzzy match based on the value of this parameter and returns only the name of the matched database.</p>
     * <br>
     * <p>> For example, if you set the value to `test`, the system returns `testdb1` and `testdb2`. Then, you can specify the **GetDbName** parameter to query tables in the required database.</p>
     */
    @NameInMap("Pattern")
    public String pattern;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which you want to restore data. The specified point in time must be earlier than the current time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC. You can call the DescribeBackups operation to query the restorable time range.</p>
     * <br>
     * <p>>  This parameter must be specified when the **RestoreType** parameter is set to **RestoreTime**.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The restoration method that you want to use. Valid values:</p>
     * <br>
     * <p>*   **BackupSetID**: Data is restored from the backup set. If you use this value, you must also specify the **BackupSetID** parameter.</p>
     * <p>*   **RestoreTime**: Data is restored to a specific point in time. If you use this value, you must also specify the **RestoreTime** parameter.</p>
     * <br>
     * <p>Default value: **BackupSetID**.</p>
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

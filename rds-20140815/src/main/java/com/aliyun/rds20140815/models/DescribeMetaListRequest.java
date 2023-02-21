// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMetaListRequest extends TeaModel {
    /**
     * <p>The ID of the data backup file from which you want to restore data. You can call the [DescribeBackups](~~26273~~) operation to query the IDs of data backup files.</p>
     * <br>
     * <p>>  This parameter is required when you set the **RestoreType** parameter to **BackupSetID**.</p>
     */
    @NameInMap("BackupSetID")
    public Integer backupSetID;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the generated token is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database to query. ApsaraDB RDS implements exact match based on the value of this parameter and returns the name of the matched database and the names of all tables contained in the database.</p>
     * <br>
     * <p>>  If you leave this parameter empty, ApsaraDB RDS returns all databases that are created on the instance.</p>
     */
    @NameInMap("GetDbName")
    public String getDbName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Valid values: any **non-zero** positive integer. Default value: **1**.</p>
     * <br>
     * <p>>  This parameter is valid only when you specify the **PageSize** parameter.</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries to return on each page. Default value: **1**.</p>
     * <br>
     * <p>>  This parameter is valid only when you specify the **PageIndex** parameter.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the database to query. ApsaraDB RDS implements fuzzy match based on the value of this parameter and returns only the names of the matched databases.</p>
     * <br>
     * <p>>  For example, if you set the value to `test`, ApsaraDB RDS returns `testdb1` and `testdb2`. Then, you can specify the **GetDbName** parameter to query tables in the required database.</p>
     */
    @NameInMap("Pattern")
    public String pattern;

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
     * <p>The point in time to which you want to restore data. The specified point in time must be earlier than the current time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC. You can call the [DescribeBackups](~~26273~~) operation to query the restorable time range.</p>
     * <br>
     * <p>>  This parameter is required when you set the **RestoreType** parameter to **RestoreTime**.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The method that is used to restore data. Valid values:</p>
     * <br>
     * <p>*   **BackupSetID**: Data is restored from a data backup file. If you use this value, you must also specify the **BackupSetID** parameter.</p>
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

    public DescribeMetaListRequest setBackupSetID(Integer backupSetID) {
        this.backupSetID = backupSetID;
        return this;
    }
    public Integer getBackupSetID() {
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

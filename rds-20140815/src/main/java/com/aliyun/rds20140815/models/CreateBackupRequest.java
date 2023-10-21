// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateBackupRequest extends TeaModel {
    /**
     * <p>The backup type. Valid values:</p>
     * <br>
     * <p>*   **Logical**: logical backup</p>
     * <p>*   **Physical**: physical backup</p>
     * <p>*   **Snapshot**: snapshot backup</p>
     * <br>
     * <p>Default value: **Physical**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You can perform a logical backup only when databases are created on the instance.</p>
     * <br>
     * <p>*   When you perform a snapshot backup on an ApsaraDB RDS for MariaDB instance, you must set this parameter to **Physical**.</p>
     * <p>*   For more information about the supported backup types, see [Back up an ApsaraDB RDS for MySQL instance](~~98818~~).</p>
     * <p>*   When you perform a snapshot backup on an ApsaraDB RDS for SQL Server instance that uses cloud disks, you must set this parameter to **Snapshot**.</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The backup policy. Valid values:</p>
     * <br>
     * <p>*   **db**: a database-level backup.</p>
     * <p>*   **instance**: an instance-level backup.</p>
     * <br>
     * <p>> You can specify this parameter when you perform a logical backup on an ApsaraDB RDS for MySQL instance. You can also specify this parameter when you perform a full physical backup on an ApsaraDB RDS for SQL Server instance.</p>
     */
    @NameInMap("BackupStrategy")
    public String backupStrategy;

    /**
     * <p>The backup method. Valid values:</p>
     * <br>
     * <p>*   **Auto**: full or incremental backup that is automatically selected</p>
     * <p>*   **FullBackup**: full backup</p>
     * <br>
     * <p>Default value: **Auto**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You must set this parameter only when the instance runs SQL Server.</p>
     * <br>
     * <p>*   This parameter is valid only when you set the **BackupMethod** parameter to **Physical**.</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>The instance ID. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).</p>
     * <br>
     * <p>> You can specify this parameter when you perform a logical backup on individual databases of an ApsaraDB RDS for MySQL instance. You can also specify this parameter when you perform a full physical backup on individual databases of an ApsaraDB RDS for SQL Server instance.</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The resource group ID. You can call the [DescribeDBInstanceAttribute](~~610394~~) operation to obtain the ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupRequest self = new CreateBackupRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public CreateBackupRequest setBackupStrategy(String backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }
    public String getBackupStrategy() {
        return this.backupStrategy;
    }

    public CreateBackupRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public CreateBackupRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateBackupRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateBackupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateBackupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

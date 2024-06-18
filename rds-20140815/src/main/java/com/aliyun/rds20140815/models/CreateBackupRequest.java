// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateBackupRequest extends TeaModel {
    /**
     * <p>The backup type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Logical</strong>: logical backup</li>
     * <li><strong>Physical</strong>: physical backup</li>
     * <li><strong>Snapshot</strong>: snapshot backup</li>
     * </ul>
     * <p>Default value: <strong>Physical</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>You can perform a logical backup only when databases are created on the instance.</li>
     * <li>When you perform a snapshot backup on an ApsaraDB RDS for MariaDB instance, you must set this parameter to <strong>Physical</strong>.</li>
     * <li>For more information about the supported backup types, see <a href="https://help.aliyun.com/document_detail/98818.html">Use the data backup feature</a>.</li>
     * <li>When you perform a snapshot backup on an ApsaraDB RDS for SQL Server instance that uses cloud disks, you must set this parameter to <strong>Snapshot</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Physical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The backup policy. Valid values:</p>
     * <ul>
     * <li><strong>db</strong>: a database-level backup.</li>
     * <li><strong>instance</strong>: an instance-level backup.</li>
     * </ul>
     * <blockquote>
     * <p>You can specify this parameter when you perform a logical backup on an ApsaraDB RDS for MySQL instance. You can also specify this parameter when you perform a full physical backup on an ApsaraDB RDS for SQL Server instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("BackupStrategy")
    public String backupStrategy;

    /**
     * <p>The backup method. Valid values:</p>
     * <ul>
     * <li><strong>Auto</strong>: full or incremental backup that is automatically selected</li>
     * <li><strong>FullBackup</strong>: full backup</li>
     * </ul>
     * <p>Default value: <strong>Auto</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>You must set this parameter only when the instance runs SQL Server.</li>
     * <li>This parameter is valid only when you set the <strong>BackupMethod</strong> parameter to <strong>Physical</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).</p>
     * <blockquote>
     * <p>You can specify this parameter when you perform a logical backup on individual databases of an ApsaraDB RDS for MySQL instance. You can also specify this parameter when you perform a full physical backup on individual databases of an ApsaraDB RDS for SQL Server instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rds_mysql</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The resource group ID. You can call the DescribeDBInstanceAttribute to query the resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
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

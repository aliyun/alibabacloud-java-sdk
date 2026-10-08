// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateBackupRequest extends TeaModel {
    /**
     * <p>The backup type. Valid values:</p>
     * <ul>
     * <li><strong>Logical</strong>: logical backup. Only MySQL instances with local disks support this type.</li>
     * <li><strong>Physical</strong>: physical backup. MySQL instances with local disks, SQL Server instances, and PostgreSQL instances support this type.</li>
     * <li><strong>Snapshot</strong>: snapshot backup. MySQL instances with cloud disks, SQL Server instances, PostgreSQL instances, and MariaDB instances support this type.</li>
     * </ul>
     * <p>Default value: <strong>Physical</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>When you use logical backup, the database must contain data (the data cannot be empty).</li>
     * <li>MariaDB instances support only snapshot backup. However, set this parameter to <strong>Physical</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Physical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <ul>
     * <li><strong>SQL Server</strong>: When the BackupStrategy parameter is set to db, the BackupMethod parameter is set to Physical, and the BackupType parameter is set to FullBackup, you can specify the retention period of the backup set. Valid values: 7 to 730 days, or -1 (long-term retention (LTR)).</li>
     * <li><strong>MySQL</strong>: You can specify the retention period of the backup set. Valid values: 7 to 730 days, or -1 (long-term retention (LTR)).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Long backupRetentionPeriod;

    /**
     * <p>The backup strategy. Valid values:</p>
     * <ul>
     * <li><strong>db</strong>: single-database backup</li>
     * <li><strong>instance</strong>: instance backup</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the following conditions are met:</p>
     * <ul>
     * <li>MySQL: The <strong>BackupMethod</strong> parameter is set to <strong>Logical</strong>.</li>
     * <li>SQL Server: The <strong>BackupType</strong> parameter is set to <strong>FullBackup</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("BackupStrategy")
    public String backupStrategy;

    /**
     * <p>The backup method for SQL Server instances. Valid values:</p>
     * <ul>
     * <li><strong>Auto</strong> (default): automatically selects full backup or incremental backup.</li>
     * <li><strong>FullBackup</strong>: full backup.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the <strong>BackupMethod</strong> parameter is set to <strong>Physical</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The list of databases. Separate multiple databases with commas (,).</p>
     * <blockquote>
     * <p>This parameter takes effect only when the <strong>BackupStrategy</strong> parameter is set to <strong>db</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rds_mysql</p>
     */
    @NameInMap("DBName")
    public String DBName;

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

    public CreateBackupRequest setBackupRetentionPeriod(Long backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Long getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
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

    public CreateBackupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

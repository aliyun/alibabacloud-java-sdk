// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The number of archived backup files that are retained. Default value: <strong>1</strong>. Valid values:</p>
     * <ul>
     * <li>Valid values when <strong>ArchiveBackupKeepPolicy</strong> is set to <strong>ByMonth</strong>: <strong>1</strong> to <strong>31</strong>.</li>
     * <li>Valid values when <strong>ArchiveBackupKeepPolicy</strong> is set to <strong>ByWeek</strong>: <strong>1</strong> to <strong>7</strong>.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You do not need to specify this parameter when <strong>ArchiveBackupKeepPolicy</strong> is set to <strong>KeepAll</strong>.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ArchiveBackupKeepCount")
    public Integer archiveBackupKeepCount;

    /**
     * <p>The retention period of archived backup files. The number of archived backup files that can be retained within the specified retention period is specified by <strong>ArchiveBackupKeepCount</strong>. Default value: <strong>0</strong>. Valid values:</p>
     * <ul>
     * <li><strong>ByMonth</strong></li>
     * <li><strong>ByWeek</strong></li>
     * <li><strong>KeepAll</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ByMonth</p>
     */
    @NameInMap("ArchiveBackupKeepPolicy")
    public String archiveBackupKeepPolicy;

    /**
     * <p>The number of days for which the archived backup is retained. The default value <strong>0</strong> specifies that the backup archiving feature is disabled. Valid values: <strong>30</strong> to <strong>1095</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("ArchiveBackupRetentionPeriod")
    public String archiveBackupRetentionPeriod;

    /**
     * <p>The frequency at which you want to perform a snapshot backup on the instance. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: No backup frequencies are specified.</li>
     * <li><strong>30</strong>: A snapshot backup is performed every 30 minutes.</li>
     * <li><strong>60</strong>: A snapshot backup is performed every 60 minutes.</li>
     * <li><strong>120</strong>: A snapshot backup is performed every 120 minutes.</li>
     * <li><strong>240</strong>: A snapshot backup is performed every 240 minutes.</li>
     * <li><strong>480</strong>: A snapshot backup is performed every 480 minutes.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can configure a backup policy by using this parameter and the <strong>PreferredBackupPeriod</strong> parameter. For example, if you set <strong>PreferredBackupPeriod</strong> to Saturday,Sunday and BackupInterval to \<em>\</em>-1\<em>\</em>, a snapshot backup is performed on every Saturday and Sunday.</li>
     * <li>If the instance runs PostgreSQL, BackupInterval is supported only when the instance is equipped with cloud disks.</li>
     * <li>If the instance runs SQL Server, BackupInterval is supported only when the snapshot backup feature is enabled for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/211143.html">Enable snapshot backups for an ApsaraDB RDS for SQL Server instance</a>.</li>
     * <li>If <strong>Category</strong> is set to <strong>Flash</strong>, BackupInterval is invalid.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("BackupInterval")
    public String backupInterval;

    /**
     * <p>Specifies whether to enable the log backup feature. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: enables the feature.</li>
     * <li><strong>Disabled</strong>: disables the feature.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("BackupLog")
    public String backupLog;

    /**
     * <p>The backup method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Physical</strong>: physical backup</li>
     * <li><strong>Snapshot</strong>: snapshot backup</li>
     * </ul>
     * <p>Default value: <strong>Physical</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only on instances that run SQL Server with cloud disks.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Physical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The type of the backup. Valid values:</p>
     * <ul>
     * <li><strong>DataBackupPolicy</strong>: data backup</li>
     * <li><strong>LogBackupPolicy</strong>: log backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DataBackupPolicy</p>
     */
    @NameInMap("BackupPolicyMode")
    public String backupPolicyMode;

    /**
     * <p>Specifies whether the backup settings of a secondary instance are configured. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: secondary instance preferred</li>
     * <li><strong>2</strong>: primary instance preferred</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is suitable only for instances that run SQL Server on RDS Cluster Edition.</li>
     * <li>This parameter takes effect only when <strong>BackupMethod</strong> is set to <strong>Physical</strong>. If <strong>BackupMethod</strong> is set to <strong>Snapshot</strong>, backups are forcefully performed on the primary instance that runs SQL Server on RDS Cluster Edition.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BackupPriority")
    public Integer backupPriority;

    /**
     * <p>The number of days for which you want to retain data backup files. Valid values: <strong>7 to 730</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public String backupRetentionPeriod;

    /**
     * <p>Specifies whether to enable the single-digit second backup feature. Valid values:</p>
     * <ul>
     * <li><strong>Flash</strong>: enables the feature.</li>
     * <li><strong>Standard</strong>: disables the feature.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The format that is used to compress backup data. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Backups are not compressed.</li>
     * <li><strong>1</strong>: The zlib tool is used to compress backups into .tar.gz files.</li>
     * <li><strong>2</strong>: The zlib tool is used to compress backups in parallel.</li>
     * <li><strong>4</strong>: The QuickLZ tool is used to compress backups into .xb.gz files. This compression format is supported for instances that run MySQL 5.6 or MySQL 5.7. Backups in this compression format can be used to restore individual databases and tables. For more information, see <a href="https://help.aliyun.com/document_detail/103175.html">Restore individual databases and tables of an ApsaraDB RDS for MySQL instance</a>.</li>
     * <li><strong>8</strong>: The QuickLZ tool is used to compress backups into .xb.gz files. This compression format is supported only for instances that run MySQL 8.0. Backups in this compression format cannot be used to restore individual databases and tables.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CompressType")
    public String compressType;

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
     * <p>Specifies whether to enable the log backup feature. Valid values:</p>
     * <ul>
     * <li><strong>True</strong> or <strong>1</strong>: enables the log backup feature.</li>
     * <li><strong>False</strong> or <strong>0</strong>: enables the log backup feature.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You must specify this parameter when you set the <strong>BackupPolicyMode</strong> parameter to <strong>LogBackupPolicy</strong>.</li>
     * <li>This parameter takes effect only when you set the <strong>BackupPolicyMode</strong> parameter to <strong>LogBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableBackupLog")
    public String enableBackupLog;

    /**
     * <p>Specifies whether to enable incremental backup. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): disables the feature.</li>
     * <li><strong>true</strong>: enables the feature.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only on instances that run SQL Server with cloud disks.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableIncrementDataBackup")
    public Boolean enableIncrementDataBackup;

    /**
     * <p>Specifies whether to forcefully delete log backup files from the instance when the storage usage of the instance exceeds 80% or the amount of remaining storage on the instance is less than 5 GB. Valid values: <strong>Enable and Disable</strong>. You can retain the default value.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong>.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("HighSpaceUsageProtection")
    public String highSpaceUsageProtection;

    /**
     * <p>The number of hours for which you want to retain log backup files on the instance. Valid values: <strong>0 to 168</strong>. The value 0 specifies that log backup files are not retained on the instance. The value 168 is calculated based on the following formula: 7 × 24.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong>.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("LocalLogRetentionHours")
    public String localLogRetentionHours;

    /**
     * <p>The maximum storage usage that is allowed for log backup files on the instance. If the storage usage for log backup files on the instance exceeds the value of this parameter, the system deletes earlier log backup files until the storage usage falls below the value of this parameter. Valid values:<strong>0 to 50</strong>. You can retain the default value.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong>.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("LocalLogRetentionSpace")
    public String localLogRetentionSpace;

    /**
     * <p>The frequency at which you want to back up the logs of the instance. Valid values:</p>
     * <ul>
     * <li><strong>LogInterval</strong>: A log backup is performed every 30 minutes.</li>
     * <li>The default value is the same as the data backup frequency.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The value <strong>LogInterval</strong> is supported only for instances that run SQL Server.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LogInterval</p>
     */
    @NameInMap("LogBackupFrequency")
    public String logBackupFrequency;

    /**
     * <p>The number of binary log files that you want to retain on the instance. Default value: <strong>60</strong>. Valid values: <strong>6</strong> to <strong>100</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when you set the <strong>BackupPolicyMode</strong> parameter to <strong>LogBackupPolicy</strong>.</li>
     * <li>If the instance runs MySQL, you can set this parameter to <strong>-1</strong>. The value <strong>-1</strong> specifies that an unlimited number of binary log files can be retained on the instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("LogBackupLocalRetentionNumber")
    public Integer logBackupLocalRetentionNumber;

    /**
     * <p>The number of days for which the log backup is retained. Valid values: <strong>7 to 730</strong>. The log backup retention period cannot be longer than the data backup retention period.</p>
     * <blockquote>
     * <ul>
     * <li>If you enable the log backup feature, you can specify the log backup retention period. This parameter is supported for instances that run MySQL and PostgreSQL.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong> or <strong>LogBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public String logBackupRetentionPeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The backup cycle. Specify at least two days of the week and separate the days with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>Monday</strong></li>
     * <li><strong>Tuesday</strong></li>
     * <li><strong>Wednesday</strong></li>
     * <li><strong>Thursday</strong></li>
     * <li><strong>Friday</strong></li>
     * <li><strong>Saturday</strong></li>
     * <li><strong>Sunday</strong></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can configure a backup policy by using this parameter and the <strong>BackupInterval</strong> parameter. For example, if you set this parameter to Saturday,Sunday and the <strong>BackupInterval</strong> parameter to 30, a backup is performed every 30 minutes on every Saturday and Sunday.</li>
     * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time at which you want to perform a backup. Specify the time in the ISO 8601 standard in the <em>HH:mm</em>Z-<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>00:00Z-01:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The policy that is used to retain archived backup files if the instance is released. Default value: None. Valid values:</p>
     * <ul>
     * <li><strong>None</strong>: No archived backup files are retained.</li>
     * <li><strong>Lastest</strong>: Only the last archived backup file is retained.</li>
     * <li><strong>All</strong>: All archived backup files are retained.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ReleasedKeepPolicy")
    public String releasedKeepPolicy;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyRequest self = new ModifyBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyRequest setArchiveBackupKeepCount(Integer archiveBackupKeepCount) {
        this.archiveBackupKeepCount = archiveBackupKeepCount;
        return this;
    }
    public Integer getArchiveBackupKeepCount() {
        return this.archiveBackupKeepCount;
    }

    public ModifyBackupPolicyRequest setArchiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
        this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
        return this;
    }
    public String getArchiveBackupKeepPolicy() {
        return this.archiveBackupKeepPolicy;
    }

    public ModifyBackupPolicyRequest setArchiveBackupRetentionPeriod(String archiveBackupRetentionPeriod) {
        this.archiveBackupRetentionPeriod = archiveBackupRetentionPeriod;
        return this;
    }
    public String getArchiveBackupRetentionPeriod() {
        return this.archiveBackupRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setBackupInterval(String backupInterval) {
        this.backupInterval = backupInterval;
        return this;
    }
    public String getBackupInterval() {
        return this.backupInterval;
    }

    public ModifyBackupPolicyRequest setBackupLog(String backupLog) {
        this.backupLog = backupLog;
        return this;
    }
    public String getBackupLog() {
        return this.backupLog;
    }

    public ModifyBackupPolicyRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public ModifyBackupPolicyRequest setBackupPolicyMode(String backupPolicyMode) {
        this.backupPolicyMode = backupPolicyMode;
        return this;
    }
    public String getBackupPolicyMode() {
        return this.backupPolicyMode;
    }

    public ModifyBackupPolicyRequest setBackupPriority(Integer backupPriority) {
        this.backupPriority = backupPriority;
        return this;
    }
    public Integer getBackupPriority() {
        return this.backupPriority;
    }

    public ModifyBackupPolicyRequest setBackupRetentionPeriod(String backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public String getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyBackupPolicyRequest setCompressType(String compressType) {
        this.compressType = compressType;
        return this;
    }
    public String getCompressType() {
        return this.compressType;
    }

    public ModifyBackupPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyBackupPolicyRequest setEnableBackupLog(String enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public ModifyBackupPolicyRequest setEnableIncrementDataBackup(Boolean enableIncrementDataBackup) {
        this.enableIncrementDataBackup = enableIncrementDataBackup;
        return this;
    }
    public Boolean getEnableIncrementDataBackup() {
        return this.enableIncrementDataBackup;
    }

    public ModifyBackupPolicyRequest setHighSpaceUsageProtection(String highSpaceUsageProtection) {
        this.highSpaceUsageProtection = highSpaceUsageProtection;
        return this;
    }
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    public ModifyBackupPolicyRequest setLocalLogRetentionHours(String localLogRetentionHours) {
        this.localLogRetentionHours = localLogRetentionHours;
        return this;
    }
    public String getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    public ModifyBackupPolicyRequest setLocalLogRetentionSpace(String localLogRetentionSpace) {
        this.localLogRetentionSpace = localLogRetentionSpace;
        return this;
    }
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    public ModifyBackupPolicyRequest setLogBackupFrequency(String logBackupFrequency) {
        this.logBackupFrequency = logBackupFrequency;
        return this;
    }
    public String getLogBackupFrequency() {
        return this.logBackupFrequency;
    }

    public ModifyBackupPolicyRequest setLogBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
        this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
        return this;
    }
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
    }

    public ModifyBackupPolicyRequest setLogBackupRetentionPeriod(String logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyBackupPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyBackupPolicyRequest setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public ModifyBackupPolicyRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public ModifyBackupPolicyRequest setReleasedKeepPolicy(String releasedKeepPolicy) {
        this.releasedKeepPolicy = releasedKeepPolicy;
        return this;
    }
    public String getReleasedKeepPolicy() {
        return this.releasedKeepPolicy;
    }

    public ModifyBackupPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyBackupPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

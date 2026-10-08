// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    @NameInMap("AdvancedDataPolicies")
    public java.util.List<ModifyBackupPolicyRequestAdvancedDataPolicies> advancedDataPolicies;

    @NameInMap("AdvancedLogPolicies")
    public java.util.List<ModifyBackupPolicyRequestAdvancedLogPolicies> advancedLogPolicies;

    /**
     * <p>The number of archived backups to retain. The default value is <strong>1</strong>. Valid values:</p>
     * <ul>
     * <li>When <strong>ArchiveBackupKeepPolicy</strong> is set to <strong>ByMonth</strong>, valid values are <strong>1 to 31</strong>.</li>
     * <li>When <strong>ArchiveBackupKeepPolicy</strong> is set to <strong>ByWeek</strong>, valid values are <strong>1 to 7</strong>.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>When <strong>ArchiveBackupKeepPolicy</strong> is set to <strong>KeepAll</strong>, this parameter does not need to be specified.</li>
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
     * <p>The retention cycle of archived backups. The number of backups retained within this cycle is determined by <strong>ArchiveBackupKeepCount</strong>. The default value is <strong>0</strong>. Valid values:</p>
     * <ul>
     * <li><strong>ByMonth</strong>: monthly</li>
     * <li><strong>ByWeek</strong>: weekly</li>
     * <li><strong>KeepAll</strong>: all retained</li>
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
     * <p>The number of days for which archived backups are retained. The default value is <strong>0</strong>, which indicates that archived backup is not enabled. Valid values: <strong>30 to 1095</strong>.</p>
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
     * <p>The snapshot backup frequency. Valid values:</p>
     * <ul>
     * <li><strong>15</strong>: 15 minutes.</li>
     * <li><strong>30</strong>: 30 minutes.</li>
     * <li><strong>60</strong>: 60 minutes.</li>
     * <li><strong>120</strong>: 120 minutes.</li>
     * <li><strong>180</strong>: 180 minutes.</li>
     * <li><strong>240</strong>: 240 minutes.</li>
     * <li><strong>360</strong>: 360 minutes.</li>
     * <li><strong>480</strong>: 480 minutes.</li>
     * <li><strong>720</strong>: 720 minutes.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter works together with the <strong>PreferredBackupPeriod</strong> parameter to determine the backup policy.</li>
     * <li>MySQL instances must be cloud disk instances running MySQL 5.7 or 8.0 in the <strong>high-availability series or Cluster Edition</strong>.</li>
     * <li>PostgreSQL instances must be cloud disk instances.</li>
     * <li>SQL Server instances must have <a href="https://help.aliyun.com/document_detail/211143.html"><strong>snapshot backup</strong></a> <strong>enabled</strong>.</li>
     * <li>This parameter is invalid when <strong>Category</strong> is set to <strong>Flash</strong>.</li>
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
     * <p>Specifies whether to enable log backup. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: Enable.</li>
     * <li><strong>Disabled</strong>: Disable.</li>
     * </ul>
     * <p><strong>For SQL Server instances</strong>, log backup is enabled by default and cannot be disabled. However, you can modify the log backup frequency as follows:</p>
     * <ul>
     * <li>Log backup frequency of <strong>every 5 minutes</strong>: Set BackupLog to Enable and leave LogBackupFrequency empty. For more information, see <a href="https://help.aliyun.com/document_detail/2861729.html">5-minute log backup</a>. <strong>This configuration is not supported when backup on the secondary instance is preferred (BackupPriority is set to 1). Otherwise, an error is returned.</strong></li>
     * <li>Log backup frequency of <strong>every 30 minutes</strong>: Leave BackupLog empty and set LogBackupFrequency to LogInterval.</li>
     * <li>Log backup frequency <strong>consistent with data backup</strong>: Leave both BackupLog and LogBackupFrequency empty.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong> and is used to enable or disable log backup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("BackupLog")
    public String backupLog;

    /**
     * <p>The backup method for <strong>SQL Server instances with cloud disks</strong>. Valid values:</p>
     * <ul>
     * <li><strong>Physical</strong> (default): physical backup.</li>
     * <li><strong>Snapshot</strong>: snapshot backup.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Physical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The type of the backup policy. Valid values:</p>
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
     * <p>The <a href="https://help.aliyun.com/document_detail/95717.html">backup on secondary instance</a> setting for <strong>SQL Server Cluster Edition</strong> instances. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: secondary instance preferred.</li>
     * <li><strong>2</strong>: primary instance forced.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when <strong>BackupMethod</strong> is set to <strong>Physical</strong>. If <strong>BackupMethod</strong> is set to <strong>Snapshot</strong>, SQL Server Cluster Edition instances are forced to perform backups on the primary instance.</li>
     * <li>After you set <strong>secondary instance preferred</strong> (BackupPriority to 1), the <strong>5-minute log backup</strong> policy (BackupLog set to Enable and LogBackupFrequency left empty) is <strong>not supported</strong>. Otherwise, an error is returned. Set the log backup frequency to every 30 minutes or consistent with data backup.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BackupPriority")
    public Integer backupPriority;

    /**
     * <p>The number of days for which data backups are retained. Valid values: <strong>7 to 730</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
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
     * <p>Specifies whether to enable backup within seconds. Valid values:</p>
     * <ul>
     * <li><strong>Flash</strong>: Enable.</li>
     * <li><strong>Standard</strong>: Disable.</li>
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
     * <p>The backup compression method. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: not compressed.</li>
     * <li><strong>1</strong>: zlib compression. The format is tar.gz.</li>
     * <li><strong>2</strong>: parallel zlib compression.</li>
     * <li><strong>4</strong>: quicklz compression. The format is xb.gz. This method is applicable only to MySQL 5.6 and 5.7 and can be used for <a href="https://help.aliyun.com/document_detail/103175.html">individual database and table restoration</a>.</li>
     * <li><strong>8</strong>: quicklz compression. The format is xb.gz. This method is applicable only to MySQL 8.0. Individual database and table restoration is not supported.</li>
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
     * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("EnableAdvancedBackupPolicy")
    public Integer enableAdvancedBackupPolicy;

    /**
     * <p>Specifies whether to enable instance log backup for <strong>MySQL</strong>, <strong>PostgreSQL</strong>, and <strong>MariaDB</strong> instances. Valid values:</p>
     * <ul>
     * <li><strong>True</strong> or <strong>1</strong>: Enable.</li>
     * <li><strong>False</strong> or <strong>0</strong>: Disable.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Instance log backup for <strong>SQL Server</strong> instances is enabled by default and cannot be disabled. You do not need to configure this parameter for SQL Server instances.</li>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong> and is used to enable or disable instance log backup.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableBackupLog")
    public String enableBackupLog;

    /**
     * <p>Specifies whether to enable incremental backup for <strong>SQL Server instances with cloud disks or MySQL instances with local disks</strong>. Valid values:</p>
     * <ul>
     * <li><strong>False</strong> (default): Disable.</li>
     * <li><strong>True</strong>: Enable.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("EnableIncrementDataBackup")
    public Boolean enableIncrementDataBackup;

    /**
     * <p>Specifies whether to enable point-in-time recovery for <strong>MySQL</strong> instances. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: Enable.</li>
     * <li><strong>False</strong>: Disable.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong> and <strong>BackupLog</strong> is set to <strong>Enable</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/2666046.html">Configure a point-in-time recovery policy</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnablePitrProtection")
    public Boolean enablePitrProtection;

    /**
     * <p>Specifies whether to unconditionally clean up binary logs when the storage usage of a <strong>MySQL</strong> instance exceeds 80% or the remaining storage is less than 5 GB. Valid values: <strong>Enable | Disable</strong>. The default value is not modified.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong> and is required in this case.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("HighSpaceUsageProtection")
    public String highSpaceUsageProtection;

    /**
     * <p>The high-frequency incremental backup frequency for <strong>MySQL instances with local disks</strong>. Valid values:</p>
     * <ul>
     * <li><strong>60</strong>: 60 minutes.</li>
     * <li><strong>120</strong>: 120 minutes.</li>
     * <li><strong>240</strong>: 240 minutes.</li>
     * <li><strong>360</strong>: 360 minutes.</li>
     * <li><strong>720</strong>: 720 minutes.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>EnableIncrementDataBackup</strong> is set to <strong>True</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("IncBackupInterval")
    public Integer incBackupInterval;

    /**
     * <p>The number of hours for which instance log backups are retained on the local storage of a <strong>MySQL</strong> instance. Valid values: <strong>0 to 168</strong> (7 × 24). A value of 0 indicates that instance logs are not retained locally.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong> and is required in this case.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("LocalLogRetentionHours")
    public String localLogRetentionHours;

    /**
     * <p>The maximum usage of the local log storage space for a <strong>MySQL</strong> instance. If the usage exceeds this value, the system starts to clean up binary logs from the earliest one until the usage drops below this threshold. Valid values: <strong>0 to 50</strong>. The default value is not modified.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong> and is required in this case.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("LocalLogRetentionSpace")
    public String localLogRetentionSpace;

    /**
     * <p>The log backup frequency for <strong>SQL Server</strong> instances. Valid values:</p>
     * <ul>
     * <li><strong>LogInterval</strong>: every <strong>30 minutes</strong>.</li>
     * <li><strong>Empty</strong> (no value required): every <strong>5 minutes</strong> or <strong>consistent with data backup</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LogInterval</p>
     */
    @NameInMap("LogBackupFrequency")
    public String logBackupFrequency;

    /**
     * <p>The number of binary logs retained locally. The default value is <strong>60</strong>. Valid values: <strong>6 to 100</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong>.</li>
     * <li>For MySQL instances, you can set this parameter to -1, which indicates that the number of locally retained binary logs is not limited.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("LogBackupLocalRetentionNumber")
    public Integer logBackupLocalRetentionNumber;

    /**
     * <p>The number of days for which log backups are retained. Valid values: <strong>7 to 730</strong>. The value cannot be greater than the number of days for which data backups are retained.</p>
     * <blockquote>
     * <ul>
     * <li>When log backup is enabled, you can set the retention period of log backup files. Currently, only MySQL and PostgreSQL instances support this setting.</li>
     * <li>This parameter applies when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong> or <strong>LogBackupPolicy</strong>.</li>
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
     * <p>The backup cycle. Specify at least two days. Separate multiple values with commas (,). Valid values:</p>
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
     * <li>This parameter works together with the <strong>BackupInterval</strong> parameter to determine the backup policy. For example, if you set this parameter to Saturday and Sunday and set <strong>BackupInterval</strong> to 30 minutes, a backup is performed every 30 minutes on Saturday and Sunday each week.</li>
     * <li>This parameter is required when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
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
     * <p>The time at which to perform a backup task. Format: <i>HH:mm</i>Z-<i>HH:mm</i>Z (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
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
     * <p>The archived backup data retention policy for deleted <strong>MySQL</strong> instances. Valid values:</p>
     * <ul>
     * <li><strong>None</strong>: not retained.</li>
     * <li><strong>Lastest</strong>: the last backup is retained.</li>
     * <li><strong>All</strong>: all backups are retained.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
     * <li>For ApsaraDB RDS for MySQL cloud disk instances purchased on or after February 1, 2024, the default value of ReleasedKeepPolicy is <strong>Lastest</strong>. For instances with Premium Local SSDs, the default value is <strong>None</strong>. For more information about this feature, see <a href="https://help.aliyun.com/document_detail/2836955.html">Backups of deleted instances</a>.</li>
     * </ul>
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

    public ModifyBackupPolicyRequest setAdvancedDataPolicies(java.util.List<ModifyBackupPolicyRequestAdvancedDataPolicies> advancedDataPolicies) {
        this.advancedDataPolicies = advancedDataPolicies;
        return this;
    }
    public java.util.List<ModifyBackupPolicyRequestAdvancedDataPolicies> getAdvancedDataPolicies() {
        return this.advancedDataPolicies;
    }

    public ModifyBackupPolicyRequest setAdvancedLogPolicies(java.util.List<ModifyBackupPolicyRequestAdvancedLogPolicies> advancedLogPolicies) {
        this.advancedLogPolicies = advancedLogPolicies;
        return this;
    }
    public java.util.List<ModifyBackupPolicyRequestAdvancedLogPolicies> getAdvancedLogPolicies() {
        return this.advancedLogPolicies;
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

    public ModifyBackupPolicyRequest setEnableAdvancedBackupPolicy(Integer enableAdvancedBackupPolicy) {
        this.enableAdvancedBackupPolicy = enableAdvancedBackupPolicy;
        return this;
    }
    public Integer getEnableAdvancedBackupPolicy() {
        return this.enableAdvancedBackupPolicy;
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

    public ModifyBackupPolicyRequest setEnablePitrProtection(Boolean enablePitrProtection) {
        this.enablePitrProtection = enablePitrProtection;
        return this;
    }
    public Boolean getEnablePitrProtection() {
        return this.enablePitrProtection;
    }

    public ModifyBackupPolicyRequest setHighSpaceUsageProtection(String highSpaceUsageProtection) {
        this.highSpaceUsageProtection = highSpaceUsageProtection;
        return this;
    }
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    public ModifyBackupPolicyRequest setIncBackupInterval(Integer incBackupInterval) {
        this.incBackupInterval = incBackupInterval;
        return this;
    }
    public Integer getIncBackupInterval() {
        return this.incBackupInterval;
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

    public static class ModifyBackupPolicyRequestAdvancedDataPolicies extends TeaModel {
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("BakType")
        public String bakType;

        @NameInMap("DestRegion")
        public String destRegion;

        @NameInMap("DestType")
        public String destType;

        @NameInMap("FilterKey")
        public String filterKey;

        @NameInMap("FilterType")
        public String filterType;

        @NameInMap("FilterValue")
        public String filterValue;

        @NameInMap("OnlyPreserveOneEachDay")
        public Boolean onlyPreserveOneEachDay;

        @NameInMap("OnlyPreserveOneEachHour")
        public Boolean onlyPreserveOneEachHour;

        @NameInMap("RetentionType")
        public String retentionType;

        @NameInMap("RetentionValue")
        public Integer retentionValue;

        @NameInMap("SrcRegion")
        public String srcRegion;

        @NameInMap("SrcType")
        public String srcType;

        @NameInMap("StrategyId")
        public String strategyId;

        public static ModifyBackupPolicyRequestAdvancedDataPolicies build(java.util.Map<String, ?> map) throws Exception {
            ModifyBackupPolicyRequestAdvancedDataPolicies self = new ModifyBackupPolicyRequestAdvancedDataPolicies();
            return TeaModel.build(map, self);
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setBakType(String bakType) {
            this.bakType = bakType;
            return this;
        }
        public String getBakType() {
            return this.bakType;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setOnlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
            this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
            return this;
        }
        public Boolean getOnlyPreserveOneEachDay() {
            return this.onlyPreserveOneEachDay;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setOnlyPreserveOneEachHour(Boolean onlyPreserveOneEachHour) {
            this.onlyPreserveOneEachHour = onlyPreserveOneEachHour;
            return this;
        }
        public Boolean getOnlyPreserveOneEachHour() {
            return this.onlyPreserveOneEachHour;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setRetentionValue(Integer retentionValue) {
            this.retentionValue = retentionValue;
            return this;
        }
        public Integer getRetentionValue() {
            return this.retentionValue;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

    }

    public static class ModifyBackupPolicyRequestAdvancedLogPolicies extends TeaModel {
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("DestRegion")
        public String destRegion;

        @NameInMap("DestType")
        public String destType;

        @NameInMap("EnableLogBackup")
        public Integer enableLogBackup;

        @NameInMap("FilterKey")
        public String filterKey;

        @NameInMap("FilterValue")
        public String filterValue;

        @NameInMap("LogRetentionType")
        public String logRetentionType;

        @NameInMap("LogRetentionValue")
        public Integer logRetentionValue;

        @NameInMap("SrcRegion")
        public String srcRegion;

        @NameInMap("SrcType")
        public String srcType;

        @NameInMap("StrategyId")
        public String strategyId;

        public static ModifyBackupPolicyRequestAdvancedLogPolicies build(java.util.Map<String, ?> map) throws Exception {
            ModifyBackupPolicyRequestAdvancedLogPolicies self = new ModifyBackupPolicyRequestAdvancedLogPolicies();
            return TeaModel.build(map, self);
        }

        public ModifyBackupPolicyRequestAdvancedLogPolicies setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ModifyBackupPolicyRequestAdvancedLogPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public ModifyBackupPolicyRequestAdvancedLogPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public ModifyBackupPolicyRequestAdvancedLogPolicies setEnableLogBackup(Integer enableLogBackup) {
            this.enableLogBackup = enableLogBackup;
            return this;
        }
        public Integer getEnableLogBackup() {
            return this.enableLogBackup;
        }

        public ModifyBackupPolicyRequestAdvancedLogPolicies setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public ModifyBackupPolicyRequestAdvancedLogPolicies setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public ModifyBackupPolicyRequestAdvancedLogPolicies setLogRetentionType(String logRetentionType) {
            this.logRetentionType = logRetentionType;
            return this;
        }
        public String getLogRetentionType() {
            return this.logRetentionType;
        }

        public ModifyBackupPolicyRequestAdvancedLogPolicies setLogRetentionValue(Integer logRetentionValue) {
            this.logRetentionValue = logRetentionValue;
            return this;
        }
        public Integer getLogRetentionValue() {
            return this.logRetentionValue;
        }

        public ModifyBackupPolicyRequestAdvancedLogPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public ModifyBackupPolicyRequestAdvancedLogPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

        public ModifyBackupPolicyRequestAdvancedLogPolicies setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

    }

}

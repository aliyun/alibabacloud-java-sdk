// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The number of archived backup files that are retained. Default value: **1**. Valid values:</p>
     * <br>
     * <p>*   Valid values when **ArchiveBackupKeepPolicy** is set to **ByMonth**: **1** to **31**.</p>
     * <p>*   Valid values when **ArchiveBackupKeepPolicy** is set to **ByWeek**: **1** to **7**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You do not need to specify this parameter when **ArchiveBackupKeepPolicy** is set to **KeepAll**.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("ArchiveBackupKeepCount")
    public Integer archiveBackupKeepCount;

    /**
     * <p>The retention period of archived backup files. The number of archived backup files that can be retained within the specified retention period is specified by **ArchiveBackupKeepCount**. Default value: **0**. Valid values:</p>
     * <br>
     * <p>*   **ByMonth**</p>
     * <p>*   **ByWeek**</p>
     * <p>*   **KeepAll**</p>
     * <br>
     * <p>> This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("ArchiveBackupKeepPolicy")
    public String archiveBackupKeepPolicy;

    /**
     * <p>The number of days for which the archived backup is retained. The default value **0** specifies that the backup archiving feature is disabled. Valid values: **30** to **1095**.</p>
     * <br>
     * <p>> This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("ArchiveBackupRetentionPeriod")
    public String archiveBackupRetentionPeriod;

    /**
     * <p>The frequency at which you want to perform a snapshot backup on the instance. Valid values:</p>
     * <br>
     * <p>*   **-1**: No backup frequencies are specified.</p>
     * <p>*   **30**: A snapshot backup is performed every 30 minutes.</p>
     * <p>*   **60**: A snapshot backup is performed every 60 minutes.</p>
     * <p>*   **120**: A snapshot backup is performed every 120 minutes.</p>
     * <p>*   **240**: A snapshot backup is performed every 240 minutes.</p>
     * <p>*   **480**: A snapshot backup is performed every 480 minutes.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You can configure a backup policy by using this parameter and the **PreferredBackupPeriod** parameter. For example, if you set **PreferredBackupPeriod** to Saturday,Sunday and BackupInterval to \*\*-1\*\*, a snapshot backup is performed on every Saturday and Sunday.</p>
     * <br>
     * <p>*   If the instance runs PostgreSQL, BackupInterval is supported only when the instance is equipped with cloud disks.</p>
     * <br>
     * <p>*   If the instance runs SQL Server, BackupInterval is supported only when the snapshot backup feature is enabled for the instance. For more information, see [Enable snapshot backups for an ApsaraDB RDS for SQL Server instance](~~211143~~).</p>
     * <br>
     * <p>*   If **Category** is set to **Flash**, BackupInterval is invalid.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("BackupInterval")
    public String backupInterval;

    /**
     * <p>Specifies whether to enable the log backup feature. Valid values:</p>
     * <br>
     * <p>*   **Enable**: enables the feature.</p>
     * <p>*   **Disabled**: disables the feature.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("BackupLog")
    public String backupLog;

    /**
     * <p>The backup method of the instance. Valid values:</p>
     * <br>
     * <p>*   **Physical**: physical backup</p>
     * <p>*   **Snapshot**: snapshot backup</p>
     * <br>
     * <p>Default value: **Physical**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter takes effect only on instances that run SQL Server with cloud disks.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The type of the backup. Valid values:</p>
     * <br>
     * <p>*   **DataBackupPolicy**: data backup</p>
     * <p>*   **LogBackupPolicy**: log backup</p>
     */
    @NameInMap("BackupPolicyMode")
    public String backupPolicyMode;

    @NameInMap("BackupPriority")
    public Integer backupPriority;

    /**
     * <p>The number of days for which you want to retain data backup files. Valid values: **7 to 730**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public String backupRetentionPeriod;

    /**
     * <p>Specifies whether to enable the single-digit second backup feature. Valid values:</p>
     * <br>
     * <p>*   **Flash**: enables the feature.</p>
     * <p>*   **Standard**: disables the feature.</p>
     * <br>
     * <p>> This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The format that is used to compress backup data. Valid values:</p>
     * <br>
     * <p>*   **0**: Backups are not compressed.</p>
     * <p>*   **1**: The zlib tool is used to compress backups into .tar.gz files.</p>
     * <p>*   **2**: The zlib tool is used to compress backups in parallel.</p>
     * <p>*   **4**: The QuickLZ tool is used to compress backups into .xb.gz files. This compression format is supported for instances that run MySQL 5.6 or MySQL 5.7. Backups in this compression format can be used to restore individual databases and tables. For more information, see [Restore individual databases and tables of an ApsaraDB RDS for MySQL instance](~~103175~~).</p>
     * <p>*   **8**: The QuickLZ tool is used to compress backups into .xb.gz files. This compression format is supported only for instances that run MySQL 8.0. Backups in this compression format cannot be used to restore individual databases and tables.</p>
     * <br>
     * <p>> This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("CompressType")
    public String compressType;

    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to enable the log backup feature. Valid values:</p>
     * <br>
     * <p>*   **True** or **1**: enables the feature.</p>
     * <p>*   **False** or **0**: disables the feature.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when **BackupPolicyMode** is set to **LogBackupPolicy**.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **LogBackupPolicy**.</p>
     */
    @NameInMap("EnableBackupLog")
    public String enableBackupLog;

    /**
     * <p>Specifies whether to enable the incremental backup feature. Valid values:</p>
     * <br>
     * <p>*   **false** (default): disables the feature.</p>
     * <p>*   **true**: enables the feature.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter takes effect only on instances that run SQL Server with cloud disks.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("EnableIncrementDataBackup")
    public Boolean enableIncrementDataBackup;

    /**
     * <p>Specifies whether to forcefully delete log backup files from the instance when the storage usage of the instance exceeds 80% or the amount of remaining storage on the instance is less than 5 GB. Valid values: **Enable and Disable**. You can retain the default value.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when **BackupPolicyMode** is set to **LogBackupPolicy**.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **LogBackupPolicy**.</p>
     */
    @NameInMap("HighSpaceUsageProtection")
    public String highSpaceUsageProtection;

    /**
     * <p>The number of hours for which you want to retain log backup files on the instance. Valid values: **0 to 168**. The value 0 specifies that log backup files are not retained on the instance. The value 168 is calculated based on the following formula: 7 × 24.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when **BackupPolicyMode** is set to **LogBackupPolicy**.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **LogBackupPolicy**.</p>
     */
    @NameInMap("LocalLogRetentionHours")
    public String localLogRetentionHours;

    /**
     * <p>The maximum storage usage that is allowed for log backup files on the instance. If the storage usage for log backup files on the instance exceeds the value of this parameter, the system deletes earlier log backup files until the storage usage falls below the value of this parameter. Valid values:**0 to 50**. You can retain the default value.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when **BackupPolicyMode** is set to **LogBackupPolicy**.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **LogBackupPolicy**.</p>
     */
    @NameInMap("LocalLogRetentionSpace")
    public String localLogRetentionSpace;

    /**
     * <p>The frequency at which you want to back up the logs of the instance. Valid values:</p>
     * <br>
     * <p>*   **LogInterval**: A log backup is performed every 30 minutes.</p>
     * <p>*   The default value is the same as the data backup frequency.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The value **LogInterval** is supported only for instances that run SQL Server.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("LogBackupFrequency")
    public String logBackupFrequency;

    /**
     * <p>The number of binary log files that you want to retain on the instance. Default value: **60**. Valid values: **6** to **100**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **LogBackupPolicy**.</p>
     * <br>
     * <p>*   If the instance runs MySQL, you can set this parameter to \*\*-1\*\*. The value -1 specifies that no limits are imposed on the number of binary log files retained on the instance.</p>
     */
    @NameInMap("LogBackupLocalRetentionNumber")
    public Integer logBackupLocalRetentionNumber;

    /**
     * <p>The number of days for which the log backup is retained. Valid values: **7 to 730**. The log backup retention period cannot be longer than the data backup retention period.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you enable the log backup feature, you can specify the log backup retention period. This parameter is supported for instances that run MySQL and PostgreSQL.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy** or **LogBackupPolicy**.</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public String logBackupRetentionPeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The backup cycle. Specify at least two days of the week and separate the days with commas (,). Valid values:</p>
     * <br>
     * <p>*   **Monday**</p>
     * <p>*   **Tuesday**</p>
     * <p>*   **Wednesday**</p>
     * <p>*   **Thursday**</p>
     * <p>*   **Friday**</p>
     * <p>*   **Saturday**</p>
     * <p>*   **Sunday**</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You can configure a backup policy by using this parameter and the **BackupInterval** parameter. For example, if you set this parameter to Saturday,Sunday and the **BackupInterval** parameter to 30, a backup is performed every 30 minutes on every Saturday and Sunday.</p>
     * <br>
     * <p>*   This parameter must be specified when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time at which you want to perform a backup. Specify the time in the ISO 8601 standard in the *HH:mm*Z-*HH:mm*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     * <br>
     * <p>*   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The policy that is used to retain archived backup files if the instance is released. Default value: None. Valid values:</p>
     * <br>
     * <p>*   **None**: No archived backup files are retained.</p>
     * <p>*   **Lastest**: Only the last archived backup file is retained.</p>
     * <p>*   **All**: All archived backup files are retained.</p>
     * <br>
     * <p>> This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.</p>
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

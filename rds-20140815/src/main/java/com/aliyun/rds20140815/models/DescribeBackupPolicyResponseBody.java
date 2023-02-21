// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The number of archived backup files that are retained.</p>
     */
    @NameInMap("ArchiveBackupKeepCount")
    public String archiveBackupKeepCount;

    /**
     * <p>The cycle based on which archived backup files are retained.</p>
     */
    @NameInMap("ArchiveBackupKeepPolicy")
    public String archiveBackupKeepPolicy;

    /**
     * <p>The number of days for which archived backup files are retained.</p>
     */
    @NameInMap("ArchiveBackupRetentionPeriod")
    public String archiveBackupRetentionPeriod;

    /**
     * <p>The backup interval. Unit: minutes.</p>
     * <br>
     * <p>*   If the instance runs MySQL, the interval is the same as the value of the Snapshot Backup Start Time parameter (not the Snapshot Backup Period parameter) in the ApsaraDB RDS console. For more information, see [Back up an ApsaraDB RDS for MySQL instance](~~98818~~).</p>
     * <p>*   If the instance runs SQL Server, the interval is the same as the log backup frequency.</p>
     */
    @NameInMap("BackupInterval")
    public String backupInterval;

    /**
     * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **Enable**</p>
     * <p>*   **Disabled**</p>
     */
    @NameInMap("BackupLog")
    public String backupLog;

    /**
     * <p>The backup method of the instance. Valid values:</p>
     * <br>
     * <p>*   **Physical**: physical backup</p>
     * <p>*   **Snapshot**: snapshot backup</p>
     * <br>
     * <p>>  This parameter is returned only when the instance runs SQL Server and uses standard SSDs or enhanced SSDs (ESSDs).</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The number of days for which data backup files are retained.</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    /**
     * <p>Indicates whether to enable the single-digit second backup feature. This feature allows ApsaraDB RDS to complete a backup within single-digit seconds. Valid values:</p>
     * <br>
     * <p>*   **Flash**: The single-digit second backup feature is enabled.</p>
     * <p>*   **Standard**: The single-digit second backup feature is disabled.</p>
     * <br>
     * <p>>  This parameter takes effect only when you set the **BackupPolicyMode** parameter to **DataBackupPolicy**.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The method that is used to compress backup data. Valid values:</p>
     * <br>
     * <p>*   **0**: Backup data is not compressed.</p>
     * <p>*   **1**: Backup data is compressed by using zlib.</p>
     * <p>*   **2**: Backup data is compressed by using zlib that invokes more than one thread in parallel for each backup.</p>
     * <p>*   **4**: Backup data is compressed by using QuickLZ and can be used to restore individual databases and tables.</p>
     * <p>*   **8**: Backup data is compressed by using QuickLZ but cannot be used to restore individual databases or tables. This value is available only when the instance runs MySQL 8.0.</p>
     */
    @NameInMap("CompressType")
    public String compressType;

    /**
     * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **1**: The log backup feature is enabled.</p>
     * <p>*   **0**: The log backup feature is disabled.</p>
     */
    @NameInMap("EnableBackupLog")
    public String enableBackupLog;

    /**
     * <p>Indicates whether incremental backup is enabled. Valid values:</p>
     * <br>
     * <p>*   **True**: Incremental backup is enabled.</p>
     * <p>*   **False**: Incremental backup is disabled.</p>
     */
    @NameInMap("EnableIncrementDataBackup")
    public Boolean enableIncrementDataBackup;

    /**
     * <p>Indicates whether the log backup deletion feature is enabled. If the disk usage exceeds 80% or the remaining disk space is less than 5 GB on the instance, this feature deletes binary log files. Valid values:</p>
     * <br>
     * <p>*   **Disable**</p>
     * <p>*   **Enable**</p>
     */
    @NameInMap("HighSpaceUsageProtection")
    public String highSpaceUsageProtection;

    /**
     * <p>The number of hours for which log backup files are retained on the instance.</p>
     */
    @NameInMap("LocalLogRetentionHours")
    public Integer localLogRetentionHours;

    /**
     * <p>The maximum disk usage that is allowed for log backup files on the instance.</p>
     */
    @NameInMap("LocalLogRetentionSpace")
    public String localLogRetentionSpace;

    /**
     * <p>The backup frequency of logs. Valid values:</p>
     * <br>
     * <p>*   **LogInterval**: Log backups are performed every 30 minutes.</p>
     * <p>*   Default value: same as the value of the **PreferredBackupPeriod** parameter.</p>
     * <br>
     * <p>>  The **LogBackupFrequency** parameter is returned only when the instance runs **SQL Server**.</p>
     */
    @NameInMap("LogBackupFrequency")
    public String logBackupFrequency;

    /**
     * <p>The number of binary log files that are retained on the instance.</p>
     */
    @NameInMap("LogBackupLocalRetentionNumber")
    public Integer logBackupLocalRetentionNumber;

    /**
     * <p>The number of days for which log backup files are retained.</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public Integer logBackupRetentionPeriod;

    /**
     * <p>The cycle based on which you want to perform a backup. Separate multiple values with commas (,). Valid values:</p>
     * <br>
     * <p>*   **Monday**</p>
     * <p>*   **Tuesday**</p>
     * <p>*   **Wednesday**</p>
     * <p>*   **Thursday**</p>
     * <p>*   **Friday**</p>
     * <p>*   **Saturday**</p>
     * <p>*   **Sunday**</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time when a data backup is performed. The time follows the ISO 8601 standard in the *HH:mm*Z-*HH:mm*Z format. The time is displayed in UTC.</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The time when the next backup is performed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.</p>
     */
    @NameInMap("PreferredNextBackupTime")
    public String preferredNextBackupTime;

    /**
     * <p>The policy that is used to retain archived backup files if the instance is released. Valid values:</p>
     * <br>
     * <p>*   **None**: No archived backup files are retained.</p>
     * <p>*   **Lastest**: Only the last archived backup file is retained.</p>
     * <p>*   **All**: All archived backup files are retained.</p>
     */
    @NameInMap("ReleasedKeepPolicy")
    public String releasedKeepPolicy;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("SupportReleasedKeep")
    public Integer supportReleasedKeep;

    /**
     * <p>Indicates whether the instance supports snapshot backups. Valid values:</p>
     * <br>
     * <p>*   **1**: The instance supports snapshot backups.</p>
     * <p>*   **0**: The instance does not support snapshot backups.</p>
     * <br>
     * <p>>  This parameter is returned only when the instance runs SQL Server.</p>
     */
    @NameInMap("SupportVolumeShadowCopy")
    public Integer supportVolumeShadowCopy;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setArchiveBackupKeepCount(String archiveBackupKeepCount) {
        this.archiveBackupKeepCount = archiveBackupKeepCount;
        return this;
    }
    public String getArchiveBackupKeepCount() {
        return this.archiveBackupKeepCount;
    }

    public DescribeBackupPolicyResponseBody setArchiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
        this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
        return this;
    }
    public String getArchiveBackupKeepPolicy() {
        return this.archiveBackupKeepPolicy;
    }

    public DescribeBackupPolicyResponseBody setArchiveBackupRetentionPeriod(String archiveBackupRetentionPeriod) {
        this.archiveBackupRetentionPeriod = archiveBackupRetentionPeriod;
        return this;
    }
    public String getArchiveBackupRetentionPeriod() {
        return this.archiveBackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setBackupInterval(String backupInterval) {
        this.backupInterval = backupInterval;
        return this;
    }
    public String getBackupInterval() {
        return this.backupInterval;
    }

    public DescribeBackupPolicyResponseBody setBackupLog(String backupLog) {
        this.backupLog = backupLog;
        return this;
    }
    public String getBackupLog() {
        return this.backupLog;
    }

    public DescribeBackupPolicyResponseBody setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public DescribeBackupPolicyResponseBody setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeBackupPolicyResponseBody setCompressType(String compressType) {
        this.compressType = compressType;
        return this;
    }
    public String getCompressType() {
        return this.compressType;
    }

    public DescribeBackupPolicyResponseBody setEnableBackupLog(String enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public DescribeBackupPolicyResponseBody setEnableIncrementDataBackup(Boolean enableIncrementDataBackup) {
        this.enableIncrementDataBackup = enableIncrementDataBackup;
        return this;
    }
    public Boolean getEnableIncrementDataBackup() {
        return this.enableIncrementDataBackup;
    }

    public DescribeBackupPolicyResponseBody setHighSpaceUsageProtection(String highSpaceUsageProtection) {
        this.highSpaceUsageProtection = highSpaceUsageProtection;
        return this;
    }
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    public DescribeBackupPolicyResponseBody setLocalLogRetentionHours(Integer localLogRetentionHours) {
        this.localLogRetentionHours = localLogRetentionHours;
        return this;
    }
    public Integer getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    public DescribeBackupPolicyResponseBody setLocalLogRetentionSpace(String localLogRetentionSpace) {
        this.localLogRetentionSpace = localLogRetentionSpace;
        return this;
    }
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    public DescribeBackupPolicyResponseBody setLogBackupFrequency(String logBackupFrequency) {
        this.logBackupFrequency = logBackupFrequency;
        return this;
    }
    public String getLogBackupFrequency() {
        return this.logBackupFrequency;
    }

    public DescribeBackupPolicyResponseBody setLogBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
        this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
        return this;
    }
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
    }

    public DescribeBackupPolicyResponseBody setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public DescribeBackupPolicyResponseBody setPreferredNextBackupTime(String preferredNextBackupTime) {
        this.preferredNextBackupTime = preferredNextBackupTime;
        return this;
    }
    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
    }

    public DescribeBackupPolicyResponseBody setReleasedKeepPolicy(String releasedKeepPolicy) {
        this.releasedKeepPolicy = releasedKeepPolicy;
        return this;
    }
    public String getReleasedKeepPolicy() {
        return this.releasedKeepPolicy;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody setSupportReleasedKeep(Integer supportReleasedKeep) {
        this.supportReleasedKeep = supportReleasedKeep;
        return this;
    }
    public Integer getSupportReleasedKeep() {
        return this.supportReleasedKeep;
    }

    public DescribeBackupPolicyResponseBody setSupportVolumeShadowCopy(Integer supportVolumeShadowCopy) {
        this.supportVolumeShadowCopy = supportVolumeShadowCopy;
        return this;
    }
    public Integer getSupportVolumeShadowCopy() {
        return this.supportVolumeShadowCopy;
    }

}

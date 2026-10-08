// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("AdvancedBackupPolicyEnabled")
    public Boolean advancedBackupPolicyEnabled;

    @NameInMap("AdvancedDataPolicies")
    public DescribeBackupPolicyResponseBodyAdvancedDataPolicies advancedDataPolicies;

    @NameInMap("AdvancedLogPolicies")
    public DescribeBackupPolicyResponseBodyAdvancedLogPolicies advancedLogPolicies;

    /**
     * <p>The number of archived backups retained for the <strong>MySQL</strong> instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ArchiveBackupKeepCount")
    public String archiveBackupKeepCount;

    /**
     * <p>The retention cycle of archived backups for the <strong>MySQL</strong> instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ByMonth</p>
     */
    @NameInMap("ArchiveBackupKeepPolicy")
    public String archiveBackupKeepPolicy;

    /**
     * <p>The number of days for which archived backups are retained for the <strong>MySQL</strong> instance.</p>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("ArchiveBackupRetentionPeriod")
    public String archiveBackupRetentionPeriod;

    /**
     * <p>The backup interval. Unit: minutes.</p>
     * <ul>
     * <li>For MySQL instances: the <a href="https://help.aliyun.com/document_detail/98818.html">snapshot backup frequency</a> (not the snapshot backup cycle).</li>
     * <li>For SQL Server instances: the log backup frequency.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("BackupInterval")
    public String backupInterval;

    /**
     * <p>Indicates whether log backup is enabled. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: enabled</li>
     * <li><strong>Disabled</strong>: disabled</li>
     * </ul>
     * <p><strong>For SQL Server instances:</strong></p>
     * <ul>
     * <li><strong>Enable</strong> is returned only when instance log backup frequency is <strong>every 5 minutes</strong>.</li>
     * <li>When instance log backup frequency is <strong>every 30 minutes</strong> or <strong>consistent with the data backup cycle</strong>, this parameter returns <strong>Disabled</strong>. <strong>Use the value of BackupInterval as the reference</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("BackupLog")
    public String backupLog;

    /**
     * <p>The backup method of the <strong>SQL Server instance with cloud disks</strong>. Valid values:</p>
     * <ul>
     * <li><strong>Physical</strong>: physical backup</li>
     * <li><strong>Snapshot</strong>: snapshot backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Physical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The backup settings for the secondary instance of an <strong>SQL Server Enterprise Cluster Edition</strong> instance. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: The secondary instance is preferred.</li>
     * <li><strong>2</strong>: The primary instance is forced.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only when SupportModifyBackupPriority is True.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BackupPriority")
    public Integer backupPriority;

    /**
     * <p>The number of days for which data backups are retained.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    /**
     * <p>Indicates whether backup within seconds is enabled for the <strong>MySQL</strong> or <strong>PostgreSQL</strong> instance. Valid values:</p>
     * <ul>
     * <li><strong>Flash</strong>: enabled</li>
     * <li><strong>Standard</strong>: disabled</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the <strong>BackupPolicyMode</strong> parameter is set to <strong>DataBackupPolicy</strong>.</p>
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
     * <li><strong>0</strong>: no compression</li>
     * <li><strong>1</strong>: zlib compression</li>
     * <li><strong>2</strong>: parallel zlib compression</li>
     * <li><strong>4</strong>: QuickLZ compression with fast restoration for individual databases and tables enabled</li>
     * <li><strong>8</strong>: QuickLZ compression without fast restoration for individual databases and tables supported</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CompressType")
    public String compressType;

    /**
     * <p>Indicates whether log backup is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
     * </ul>
     * <p><strong>For SQL Server instances:</strong></p>
     * <ul>
     * <li><strong>1</strong> is returned only when instance log backup frequency is <strong>every 5 minutes</strong>.</li>
     * <li>When instance log backup frequency is <strong>every 30 minutes</strong> or <strong>consistent with the data backup cycle</strong>, this parameter returns <strong>0</strong>. <strong>Use the value of BackupInterval as the reference</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableBackupLog")
    public String enableBackupLog;

    /**
     * <p>Indicates whether incremental backup is enabled for the <strong>SQL Server</strong> instance. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: enabled</li>
     * <li><strong>False</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableIncrementDataBackup")
    public Boolean enableIncrementDataBackup;

    /**
     * <p>Indicates whether point-in-time recovery (PITR) is enabled for the <strong>MySQL</strong> instance. PITR is an upgraded version of log backup. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: enabled</li>
     * <li><strong>False</strong>: disabled</li>
     * </ul>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2666046.html">Configure a point-in-time recovery policy</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnablePitrProtection")
    public Boolean enablePitrProtection;

    /**
     * <p>Indicates whether binary logs are forcibly deleted when the storage usage of the <strong>MySQL</strong> instance exceeds 80% or the remaining storage is less than 5 GB. Valid values:</p>
     * <ul>
     * <li><strong>Disable</strong>: Binary logs are not deleted.</li>
     * <li><strong>Enable</strong>: Binary logs are deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("HighSpaceUsageProtection")
    public String highSpaceUsageProtection;

    @NameInMap("IncBackupInterval")
    public Integer incBackupInterval;

    /**
     * <p>The number of hours for which binary logs are retained on the <strong>MySQL</strong> instance.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LocalLogRetentionHours")
    public Integer localLogRetentionHours;

    /**
     * <p>The maximum storage usage of binary logs on the <strong>MySQL</strong> instance, in percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("LocalLogRetentionSpace")
    public String localLogRetentionSpace;

    /**
     * <p>The log backup frequency of the <strong>SQL Server</strong> instance. Valid values:</p>
     * <ul>
     * <li><strong>LogInterval</strong>: every 30 minutes.</li>
     * <li>Default: consistent with the data backup cycle specified by <strong>PreferredBackupPeriod</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LogInterval</p>
     */
    @NameInMap("LogBackupFrequency")
    public String logBackupFrequency;

    /**
     * <p>The number of binary logs retained on the <strong>MySQL</strong> instance.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("LogBackupLocalRetentionNumber")
    public Integer logBackupLocalRetentionNumber;

    /**
     * <p>The number of days for which log backups are retained.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public Integer logBackupRetentionPeriod;

    /**
     * <p>The number of days for which point-in-time recovery is supported for the <strong>MySQL</strong> instance.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PitrRetentionPeriod")
    public Integer pitrRetentionPeriod;

    /**
     * <p>The data backup cycle. Multiple values are separated by commas (,). Valid values:</p>
     * <ul>
     * <li><strong>Monday</strong></li>
     * <li><strong>Tuesday</strong></li>
     * <li><strong>Wednesday</strong></li>
     * <li><strong>Thursday</strong></li>
     * <li><strong>Friday</strong></li>
     * <li><strong>Saturday</strong></li>
     * <li><strong>Sunday</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Monday,Wednesday,Friday,Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The data backup time. Format: <i>HH:mm</i>Z-<i>HH:mm</i>Z (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>15:00Z-16:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The next backup time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm</i>Z (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-19T15:15Z</p>
     */
    @NameInMap("PreferredNextBackupTime")
    public String preferredNextBackupTime;

    /**
     * <p>The archived backup data retention policy for deleted <strong>MySQL</strong> instances. Valid values:</p>
     * <ul>
     * <li><strong>None</strong>: No archived backups are retained.</li>
     * <li><strong>Lastest</strong>: Only the last archived backup is retained.</li>
     * <li><strong>All</strong>: All archived backups are retained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ReleasedKeepPolicy")
    public String releasedKeepPolicy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B87E2AB3-B7C9-4394-9160-7F639F732031</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the secondary instance backup option can be modified for the <strong>SQL Server</strong> instance. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: The option can be modified.</li>
     * <li><strong>False</strong>: The option cannot be modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("SupportModifyBackupPriority")
    public Boolean supportModifyBackupPriority;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SupportReleasedKeep")
    public Integer supportReleasedKeep;

    /**
     * <p>Indicates whether snapshot backup is supported for the <strong>SQL Server</strong> instance. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: supported</li>
     * <li><strong>0</strong>: not supported</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SupportVolumeShadowCopy")
    public Integer supportVolumeShadowCopy;

    /**
     * <p>Indicates whether the <a href="https://help.aliyun.com/document_detail/95717.html">5-minute log backup feature</a> is supported for the <strong>SQL Server</strong> instance. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: not supported</li>
     * <li><strong>1</strong>: supported</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SupportsHighFrequencyBackup")
    public Long supportsHighFrequencyBackup;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setAdvancedBackupPolicyEnabled(Boolean advancedBackupPolicyEnabled) {
        this.advancedBackupPolicyEnabled = advancedBackupPolicyEnabled;
        return this;
    }
    public Boolean getAdvancedBackupPolicyEnabled() {
        return this.advancedBackupPolicyEnabled;
    }

    public DescribeBackupPolicyResponseBody setAdvancedDataPolicies(DescribeBackupPolicyResponseBodyAdvancedDataPolicies advancedDataPolicies) {
        this.advancedDataPolicies = advancedDataPolicies;
        return this;
    }
    public DescribeBackupPolicyResponseBodyAdvancedDataPolicies getAdvancedDataPolicies() {
        return this.advancedDataPolicies;
    }

    public DescribeBackupPolicyResponseBody setAdvancedLogPolicies(DescribeBackupPolicyResponseBodyAdvancedLogPolicies advancedLogPolicies) {
        this.advancedLogPolicies = advancedLogPolicies;
        return this;
    }
    public DescribeBackupPolicyResponseBodyAdvancedLogPolicies getAdvancedLogPolicies() {
        return this.advancedLogPolicies;
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

    public DescribeBackupPolicyResponseBody setBackupPriority(Integer backupPriority) {
        this.backupPriority = backupPriority;
        return this;
    }
    public Integer getBackupPriority() {
        return this.backupPriority;
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

    public DescribeBackupPolicyResponseBody setEnablePitrProtection(Boolean enablePitrProtection) {
        this.enablePitrProtection = enablePitrProtection;
        return this;
    }
    public Boolean getEnablePitrProtection() {
        return this.enablePitrProtection;
    }

    public DescribeBackupPolicyResponseBody setHighSpaceUsageProtection(String highSpaceUsageProtection) {
        this.highSpaceUsageProtection = highSpaceUsageProtection;
        return this;
    }
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    public DescribeBackupPolicyResponseBody setIncBackupInterval(Integer incBackupInterval) {
        this.incBackupInterval = incBackupInterval;
        return this;
    }
    public Integer getIncBackupInterval() {
        return this.incBackupInterval;
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

    public DescribeBackupPolicyResponseBody setPitrRetentionPeriod(Integer pitrRetentionPeriod) {
        this.pitrRetentionPeriod = pitrRetentionPeriod;
        return this;
    }
    public Integer getPitrRetentionPeriod() {
        return this.pitrRetentionPeriod;
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

    public DescribeBackupPolicyResponseBody setSupportModifyBackupPriority(Boolean supportModifyBackupPriority) {
        this.supportModifyBackupPriority = supportModifyBackupPriority;
        return this;
    }
    public Boolean getSupportModifyBackupPriority() {
        return this.supportModifyBackupPriority;
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

    public DescribeBackupPolicyResponseBody setSupportsHighFrequencyBackup(Long supportsHighFrequencyBackup) {
        this.supportsHighFrequencyBackup = supportsHighFrequencyBackup;
        return this;
    }
    public Long getSupportsHighFrequencyBackup() {
        return this.supportsHighFrequencyBackup;
    }

    public static class DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy extends TeaModel {
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

        public static DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy self = new DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setBakType(String bakType) {
            this.bakType = bakType;
            return this;
        }
        public String getBakType() {
            return this.bakType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setOnlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
            this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
            return this;
        }
        public Boolean getOnlyPreserveOneEachDay() {
            return this.onlyPreserveOneEachDay;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setOnlyPreserveOneEachHour(Boolean onlyPreserveOneEachHour) {
            this.onlyPreserveOneEachHour = onlyPreserveOneEachHour;
            return this;
        }
        public Boolean getOnlyPreserveOneEachHour() {
            return this.onlyPreserveOneEachHour;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setRetentionValue(Integer retentionValue) {
            this.retentionValue = retentionValue;
            return this;
        }
        public Integer getRetentionValue() {
            return this.retentionValue;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

    }

    public static class DescribeBackupPolicyResponseBodyAdvancedDataPolicies extends TeaModel {
        @NameInMap("AdvancedDataPolicy")
        public java.util.List<DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy> advancedDataPolicy;

        public static DescribeBackupPolicyResponseBodyAdvancedDataPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyAdvancedDataPolicies self = new DescribeBackupPolicyResponseBodyAdvancedDataPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPolicies setAdvancedDataPolicy(java.util.List<DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy> advancedDataPolicy) {
            this.advancedDataPolicy = advancedDataPolicy;
            return this;
        }
        public java.util.List<DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy> getAdvancedDataPolicy() {
            return this.advancedDataPolicy;
        }

    }

    public static class DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy extends TeaModel {
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

        public static DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy self = new DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setEnableLogBackup(Integer enableLogBackup) {
            this.enableLogBackup = enableLogBackup;
            return this;
        }
        public Integer getEnableLogBackup() {
            return this.enableLogBackup;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setLogRetentionType(String logRetentionType) {
            this.logRetentionType = logRetentionType;
            return this;
        }
        public String getLogRetentionType() {
            return this.logRetentionType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setLogRetentionValue(Integer logRetentionValue) {
            this.logRetentionValue = logRetentionValue;
            return this;
        }
        public Integer getLogRetentionValue() {
            return this.logRetentionValue;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

    }

    public static class DescribeBackupPolicyResponseBodyAdvancedLogPolicies extends TeaModel {
        @NameInMap("AdvancedLogPolicy")
        public java.util.List<DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy> advancedLogPolicy;

        public static DescribeBackupPolicyResponseBodyAdvancedLogPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyAdvancedLogPolicies self = new DescribeBackupPolicyResponseBodyAdvancedLogPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPolicies setAdvancedLogPolicy(java.util.List<DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy> advancedLogPolicy) {
            this.advancedLogPolicy = advancedLogPolicy;
            return this;
        }
        public java.util.List<DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy> getAdvancedLogPolicy() {
            return this.advancedLogPolicy;
        }

    }

}

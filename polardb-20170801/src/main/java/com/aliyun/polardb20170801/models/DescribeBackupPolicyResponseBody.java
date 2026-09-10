// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("AdvancedDataPolicies")
    public DescribeBackupPolicyResponseBodyAdvancedDataPolicies advancedDataPolicies;

    /**
     * <p>The advanced backup policy option. Valid values:</p>
     * <ul>
     * <li><strong>enable</strong>: Advanced backup is enabled.</li>
     * <li><strong>disable</strong>: Advanced backup is not enabled but can be enabled.</li>
     * <li><strong>notSupport</strong>: Advanced backup is not supported.<blockquote>
     * <ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("AdvancedPolicyOption")
    public String advancedPolicyOption;

    /**
     * <p>The backup frequency. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong> (default): regular backup. A backup is performed once a day at a scheduled time.</li>
     * <li><strong>2/24H</strong>: enhanced backup. A backup is performed every 2 hours.</li>
     * <li><strong>3/24H</strong>: enhanced backup. A backup is performed every 3 hours.</li>
     * <li><strong>4/24H</strong>: enhanced backup. A backup is performed every 4 hours.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>After enhanced backup is enabled, all backups completed within 24 hours are retained. For backups older than 24 hours, only the first backup completed after 00:00 each day is retained, and all others are deleted.</li>
     * <li>After enhanced backup is enabled, the backup cycle parameter <strong>PreferredBackupPeriod</strong> is set to all days of the week by default (Monday through Sunday).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BackupFrequency")
    public String backupFrequency;

    /**
     * <p>The current backup policy level. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: regular backup</li>
     * <li><strong>Advanced</strong>: advanced backup<blockquote>
     * <ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BackupPolicyLevel")
    public String backupPolicyLevel;

    /**
     * <p>Specifies whether to retain backups when the cluster is deleted. Valid values:</p>
     * <ul>
     * <li><strong>ALL</strong>: All backups are retained with long-term retention (LTR).</li>
     * <li><strong>LATEST</strong>: The last backup is retained with long-term retention (LTR).</li>
     * <li><strong>NONE</strong> (default): No backups are retained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public String backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The backup frequency. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong> (default): regular backup. A backup is performed once a day at a scheduled time.</li>
     * <li><strong>2/24H</strong>: high-frequency backup. A backup is performed every 2 hours.</li>
     * <li><strong>3/24H</strong>: high-frequency backup. A backup is performed every 3 hours.</li>
     * <li><strong>4/24H</strong>: high-frequency backup. A backup is performed every 4 hours.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("DataLevel1BackupFrequency")
    public String dataLevel1BackupFrequency;

    /**
     * <p>The level-1 backup cycle. Valid values: </p>
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
     * <li><ul>
     * <li>At least two days must be selected. Separate multiple values with commas (,).</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday</p>
     */
    @NameInMap("DataLevel1BackupPeriod")
    public String dataLevel1BackupPeriod;

    /**
     * <p>The retention period of level-1 backups. Valid values: 3 to 14. Unit: days.</p>
     * <blockquote>
     * <p>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("DataLevel1BackupRetentionPeriod")
    public String dataLevel1BackupRetentionPeriod;

    /**
     * <p>The time period during which automatic backups are performed. The value is in the <code>hh:mmZ-hh:mmZ</code> format (UTC). The start and end times must be on the hour and exactly 1 hour apart. Example: <code>14:00Z-15:00Z</code>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
     * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15:00Z-16:00Z</p>
     */
    @NameInMap("DataLevel1BackupTime")
    public String dataLevel1BackupTime;

    /**
     * <p>The cross-region backup region for level-2 backups. For the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
     * <blockquote>
     * <p>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DataLevel2BackupAnotherRegionRegion")
    public String dataLevel2BackupAnotherRegionRegion;

    /**
     * <p>The retention epoch of cross-region backups for level-2 backups. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: The level-2 backup feature is shutdown.</p>
     * </li>
     * <li><p><strong>30 to 7300</strong>: The retention epoch of level-2 backups. Unit: days.</p>
     * </li>
     * <li><p><strong>-1</strong>: Level-2 backups are retained with long-term retention (LTR).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>When a cluster is created, the default value is <strong>0</strong>, which means the cross-region backup feature for level-2 backups is shutdown.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("DataLevel2BackupAnotherRegionRetentionPeriod")
    public String dataLevel2BackupAnotherRegionRetentionPeriod;

    /**
     * <p>The level-2 backup cycle. Valid values: </p>
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
     * <li><ul>
     * <li>At least two days must be selected. Separate multiple values with commas (,).</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday</p>
     */
    @NameInMap("DataLevel2BackupPeriod")
    public String dataLevel2BackupPeriod;

    /**
     * <p>The retention epoch of level-2 backups. Valid values:</p>
     * <ul>
     * <li>0: The level-2 backup feature is shutdown.</li>
     * <li>30 to 7300: The retention epoch of level-2 backups. Unit: days.</li>
     * <li>-1: Level-2 backups are retained with long-term retention (LTR).</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>When a cluster is created, the default value is <strong>0</strong>, which means the level-2 backup feature is shutdown.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DataLevel2BackupRetentionPeriod")
    public String dataLevel2BackupRetentionPeriod;

    /**
     * <p>Indicates whether immutable cross-region backup is enabled.</p>
     */
    @NameInMap("EnableCrossRegionImmutableBackup")
    public Boolean enableCrossRegionImmutableBackup;

    /**
     * <p>Indicates whether immutable backup is enabled.</p>
     */
    @NameInMap("EnableImmutableBackup")
    public Boolean enableImmutableBackup;

    /**
     * <p>The data backup cycle. Valid values:</p>
     * <ul>
     * <li>Monday</li>
     * <li>Tuesday</li>
     * <li>Wednesday</li>
     * <li>Thursday</li>
     * <li>Friday</li>
     * <li>Saturday</li>
     * <li>Sunday<blockquote>
     * <p>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time period during which automatic backups are performed. The value is in the <code>HH:mmZ-HH:mmZ</code> format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>07:00Z-08:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The time of the next backup. The value is in the <code>YYYY-MM-DDThh:mmZ</code> format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-16T07:30Z</p>
     */
    @NameInMap("PreferredNextBackupTime")
    public String preferredNextBackupTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EADFCE0F-9FB5-4685-B395-1440B******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setAdvancedDataPolicies(DescribeBackupPolicyResponseBodyAdvancedDataPolicies advancedDataPolicies) {
        this.advancedDataPolicies = advancedDataPolicies;
        return this;
    }
    public DescribeBackupPolicyResponseBodyAdvancedDataPolicies getAdvancedDataPolicies() {
        return this.advancedDataPolicies;
    }

    public DescribeBackupPolicyResponseBody setAdvancedPolicyOption(String advancedPolicyOption) {
        this.advancedPolicyOption = advancedPolicyOption;
        return this;
    }
    public String getAdvancedPolicyOption() {
        return this.advancedPolicyOption;
    }

    public DescribeBackupPolicyResponseBody setBackupFrequency(String backupFrequency) {
        this.backupFrequency = backupFrequency;
        return this;
    }
    public String getBackupFrequency() {
        return this.backupFrequency;
    }

    public DescribeBackupPolicyResponseBody setBackupPolicyLevel(String backupPolicyLevel) {
        this.backupPolicyLevel = backupPolicyLevel;
        return this;
    }
    public String getBackupPolicyLevel() {
        return this.backupPolicyLevel;
    }

    public DescribeBackupPolicyResponseBody setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public DescribeBackupPolicyResponseBody setDataLevel1BackupFrequency(String dataLevel1BackupFrequency) {
        this.dataLevel1BackupFrequency = dataLevel1BackupFrequency;
        return this;
    }
    public String getDataLevel1BackupFrequency() {
        return this.dataLevel1BackupFrequency;
    }

    public DescribeBackupPolicyResponseBody setDataLevel1BackupPeriod(String dataLevel1BackupPeriod) {
        this.dataLevel1BackupPeriod = dataLevel1BackupPeriod;
        return this;
    }
    public String getDataLevel1BackupPeriod() {
        return this.dataLevel1BackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setDataLevel1BackupRetentionPeriod(String dataLevel1BackupRetentionPeriod) {
        this.dataLevel1BackupRetentionPeriod = dataLevel1BackupRetentionPeriod;
        return this;
    }
    public String getDataLevel1BackupRetentionPeriod() {
        return this.dataLevel1BackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setDataLevel1BackupTime(String dataLevel1BackupTime) {
        this.dataLevel1BackupTime = dataLevel1BackupTime;
        return this;
    }
    public String getDataLevel1BackupTime() {
        return this.dataLevel1BackupTime;
    }

    public DescribeBackupPolicyResponseBody setDataLevel2BackupAnotherRegionRegion(String dataLevel2BackupAnotherRegionRegion) {
        this.dataLevel2BackupAnotherRegionRegion = dataLevel2BackupAnotherRegionRegion;
        return this;
    }
    public String getDataLevel2BackupAnotherRegionRegion() {
        return this.dataLevel2BackupAnotherRegionRegion;
    }

    public DescribeBackupPolicyResponseBody setDataLevel2BackupAnotherRegionRetentionPeriod(String dataLevel2BackupAnotherRegionRetentionPeriod) {
        this.dataLevel2BackupAnotherRegionRetentionPeriod = dataLevel2BackupAnotherRegionRetentionPeriod;
        return this;
    }
    public String getDataLevel2BackupAnotherRegionRetentionPeriod() {
        return this.dataLevel2BackupAnotherRegionRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setDataLevel2BackupPeriod(String dataLevel2BackupPeriod) {
        this.dataLevel2BackupPeriod = dataLevel2BackupPeriod;
        return this;
    }
    public String getDataLevel2BackupPeriod() {
        return this.dataLevel2BackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setDataLevel2BackupRetentionPeriod(String dataLevel2BackupRetentionPeriod) {
        this.dataLevel2BackupRetentionPeriod = dataLevel2BackupRetentionPeriod;
        return this;
    }
    public String getDataLevel2BackupRetentionPeriod() {
        return this.dataLevel2BackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setEnableCrossRegionImmutableBackup(Boolean enableCrossRegionImmutableBackup) {
        this.enableCrossRegionImmutableBackup = enableCrossRegionImmutableBackup;
        return this;
    }
    public Boolean getEnableCrossRegionImmutableBackup() {
        return this.enableCrossRegionImmutableBackup;
    }

    public DescribeBackupPolicyResponseBody setEnableImmutableBackup(Boolean enableImmutableBackup) {
        this.enableImmutableBackup = enableImmutableBackup;
        return this;
    }
    public Boolean getEnableImmutableBackup() {
        return this.enableImmutableBackup;
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

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy extends TeaModel {
        @NameInMap("AutoCreated")
        public Boolean autoCreated;

        @NameInMap("BakType")
        public String bakType;

        @NameInMap("DestRegion")
        public String destRegion;

        @NameInMap("DestType")
        public String destType;

        @NameInMap("DumpAction")
        public String dumpAction;

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

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("RetentionType")
        public String retentionType;

        @NameInMap("RetentionValue")
        public String retentionValue;

        @NameInMap("SrcRegion")
        public String srcRegion;

        @NameInMap("SrcType")
        public String srcType;

        @NameInMap("StorageClass")
        public String storageClass;

        public static DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy self = new DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setAutoCreated(Boolean autoCreated) {
            this.autoCreated = autoCreated;
            return this;
        }
        public Boolean getAutoCreated() {
            return this.autoCreated;
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

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setDumpAction(String dumpAction) {
            this.dumpAction = dumpAction;
            return this;
        }
        public String getDumpAction() {
            return this.dumpAction;
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

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setRetentionValue(String retentionValue) {
            this.retentionValue = retentionValue;
            return this;
        }
        public String getRetentionValue() {
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

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
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

}

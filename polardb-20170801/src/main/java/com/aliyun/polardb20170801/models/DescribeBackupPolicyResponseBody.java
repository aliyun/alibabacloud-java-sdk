// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("AdvancedDataPolicies")
    public DescribeBackupPolicyResponseBodyAdvancedDataPolicies advancedDataPolicies;

    /**
     * <p>The advanced backup policy option. Valid values:</p>
     * <ul>
     * <li><p><strong>enable</strong>: Advanced backup is enabled.</p>
     * </li>
     * <li><p><strong>disable</strong>: Advanced backup is disabled. You can enable it.</p>
     * </li>
     * <li><p><strong>notSupport</strong>: Advanced backup is not supported.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is not supported by PolarDB for PostgreSQL (compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("AdvancedPolicyOption")
    public String advancedPolicyOption;

    /**
     * <p>The backup frequency. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong> (Default): Standard backup. A backup is performed once a day.</p>
     * </li>
     * <li><p><strong>2/24H</strong>: Enhanced backup. A backup is performed every 2 hours.</p>
     * </li>
     * <li><p><strong>3/24H</strong>: Enhanced backup. A backup is performed every 3 hours.</p>
     * </li>
     * <li><p><strong>4/24H</strong>: Enhanced backup. A backup is performed every 4 hours.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If you enable enhanced backup, all backups that are completed within 24 hours are retained. For backups that are completed more than 24 hours ago, the system retains only the first backup that is completed after 00:00 every day. Other backups are deleted.</p>
     * </li>
     * <li><p>If you enable enhanced backup, the <strong>PreferredBackupPeriod</strong> parameter is automatically set to all days of the week (Monday to Sunday).</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BackupFrequency")
    public String backupFrequency;

    /**
     * <p>The level of the backup policy. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: standard backup</p>
     * </li>
     * <li><p><strong>Advanced</strong>: advanced backup</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is not supported by PolarDB for PostgreSQL (compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BackupPolicyLevel")
    public String backupPolicyLevel;

    /**
     * <p>The policy to retain backups when you delete a cluster:</p>
     * <ul>
     * <li><p><strong>ALL</strong>: Retains all backups permanently.</p>
     * </li>
     * <li><p><strong>LATEST</strong>: Retains the last backup permanently.</p>
     * </li>
     * <li><p><strong>NONE</strong> (Default): Does not retain backup sets.</p>
     * </li>
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
     * <li><p><strong>Normal</strong> (Default): Standard backup. A backup is performed once a day.</p>
     * </li>
     * <li><p><strong>2/24H</strong>: High-frequency backup. A backup is performed every 2 hours.</p>
     * </li>
     * <li><p><strong>3/24H</strong>: High-frequency backup. A backup is performed every 3 hours.</p>
     * </li>
     * <li><p><strong>4/24H</strong>: High-frequency backup. A backup is performed every 4 hours.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>This parameter is not supported by PolarDB for PostgreSQL (compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if the cross-region backup feature is unavailable in the region where your PolarDB for MySQL cluster resides. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not recommended if the advanced backup feature is enabled. Use the AdvancedDataPolicies parameter instead.</li>
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
     * <p>The cycle of a level-1 backup. Valid values:</p>
     * <ul>
     * <li><p><strong>Monday</strong></p>
     * </li>
     * <li><p><strong>Tuesday</strong></p>
     * </li>
     * <li><p><strong>Wednesday</strong></p>
     * </li>
     * <li><p><strong>Thursday</strong></p>
     * </li>
     * <li><p><strong>Friday</strong></p>
     * </li>
     * <li><p><strong>Saturday</strong></p>
     * </li>
     * <li><p><strong>Sunday</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>Select at least two days. Separate multiple values with commas (,).</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported by PolarDB for PostgreSQL (compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if the cross-region backup feature is unavailable in the region where your PolarDB for MySQL cluster resides. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not recommended if the advanced backup feature is enabled. Use the AdvancedDataPolicies parameter instead.</li>
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
     * <p>This parameter is not recommended if the advanced backup feature is enabled. Use the AdvancedDataPolicies parameter instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("DataLevel1BackupRetentionPeriod")
    public String dataLevel1BackupRetentionPeriod;

    /**
     * <p>The time range when an automatic backup is performed. The time is in the <code>hh:mmZ-hh:mmZ</code> format and is displayed in UTC. The specified time range must be a 1-hour interval on the hour, such as <code>14:00Z-15:00Z</code>.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is not supported by PolarDB for PostgreSQL (compatible with Oracle) and PolarDB for PostgreSQL.</p>
     * </li>
     * <li><p>This parameter is not supported if the cross-region backup feature is unavailable in the region where your PolarDB for MySQL cluster resides. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15:00Z-16:00Z</p>
     */
    @NameInMap("DataLevel1BackupTime")
    public String dataLevel1BackupTime;

    /**
     * <p>The destination region of the cross-region level-2 backup. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
     * <blockquote>
     * <p>This parameter is not recommended if the advanced backup feature is enabled. Use the AdvancedDataPolicies parameter instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DataLevel2BackupAnotherRegionRegion")
    public String dataLevel2BackupAnotherRegionRegion;

    /**
     * <p>The retention period of cross-region level-2 backups. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: The level-2 backup feature is disabled.</p>
     * </li>
     * <li><p><strong>30 to 7300</strong>: The retention period of level-2 backups in days.</p>
     * </li>
     * <li><p><strong>-1</strong>: The level-2 backups are permanently retained.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>When you create a cluster, the default value is <strong>0</strong>. This means the cross-region backup feature for level-2 backups is disabled.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not recommended if the advanced backup feature is enabled. Use the AdvancedDataPolicies parameter instead.</li>
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
     * <p>The cycle of a level-2 backup. Valid values:</p>
     * <ul>
     * <li><p><strong>Monday</strong></p>
     * </li>
     * <li><p><strong>Tuesday</strong></p>
     * </li>
     * <li><p><strong>Wednesday</strong></p>
     * </li>
     * <li><p><strong>Thursday</strong></p>
     * </li>
     * <li><p><strong>Friday</strong></p>
     * </li>
     * <li><p><strong>Saturday</strong></p>
     * </li>
     * <li><p><strong>Sunday</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>Select at least two days. Separate multiple values with commas (,).</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported by PolarDB for PostgreSQL (compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if the cross-region backup feature is unavailable in the region where your PolarDB for MySQL cluster resides. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not recommended if the advanced backup feature is enabled. Use the AdvancedDataPolicies parameter instead.</li>
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
     * <p>The retention period of level-2 backups. Valid values:</p>
     * <ul>
     * <li><p>0: The level-2 backup feature is disabled.</p>
     * </li>
     * <li><p>30 to 7300: The retention period of level-2 backups in days.</p>
     * </li>
     * <li><p>-1: The level-2 backups are permanently retained.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>When you create a cluster, the default value is <strong>0</strong>. This means the level-2 backup feature is disabled.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not recommended if the advanced backup feature is enabled. Use the AdvancedDataPolicies parameter instead.</li>
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
     * <p>The backup cycle. Valid values:</p>
     * <ul>
     * <li><p>Monday</p>
     * </li>
     * <li><p>Tuesday</p>
     * </li>
     * <li><p>Wednesday</p>
     * </li>
     * <li><p>Thursday</p>
     * </li>
     * <li><p>Friday</p>
     * </li>
     * <li><p>Saturday</p>
     * </li>
     * <li><p>Sunday</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not recommended if the advanced backup feature is enabled. Use the AdvancedDataPolicies parameter instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time range when an automatic backup is performed. The time is in the <code>HH:mmZ-HH:mmZ</code> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>07:00Z-08:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The time of the next backup. The time is in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
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

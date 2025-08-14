// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("AdvancedDataPolicies")
    public DescribeBackupPolicyResponseBodyAdvancedDataPolicies advancedDataPolicies;

    @NameInMap("AdvancedPolicyOption")
    public String advancedPolicyOption;

    /**
     * <p>The backup frequency. Default value: Normal. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: standard backup. The system backs up data once a day.</li>
     * <li><strong>2/24H</strong>: enhanced backup. The system backs up data every 2 hours.</li>
     * <li><strong>3/24H</strong>: enhanced backup. The system backs up data every 3 hours.</li>
     * <li><strong>4/24H</strong>: enhanced backup. The system backs up data every 4 hours.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If enhanced backup is enabled, all backups are retained for 24 hours. Backups are automatically deleted when the retention period ends. However, the system permanently retains the first backup that is created after 00:00 every day.</li>
     * <li>If enhanced backup is enabled, <strong>PreferredBackupPeriod</strong> is automatically set to all days in a week (from Monday to Sunday).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BackupFrequency")
    public String backupFrequency;

    @NameInMap("BackupPolicyLevel")
    public String backupPolicyLevel;

    /**
     * <p>Indicates whether backups are retained when you delete a cluster. Valid values:</p>
     * <ul>
     * <li><strong>ALL</strong>: permanently retains all backups.</li>
     * <li><strong>LATEST</strong>: permanently retains the most recent backup.</li>
     * <li><strong>NONE</strong>: does not retain backups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public String backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The backup frequency of level-1 backups. Default value: Normal. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: standard backup. The system backs up data once a day.</li>
     * <li><strong>2/24H</strong>: frequent backup. The system backs up data every 2 hours.</li>
     * <li><strong>3/24H</strong>: frequent backup. The system backs up data every 3 hours.</li>
     * <li><strong>4/24H</strong>: frequent backup. The system backs up data every 4 hours.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</li>
     * <li>This parameter is unavailable if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("DataLevel1BackupFrequency")
    public String dataLevel1BackupFrequency;

    /**
     * <p>The backup cycle of level-1 backups. Valid values:</p>
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
     * <li>You need to specify at least two values. Separate multiple values with commas (,).</li>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</li>
     * <li>This parameter is unavailable if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday</p>
     */
    @NameInMap("DataLevel1BackupPeriod")
    public String dataLevel1BackupPeriod;

    /**
     * <p>The retention period of level-1 backups. Valid values: 3 to 14. Unit: day.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("DataLevel1BackupRetentionPeriod")
    public String dataLevel1BackupRetentionPeriod;

    /**
     * <p>The period of time during which automatic backup is performed. The value must be in the <code>hh:mmZ-hh:mmZ</code> format. The time must be in UTC. The start time and the end time must be on the hour and must have an interval of 1 hour. Example: <code>14:00Z-15:00Z</code>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</li>
     * <li>This parameter is unavailable if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15:00Z-16:00Z</p>
     */
    @NameInMap("DataLevel1BackupTime")
    public String dataLevel1BackupTime;

    /**
     * <p>The region where the cross-region level-2 backup is stored. For information about regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DataLevel2BackupAnotherRegionRegion")
    public String dataLevel2BackupAnotherRegionRegion;

    /**
     * <p>The retention period of cross-region level-2 backups. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The cross-region level-2 backup feature is disabled.</li>
     * <li><strong>30 to 7300</strong>: Cross-region level-2 backups are retained for 30 to 7,300 days.</li>
     * <li><strong>1</strong>: Cross-region level-2 backups are retained for a long period of time.</li>
     * </ul>
     * <blockquote>
     * <p> The default value of the parameter is <strong>0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("DataLevel2BackupAnotherRegionRetentionPeriod")
    public String dataLevel2BackupAnotherRegionRetentionPeriod;

    /**
     * <p>The backup cycle of level-2 backups. Valid values:</p>
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
     * <li>You need to specify at least two values. Separate multiple values with commas (,).</li>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</li>
     * <li>This parameter is unavailable if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
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
     * <li>0: The level-2 backup feature is disabled.</li>
     * <li>30 to 7300: Level-2 backups are retained for 30 to 7,300 days.</li>
     * <li>\-1: Level-2 backups are retained for a long period of time.</li>
     * </ul>
     * <blockquote>
     * <p> The default value of this parameter is <strong>0</strong>.</p>
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
     * <li>Monday</li>
     * <li>Tuesday</li>
     * <li>Wednesday</li>
     * <li>Thursday</li>
     * <li>Friday</li>
     * <li>Saturday</li>
     * <li>Sunday</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time period when automatic backups are performed. The format is <code>HH:mmZ-HH:mmZ</code>. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>07:00Z-08:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The time when the next automatic backup will be performed. The format is <code>YYYY-MM-DDThh:mmZ</code>. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-16T07:30Z</p>
     */
    @NameInMap("PreferredNextBackupTime")
    public String preferredNextBackupTime;

    /**
     * <p>The ID of the request.</p>
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

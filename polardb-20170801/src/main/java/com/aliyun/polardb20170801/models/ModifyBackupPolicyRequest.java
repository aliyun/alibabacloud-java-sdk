// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The advanced backup policy.</p>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>Only clusters with BackupPolicyLevel set to Advanced support this parameter.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("AdvancedDataPolicies")
    public java.util.List<ModifyBackupPolicyRequestAdvancedDataPolicies> advancedDataPolicies;

    /**
     * <p>The backup frequency. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong> (default): regular backup. Automatic backup is performed once a day at a scheduled time.</li>
     * <li><strong>2/24H</strong>: high-frequency backup. Backup is performed every 2 hours.</li>
     * <li><strong>3/24H</strong>: high-frequency backup. Backup is performed every 3 hours.</li>
     * <li><strong>4/24H</strong>: high-frequency backup. Backup is performed every 4 hours.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>After high-frequency backup is enabled, all backups completed within 24 hours are retained. For backups older than 24 hours, only the first backup completed after 00:00 each day is retained, and all others are deleted.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After high-frequency backup is enabled, the backup cycle parameter PreferredBackupPeriod defaults to all days of the week (Monday through Sunday).</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the region of your PolarDB for MySQL cluster supports the cross-region backup feature, this parameter is not supported. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
     * </ul>
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
     * <p>The backup policy level. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: regular backup.</li>
     * <li><strong>Advanced</strong>: advanced backup.<blockquote>
     * <ul>
     * <li><ul>
     * <li>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>You can check the AdvancedPolicyOption response parameter of the <a href="https://help.aliyun.com/document_detail/2319231.html">DescribeBackupPolicy</a> operation to determine whether the cluster supports advanced backup. If the cluster supports advanced backup, you can apply to use this feature through <a href="~611727~~">Advanced backup settings</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, rollback to regular backup is <strong>not supported</strong>.</li>
     * </ul>
     * </li>
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
     * <li><p><strong>ALL</strong>: Long-term retention (LTR) of all backups.</p>
     * </li>
     * <li><p><strong>LATEST</strong>: Long-term retention (LTR) of only the last backup.</p>
     * </li>
     * <li><p><strong>NONE</strong>: Does not retain any backups.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Default value: NONE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public String backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query information about all clusters in a specific region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp13wz9586voc****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The backup frequency. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong> (default): regular backup. Automatic backup is performed once a day at a scheduled time.</li>
     * <li><strong>2/24H</strong>: high-frequency backup. Backup is performed every 2 hours.</li>
     * <li><strong>3/24H</strong>: high-frequency backup. Backup is performed every 3 hours.</li>
     * <li><strong>4/24H</strong>: high-frequency backup. Backup is performed every 4 hours.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
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
     * <li>Select at least 2 days. Separate multiple values with commas (,).</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
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
     * <ul>
     * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DataLevel1BackupRetentionPeriod")
    public String dataLevel1BackupRetentionPeriod;

    /**
     * <p>The time period during which automatic backup is performed. Specify the time period in the <code>hh:mmZ-hh:mmZ</code> format in UTC. The values must be on the hour with an interval of 1 hour, such as <code>14:00Z-15:00Z</code>.</p>
     * <blockquote>
     * <ul>
     * <li>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</li>
     * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15:00Z-16:00Z</p>
     */
    @NameInMap("DataLevel1BackupTime")
    public String dataLevel1BackupTime;

    /**
     * <p>The destination region for cross-region level-2 backups. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
     * <blockquote>
     * <ul>
     * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DataLevel2BackupAnotherRegionRegion")
    public String dataLevel2BackupAnotherRegionRegion;

    /**
     * <p>The retention period of cross-region backups for level-2 backups. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Disables the level-2 cross-region backup feature.</p>
     * </li>
     * <li><p><strong>30 to 7300</strong>: The retention period of level-2 backups. Unit: days.</p>
     * </li>
     * <li><p><strong>-1</strong>: Long-term retention (LTR) of level-2 backups.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>When a cluster is created, the default value is <strong>0</strong>, which means the level-2 cross-region backup feature is disabled.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
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
     * <li>Select at least 2 days. Separate multiple values with commas (,).</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
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
     * <li><p><strong>0</strong>: Disables the level-2 backup feature.</p>
     * </li>
     * <li><p><strong>30 to 7300</strong>: The retention period of level-2 backups. Unit: days.</p>
     * </li>
     * <li><p><strong>-1</strong>: Long-term retention (LTR) of level-2 backups.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>When a cluster is created, the default value is <strong>0</strong>, which means the level-2 backup feature is disabled.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
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

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The backup cycle. Valid values: </p>
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
     * <li>Select at least 2 days. Separate multiple values with commas (,).</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the region of your PolarDB for MySQL cluster supports the cross-region backup feature, this parameter is not supported. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time period during which automatic backup is performed. Specify the time period in the <code>hh:mmZ-hh:mmZ</code> format in UTC. The values must be on the hour with an interval of 1 hour, such as <code>14:00Z-15:00Z</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>15:00Z-16:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

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

    public ModifyBackupPolicyRequest setBackupFrequency(String backupFrequency) {
        this.backupFrequency = backupFrequency;
        return this;
    }
    public String getBackupFrequency() {
        return this.backupFrequency;
    }

    public ModifyBackupPolicyRequest setBackupPolicyLevel(String backupPolicyLevel) {
        this.backupPolicyLevel = backupPolicyLevel;
        return this;
    }
    public String getBackupPolicyLevel() {
        return this.backupPolicyLevel;
    }

    public ModifyBackupPolicyRequest setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public ModifyBackupPolicyRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyBackupPolicyRequest setDataLevel1BackupFrequency(String dataLevel1BackupFrequency) {
        this.dataLevel1BackupFrequency = dataLevel1BackupFrequency;
        return this;
    }
    public String getDataLevel1BackupFrequency() {
        return this.dataLevel1BackupFrequency;
    }

    public ModifyBackupPolicyRequest setDataLevel1BackupPeriod(String dataLevel1BackupPeriod) {
        this.dataLevel1BackupPeriod = dataLevel1BackupPeriod;
        return this;
    }
    public String getDataLevel1BackupPeriod() {
        return this.dataLevel1BackupPeriod;
    }

    public ModifyBackupPolicyRequest setDataLevel1BackupRetentionPeriod(String dataLevel1BackupRetentionPeriod) {
        this.dataLevel1BackupRetentionPeriod = dataLevel1BackupRetentionPeriod;
        return this;
    }
    public String getDataLevel1BackupRetentionPeriod() {
        return this.dataLevel1BackupRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setDataLevel1BackupTime(String dataLevel1BackupTime) {
        this.dataLevel1BackupTime = dataLevel1BackupTime;
        return this;
    }
    public String getDataLevel1BackupTime() {
        return this.dataLevel1BackupTime;
    }

    public ModifyBackupPolicyRequest setDataLevel2BackupAnotherRegionRegion(String dataLevel2BackupAnotherRegionRegion) {
        this.dataLevel2BackupAnotherRegionRegion = dataLevel2BackupAnotherRegionRegion;
        return this;
    }
    public String getDataLevel2BackupAnotherRegionRegion() {
        return this.dataLevel2BackupAnotherRegionRegion;
    }

    public ModifyBackupPolicyRequest setDataLevel2BackupAnotherRegionRetentionPeriod(String dataLevel2BackupAnotherRegionRetentionPeriod) {
        this.dataLevel2BackupAnotherRegionRetentionPeriod = dataLevel2BackupAnotherRegionRetentionPeriod;
        return this;
    }
    public String getDataLevel2BackupAnotherRegionRetentionPeriod() {
        return this.dataLevel2BackupAnotherRegionRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setDataLevel2BackupPeriod(String dataLevel2BackupPeriod) {
        this.dataLevel2BackupPeriod = dataLevel2BackupPeriod;
        return this;
    }
    public String getDataLevel2BackupPeriod() {
        return this.dataLevel2BackupPeriod;
    }

    public ModifyBackupPolicyRequest setDataLevel2BackupRetentionPeriod(String dataLevel2BackupRetentionPeriod) {
        this.dataLevel2BackupRetentionPeriod = dataLevel2BackupRetentionPeriod;
        return this;
    }
    public String getDataLevel2BackupRetentionPeriod() {
        return this.dataLevel2BackupRetentionPeriod;
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
        /**
         * <p>The action type. Valid values:</p>
         * <ul>
         * <li><strong>CREATE</strong>: create</li>
         * <li><strong>UPDATE</strong>: update</li>
         * <li><strong>DELETE</strong>: delete</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>Indicates whether the backup policy is automatically generated by the system.</p>
         * <blockquote>
         * <p>This parameter value is automatically generated. You do not need to specify it.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoCreated")
        public Boolean autoCreated;

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>F</strong>: full backup.<blockquote>
         * <p>This parameter cannot be modified and is fixed to F.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>F</p>
         */
        @NameInMap("BakType")
        public String bakType;

        /**
         * <p>The destination region of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("DestRegion")
        public String destRegion;

        /**
         * <p>The destination type of the backup policy. Valid values:</p>
         * <ul>
         * <li><strong>level1</strong>: level-1 backup</li>
         * <li><strong>level2</strong>: level-2 backup</li>
         * <li><strong>level2Cross</strong>: level-2 cross-region backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>level2</p>
         */
        @NameInMap("DestType")
        public String destType;

        /**
         * <p>The method for converting level-1 backups to level-2 backups. Valid values:</p>
         * <ul>
         * <li><strong>copy</strong>: copy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>copy</p>
         */
        @NameInMap("DumpAction")
        public String dumpAction;

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li><strong>dayOfWeek</strong>: scheduled by week</li>
         * <li><strong>dayOfMonth</strong>: scheduled by month</li>
         * <li><strong>dayOfYear</strong>: scheduled by year</li>
         * <li><strong>backupInterval</strong>: scheduled at fixed intervals</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required only when FilterType is set to <strong>crontab</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dayOfWeek</p>
         */
        @NameInMap("FilterKey")
        public String filterKey;

        /**
         * <p>The filter type of the advanced policy. Valid values:</p>
         * <ul>
         * <li><strong>crontab</strong>: periodic scheduling</li>
         * <li><strong>event</strong>: event-based scheduling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>crontab</p>
         */
        @NameInMap("FilterType")
        public String filterType;

        /**
         * <p>The backup cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3,4,5,6,7</p>
         */
        @NameInMap("FilterValue")
        public String filterValue;

        /**
         * <p>The 24-hour backup data retention policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Only the first backup set of the day is retained for backups older than 24 hours.</li>
         * <li><strong>false</strong>: All backup sets are retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OnlyPreserveOneEachDay")
        public Boolean onlyPreserveOneEachDay;

        /**
         * <p>The hourly backup data retention policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Only the earliest backup set within each hour is retained for backups older than 1 hour.</li>
         * <li><strong>false</strong>: All backup sets are retained.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter cannot be modified and is fixed to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OnlyPreserveOneEachHour")
        public Boolean onlyPreserveOneEachHour;

        /**
         * <p>The backup policy ID. You can call the <a href="https://help.aliyun.com/document_detail/2319231.html">DescribeBackupPolicy</a> operation to query the backup policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71930ac2e9f15e41615e10627c******</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The retention type of backup sets. Valid values:</p>
         * <ul>
         * <li><strong>never</strong>: never expires</li>
         * <li><strong>delay</strong>: expires after a fixed number of days</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
         */
        @NameInMap("RetentionType")
        public String retentionType;

        /**
         * <p>The number of days to retain backups.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("RetentionValue")
        public String retentionValue;

        /**
         * <p>The source region of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("SrcRegion")
        public String srcRegion;

        /**
         * <p>The source type of the backup policy. Valid values:</p>
         * <ul>
         * <li><strong>db</strong>: database cluster</li>
         * <li><strong>level1</strong>: level-1 backup</li>
         * <li><strong>level2</strong>: level-2 backup</li>
         * <li><strong>level2Cross</strong>: level-2 cross-region backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>level1</p>
         */
        @NameInMap("SrcType")
        public String srcType;

        @NameInMap("StorageClass")
        public String storageClass;

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

        public ModifyBackupPolicyRequestAdvancedDataPolicies setAutoCreated(Boolean autoCreated) {
            this.autoCreated = autoCreated;
            return this;
        }
        public Boolean getAutoCreated() {
            return this.autoCreated;
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

        public ModifyBackupPolicyRequestAdvancedDataPolicies setDumpAction(String dumpAction) {
            this.dumpAction = dumpAction;
            return this;
        }
        public String getDumpAction() {
            return this.dumpAction;
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

        public ModifyBackupPolicyRequestAdvancedDataPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public ModifyBackupPolicyRequestAdvancedDataPolicies setRetentionValue(String retentionValue) {
            this.retentionValue = retentionValue;
            return this;
        }
        public String getRetentionValue() {
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

        public ModifyBackupPolicyRequestAdvancedDataPolicies setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

}

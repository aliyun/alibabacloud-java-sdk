// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The advanced backup policies.</p>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is supported only for clusters for which <code>BackupPolicyLevel</code> is set to <code>Advanced</code>.</li>
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
     * <li><p><strong>Normal</strong> (default): standard backup. The cluster is backed up once a day.</p>
     * </li>
     * <li><p><strong>2/24H</strong>: high-frequency backup. The cluster is backed up every 2 hours.</p>
     * </li>
     * <li><p><strong>3/24H</strong>: high-frequency backup. The cluster is backed up every 3 hours.</p>
     * </li>
     * <li><p><strong>4/24H</strong>: high-frequency backup. The cluster is backed up every 4 hours.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>If you enable high-frequency backup, all backups completed within the last 24 hours are retained. For backups older than 24 hours, the system retains only the first backup completed after 00:00 each day and deletes the rest.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If you enable high-frequency backup, the <strong>PreferredBackupPeriod</strong> parameter is automatically set to all days of the week (from Monday to Sunday).</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if your PolarDB for MySQL cluster is in a region that supports the cross-region backup feature. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After you enable advanced backup, this parameter is no longer effective. Use the <code>AdvancedDataPolicies</code> parameter instead.</li>
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
     * <p>The level of the backup policy. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: standard backup</p>
     * </li>
     * <li><p><strong>Advanced</strong>: advanced backup</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>Check the <code>AdvancedPolicyOption</code> parameter in the response of the <a href="https://help.aliyun.com/document_detail/2319231.html">DescribeBackupPolicy</a> operation to determine whether the cluster supports advanced backup. If the cluster supports advanced backup, you can request this feature in <a href="~611727~~">Advanced backup settings</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After you enable advanced backup, you <strong>cannot</strong> switch back to standard backup.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BackupPolicyLevel")
    public String backupPolicyLevel;

    /**
     * <p>Specifies whether to retain backups when you delete the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>ALL</strong>: Permanently retains all backups.</p>
     * </li>
     * <li><p><strong>LATEST</strong>: Permanently retains the last backup.</p>
     * </li>
     * <li><p><strong>NONE</strong>: Does not retain backup sets.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The default value is <code>NONE</code>.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters in a specified region, including the cluster IDs.</p>
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
     * <li><p><strong>Normal</strong> (default): standard backup. The cluster is backed up once a day.</p>
     * </li>
     * <li><p><strong>2/24H</strong>: high-frequency backup. The cluster is backed up every 2 hours.</p>
     * </li>
     * <li><p><strong>3/24H</strong>: high-frequency backup. The cluster is backed up every 3 hours.</p>
     * </li>
     * <li><p><strong>4/24H</strong>: high-frequency backup. The cluster is backed up every 4 hours.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if your PolarDB for MySQL cluster is in a region that supports the cross-region backup feature. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After you enable advanced backup, this parameter is no longer effective. Use the <code>AdvancedDataPolicies</code> parameter instead.</li>
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
     * <p>The level-1 backup cycle. Valid values:</p>
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
     * <li>You must select at least two days. Separate multiple values with commas.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if your PolarDB for MySQL cluster is in a region that supports the cross-region backup feature. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After you enable advanced backup, this parameter is no longer effective. Use the <code>AdvancedDataPolicies</code> parameter instead.</li>
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
     * <p>The retention period for level-1 backups, in days. Valid values: 3 to 14.</p>
     * <blockquote>
     * <ul>
     * <li>After you enable advanced backup, this parameter is no longer effective. Use the <code>AdvancedDataPolicies</code> parameter instead.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DataLevel1BackupRetentionPeriod")
    public String dataLevel1BackupRetentionPeriod;

    /**
     * <p>The time window for automatic backups. Specify the time in UTC and in the <code>hh:mmZ-hh:mmZ</code> format. The time window must be a one-hour period that starts on the hour. For example, <code>14:00Z-15:00Z</code>.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is not supported for PolarDB for PostgreSQL (compatible with Oracle) and PolarDB for PostgreSQL.</p>
     * </li>
     * <li><p>This parameter is not supported if your PolarDB for MySQL cluster is in a region that supports the cross-region backup feature. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
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
     * <p>The destination region for the cross-region level-2 backup. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
     * <blockquote>
     * <ul>
     * <li>After you enable advanced backup, this parameter is no longer effective. Use the <code>AdvancedDataPolicies</code> parameter instead.</li>
     * </ul>
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
     * <li><p><strong>0</strong>: Disables the cross-region level-2 backup feature.</p>
     * </li>
     * <li><p><strong>30 to 7300</strong>: The retention period of cross-region level-2 backups, in days.</p>
     * </li>
     * <li><p><strong>-1</strong>: Cross-region level-2 backups are permanently retained.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>When you create a cluster, the default value is <strong>0</strong>, which disables the cross-region level-2 backup feature.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After you enable advanced backup, this parameter is no longer effective. Use the <code>AdvancedDataPolicies</code> parameter instead.</li>
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
     * <p>The level-2 backup cycle. Valid values:</p>
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
     * <li>You must select at least two days. Separate multiple values with commas.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported for PolarDB for PostgreSQL (compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if your PolarDB for MySQL cluster is in a region that supports the cross-region backup feature. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After you enable advanced backup, this parameter is no longer effective. Use the <code>AdvancedDataPolicies</code> parameter instead.</li>
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
     * <li><p><strong>30 to 7300</strong>: The retention period of level-2 backups, in days.</p>
     * </li>
     * <li><p><strong>-1</strong>: Level-2 backups are permanently retained.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>When you create a cluster, the default value is <strong>0</strong>, which disables the level-2 backup feature.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After you enable advanced backup, this parameter is no longer effective. Use the <code>AdvancedDataPolicies</code> parameter instead.</li>
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
     * <p>The backup cycle. Valid values:</p>
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
     * <li>You must select at least two days. Separate multiple values with commas.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if your PolarDB for MySQL cluster is in a region that supports the cross-region backup feature. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After you enable advanced backup, this parameter is no longer effective. Use the <code>AdvancedDataPolicies</code> parameter instead.</li>
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
     * <p>The time window for automatic backups. Specify the time in UTC and in the <code>hh:mmZ-hh:mmZ</code> format. The time window must be a one-hour period that starts on the hour. For example, <code>14:00Z-15:00Z</code>.</p>
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
         * <li><p><strong>CREATE</strong>: Create</p>
         * </li>
         * <li><p><strong>UPDATE</strong>: Update</p>
         * </li>
         * <li><p><strong>DELETE</strong>: Delete</p>
         * </li>
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
         * <p>This value is automatically generated. You do not need to specify this parameter.</p>
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
         * <li><strong>F</strong>: full backup</li>
         * </ul>
         * <blockquote>
         * <p>This parameter cannot be modified and is fixed to <code>F</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>F</p>
         */
        @NameInMap("BakType")
        public String bakType;

        /**
         * <p>The destination region for the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("DestRegion")
        public String destRegion;

        /**
         * <p>The destination type for the backup policy. Valid values:</p>
         * <ul>
         * <li><p><strong>level1</strong>: level-1 backup</p>
         * </li>
         * <li><p><strong>level2</strong>: level-2 backup</p>
         * </li>
         * <li><p><strong>level2Cross</strong>: cross-region level-2 backup</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>level2</p>
         */
        @NameInMap("DestType")
        public String destType;

        /**
         * <p>The method to convert a level-1 backup to a level-2 backup. Valid values:</p>
         * <ul>
         * <li><strong>copy</strong>: Copy</li>
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
         * <li><p><strong>dayOfWeek</strong>: Weekly schedule</p>
         * </li>
         * <li><p><strong>dayOfMonth</strong>: Monthly schedule</p>
         * </li>
         * <li><p><strong>dayOfYear</strong>: Yearly schedule</p>
         * </li>
         * <li><p><strong>backupInterval</strong>: Fixed interval schedule</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required only if <code>FilterType</code> is set to <strong>crontab</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dayOfWeek</p>
         */
        @NameInMap("FilterKey")
        public String filterKey;

        /**
         * <p>The filter type for the advanced policy. Valid values:</p>
         * <ul>
         * <li><p><strong>crontab</strong>: Recurring schedule</p>
         * </li>
         * <li><p><strong>event</strong>: Event-based schedule</p>
         * </li>
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
         * <p>The retention policy for backups that are more than 24 hours old. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Retains only the first backup set of the day.</p>
         * </li>
         * <li><p><strong>false</strong>: Retains all backups.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OnlyPreserveOneEachDay")
        public Boolean onlyPreserveOneEachDay;

        /**
         * <p>The retention policy for hourly backups. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Retains only the first backup set of each hour for backups that are more than one hour old.</p>
         * </li>
         * <li><p><strong>false</strong>: Retains all backup sets.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter cannot be modified and is fixed to <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OnlyPreserveOneEachHour")
        public Boolean onlyPreserveOneEachHour;

        /**
         * <p>The ID of the backup policy. You can call the <a href="https://help.aliyun.com/document_detail/2319231.html">DescribeBackupPolicy</a> operation to view the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71930ac2e9f15e41615e10627c******</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The retention type for the backup set. Valid values:</p>
         * <ul>
         * <li><p><strong>never</strong>: Never expires.</p>
         * </li>
         * <li><p><strong>delay</strong>: Expires after a specified number of days.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
         */
        @NameInMap("RetentionType")
        public String retentionType;

        /**
         * <p>The number of days to retain the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("RetentionValue")
        public String retentionValue;

        /**
         * <p>The source region for the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("SrcRegion")
        public String srcRegion;

        /**
         * <p>The source type for the backup policy. Valid values:</p>
         * <ul>
         * <li><p><strong>db</strong>: database cluster</p>
         * </li>
         * <li><p><strong>level1</strong>: level-1 backup</p>
         * </li>
         * <li><p><strong>level2</strong>: level-2 backup</p>
         * </li>
         * <li><p><strong>level2Cross</strong>: cross-region level-2 backup</p>
         * </li>
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

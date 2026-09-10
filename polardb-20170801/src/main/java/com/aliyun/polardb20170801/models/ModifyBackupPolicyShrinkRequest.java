// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyShrinkRequest extends TeaModel {
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
    public String advancedDataPoliciesShrink;

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

    public static ModifyBackupPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyShrinkRequest self = new ModifyBackupPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyShrinkRequest setAdvancedDataPoliciesShrink(String advancedDataPoliciesShrink) {
        this.advancedDataPoliciesShrink = advancedDataPoliciesShrink;
        return this;
    }
    public String getAdvancedDataPoliciesShrink() {
        return this.advancedDataPoliciesShrink;
    }

    public ModifyBackupPolicyShrinkRequest setBackupFrequency(String backupFrequency) {
        this.backupFrequency = backupFrequency;
        return this;
    }
    public String getBackupFrequency() {
        return this.backupFrequency;
    }

    public ModifyBackupPolicyShrinkRequest setBackupPolicyLevel(String backupPolicyLevel) {
        this.backupPolicyLevel = backupPolicyLevel;
        return this;
    }
    public String getBackupPolicyLevel() {
        return this.backupPolicyLevel;
    }

    public ModifyBackupPolicyShrinkRequest setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public ModifyBackupPolicyShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyBackupPolicyShrinkRequest setDataLevel1BackupFrequency(String dataLevel1BackupFrequency) {
        this.dataLevel1BackupFrequency = dataLevel1BackupFrequency;
        return this;
    }
    public String getDataLevel1BackupFrequency() {
        return this.dataLevel1BackupFrequency;
    }

    public ModifyBackupPolicyShrinkRequest setDataLevel1BackupPeriod(String dataLevel1BackupPeriod) {
        this.dataLevel1BackupPeriod = dataLevel1BackupPeriod;
        return this;
    }
    public String getDataLevel1BackupPeriod() {
        return this.dataLevel1BackupPeriod;
    }

    public ModifyBackupPolicyShrinkRequest setDataLevel1BackupRetentionPeriod(String dataLevel1BackupRetentionPeriod) {
        this.dataLevel1BackupRetentionPeriod = dataLevel1BackupRetentionPeriod;
        return this;
    }
    public String getDataLevel1BackupRetentionPeriod() {
        return this.dataLevel1BackupRetentionPeriod;
    }

    public ModifyBackupPolicyShrinkRequest setDataLevel1BackupTime(String dataLevel1BackupTime) {
        this.dataLevel1BackupTime = dataLevel1BackupTime;
        return this;
    }
    public String getDataLevel1BackupTime() {
        return this.dataLevel1BackupTime;
    }

    public ModifyBackupPolicyShrinkRequest setDataLevel2BackupAnotherRegionRegion(String dataLevel2BackupAnotherRegionRegion) {
        this.dataLevel2BackupAnotherRegionRegion = dataLevel2BackupAnotherRegionRegion;
        return this;
    }
    public String getDataLevel2BackupAnotherRegionRegion() {
        return this.dataLevel2BackupAnotherRegionRegion;
    }

    public ModifyBackupPolicyShrinkRequest setDataLevel2BackupAnotherRegionRetentionPeriod(String dataLevel2BackupAnotherRegionRetentionPeriod) {
        this.dataLevel2BackupAnotherRegionRetentionPeriod = dataLevel2BackupAnotherRegionRetentionPeriod;
        return this;
    }
    public String getDataLevel2BackupAnotherRegionRetentionPeriod() {
        return this.dataLevel2BackupAnotherRegionRetentionPeriod;
    }

    public ModifyBackupPolicyShrinkRequest setDataLevel2BackupPeriod(String dataLevel2BackupPeriod) {
        this.dataLevel2BackupPeriod = dataLevel2BackupPeriod;
        return this;
    }
    public String getDataLevel2BackupPeriod() {
        return this.dataLevel2BackupPeriod;
    }

    public ModifyBackupPolicyShrinkRequest setDataLevel2BackupRetentionPeriod(String dataLevel2BackupRetentionPeriod) {
        this.dataLevel2BackupRetentionPeriod = dataLevel2BackupRetentionPeriod;
        return this;
    }
    public String getDataLevel2BackupRetentionPeriod() {
        return this.dataLevel2BackupRetentionPeriod;
    }

    public ModifyBackupPolicyShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyBackupPolicyShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyBackupPolicyShrinkRequest setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public ModifyBackupPolicyShrinkRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public ModifyBackupPolicyShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyBackupPolicyShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

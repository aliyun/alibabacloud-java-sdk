// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The advanced backup policy.</p>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>This parameter is not supported by PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is supported only by clusters whose BackupPolicyLevel is set to Advanced.</li>
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
     * <li><strong>Normal</strong> (default): standard backup, performed once a day at a scheduled time.</li>
     * <li><strong>2/24H</strong>: high-frequency backup, performed once every 2 hours.</li>
     * <li><strong>3/24H</strong>: high-frequency backup, performed once every 3 hours.</li>
     * <li><strong>4/24H</strong>: high-frequency backup, performed once every 4 hours.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>After high-frequency backup is enabled, all backups completed within 24 hours are retained. For backups that exceed 24 hours, the system retains only the first backup completed after 00:00 each day and deletes the rest.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After high-frequency backup is enabled, all days of the week (Monday to Sunday) are selected by default for the backup epoch <strong>PreferredBackupPeriod</strong> parameter.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if the region where your PolarDB for MySQL cluster resides supports the cross-region backup feature. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
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
     * <p>The level of the backup policy. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: standard backup</li>
     * <li><strong>Advanced</strong>: advanced backup<blockquote>
     * <ul>
     * <li><ul>
     * <li>This parameter is not supported by PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>You can check the AdvancedPolicyOption parameter in the response of the <a href="https://help.aliyun.com/document_detail/2319231.html">DescribeBackupPolicy</a> operation to determine whether the cluster supports advanced backup. If the cluster supports advanced backup, you can apply for this feature in <a href="~611727~~">Advanced backup settings</a>.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, you <strong>cannot</strong> roll back to standard backup.</li>
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
     * <p>Specifies whether to retain backups when a cluster is deleted. Valid values:</p>
     * <ul>
     * <li><p><strong>ALL</strong>: long-term retention (LTR) of all backups.</p>
     * </li>
     * <li><p><strong>LATEST</strong>: long-term retention (LTR) of the last backup.</p>
     * </li>
     * <li><p><strong>NONE</strong>: does not retain backup sets.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query all clusters in a specific region, including their cluster IDs.</p>
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
     * <li><strong>Normal</strong> (default): standard backup, performed once a day at a scheduled time</li>
     * <li><strong>2/24H</strong>: high-frequency backup, performed once every 2 hours</li>
     * <li><strong>3/24H</strong>: high-frequency backup, performed once every 3 hours</li>
     * <li><strong>4/24H</strong>: high-frequency backup, performed once every 4 hours</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>This parameter is not supported by PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if the region where your PolarDB for MySQL cluster resides does not support cross-region backup. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
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
     * <p>The backup cycle for level-1 backups. Valid values: </p>
     * <ul>
     * <li><strong>Monday</strong>: Monday</li>
     * <li><strong>Tuesday</strong>: Tuesday</li>
     * <li><strong>Wednesday</strong>: Wednesday</li>
     * <li><strong>Thursday</strong>: Thursday</li>
     * <li><strong>Friday</strong>: Friday</li>
     * <li><strong>Saturday</strong>: Saturday</li>
     * <li><strong>Sunday</strong>: Sunday</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>You must select at least two days. Separate multiple values with commas (,).</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported by PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if the region where your PolarDB for MySQL cluster resides does not support cross-region backup. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
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
     * <p>The time period during which automatic backups are performed. The time must be in the <code>hh:mmZ-hh:mmZ</code> format (UTC time) and must be on the hour with a 1-hour interval, such as <code>14:00Z-15:00Z</code>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is not supported by PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * <li>This parameter is not supported if the region where your PolarDB for MySQL cluster resides does not support cross-region backup. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15:00Z-16:00Z</p>
     */
    @NameInMap("DataLevel1BackupTime")
    public String dataLevel1BackupTime;

    /**
     * <p>The destination region for cross-region backup of level-2 backups. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
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
     * <p>The retention epoch for cross-region backup of level-2 backups. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: shutdown of the level-2 backup feature.</p>
     * </li>
     * <li><p><strong>30 to 7300</strong>: the retention epoch of level-2 backups, in days.</p>
     * </li>
     * <li><p><strong>-1</strong>: long-term retention (LTR) of level-2 backups.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>When a cluster is created, the default value is <strong>0</strong>, which indicates the shutdown of the cross-region backup feature for level-2 backups.</li>
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
     * <p>The backup cycle for level-2 backups. Valid values: </p>
     * <ul>
     * <li><strong>Monday</strong>: Monday</li>
     * <li><strong>Tuesday</strong>: Tuesday</li>
     * <li><strong>Wednesday</strong>: Wednesday</li>
     * <li><strong>Thursday</strong>: Thursday</li>
     * <li><strong>Friday</strong>: Friday</li>
     * <li><strong>Saturday</strong>: Saturday</li>
     * <li><strong>Sunday</strong>: Sunday</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>You must select at least two days. Separate multiple values with commas (,).</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported by PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if the region where your PolarDB for MySQL cluster resides does not support cross-region backup. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
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
     * <p>The retention epoch of level-2 backups. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: shutdown of the level-2 backup feature.</p>
     * </li>
     * <li><p><strong>30 to 7300</strong>: the retention epoch of level-2 backups, in days.</p>
     * </li>
     * <li><p><strong>-1</strong>: long-term retention (LTR) of level-2 backups.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>When a cluster is created, the default value is <strong>0</strong>, which indicates the shutdown of the level-2 backup feature.</li>
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
     * <li><strong>Monday</strong>: Monday</li>
     * <li><strong>Tuesday</strong>: Tuesday</li>
     * <li><strong>Wednesday</strong>: Wednesday</li>
     * <li><strong>Thursday</strong>: Thursday</li>
     * <li><strong>Friday</strong>: Friday</li>
     * <li><strong>Saturday</strong>: Saturday</li>
     * <li><strong>Sunday</strong>: Sunday</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>You must select at least two days. Separate multiple values with commas (,).</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is not supported if the region where your PolarDB for MySQL cluster resides supports cross-region backup. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
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
     * <p>The time period during which automatic backups are performed. The time must be in the <code>hh:mmZ-hh:mmZ</code> format (UTC time) and must be on the hour with a 1-hour interval, such as <code>14:00Z-15:00Z</code>.</p>
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

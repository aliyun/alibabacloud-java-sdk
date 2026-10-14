// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyLogBackupPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The advanced backup policy.</p>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>This parameter is not supported by PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>This parameter is supported only by clusters whose BackupPolicyLevel is set to Advanced.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("AdvancedLogPolicies")
    public String advancedLogPoliciesShrink;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query all clusters in a specific region, including their cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region for cross-region log backup. For more information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedLogPolicies parameter instead.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LogBackupAnotherRegionRegion")
    public String logBackupAnotherRegionRegion;

    /**
     * <p>The retention period for cross-region backups. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disables the cross-region backup feature.</li>
     * <li><strong>30 to 7300</strong>: the retention period for cross-region backups, in days.</li>
     * <li><strong>-1</strong>: long-term retention (LTR).</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>When a cluster is created, the default value is <strong>0</strong>, which indicates that the cross-region backup feature is disabled.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedLogPolicies parameter instead.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("LogBackupAnotherRegionRetentionPeriod")
    public String logBackupAnotherRegionRetentionPeriod;

    /**
     * <p>The log retention period. Valid values:</p>
     * <ul>
     * <li>3 to 7300: the log retention period, in days.</li>
     * <li>-1: long-term retention (LTR).</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedLogPolicies parameter instead.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public String logBackupRetentionPeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyLogBackupPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogBackupPolicyShrinkRequest self = new ModifyLogBackupPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogBackupPolicyShrinkRequest setAdvancedLogPoliciesShrink(String advancedLogPoliciesShrink) {
        this.advancedLogPoliciesShrink = advancedLogPoliciesShrink;
        return this;
    }
    public String getAdvancedLogPoliciesShrink() {
        return this.advancedLogPoliciesShrink;
    }

    public ModifyLogBackupPolicyShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyLogBackupPolicyShrinkRequest setLogBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
        this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
        return this;
    }
    public String getLogBackupAnotherRegionRegion() {
        return this.logBackupAnotherRegionRegion;
    }

    public ModifyLogBackupPolicyShrinkRequest setLogBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
        this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
        return this;
    }
    public String getLogBackupAnotherRegionRetentionPeriod() {
        return this.logBackupAnotherRegionRetentionPeriod;
    }

    public ModifyLogBackupPolicyShrinkRequest setLogBackupRetentionPeriod(String logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public ModifyLogBackupPolicyShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyLogBackupPolicyShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLogBackupPolicyShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyLogBackupPolicyShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyLogBackupPolicyRequest extends TeaModel {
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
    public java.util.List<ModifyLogBackupPolicyRequestAdvancedLogPolicies> advancedLogPolicies;

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

    public static ModifyLogBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogBackupPolicyRequest self = new ModifyLogBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogBackupPolicyRequest setAdvancedLogPolicies(java.util.List<ModifyLogBackupPolicyRequestAdvancedLogPolicies> advancedLogPolicies) {
        this.advancedLogPolicies = advancedLogPolicies;
        return this;
    }
    public java.util.List<ModifyLogBackupPolicyRequestAdvancedLogPolicies> getAdvancedLogPolicies() {
        return this.advancedLogPolicies;
    }

    public ModifyLogBackupPolicyRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyLogBackupPolicyRequest setLogBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
        this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
        return this;
    }
    public String getLogBackupAnotherRegionRegion() {
        return this.logBackupAnotherRegionRegion;
    }

    public ModifyLogBackupPolicyRequest setLogBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
        this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
        return this;
    }
    public String getLogBackupAnotherRegionRetentionPeriod() {
        return this.logBackupAnotherRegionRetentionPeriod;
    }

    public ModifyLogBackupPolicyRequest setLogBackupRetentionPeriod(String logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public ModifyLogBackupPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyLogBackupPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLogBackupPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyLogBackupPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyLogBackupPolicyRequestAdvancedLogPolicies extends TeaModel {
        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li><strong>CREATE</strong>: creates a policy.</li>
         * <li><strong>UPDATE</strong>: updates a policy.</li>
         * <li><strong>DELETE</strong>: deletes a policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The destination region of the log backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
         * <p>Specifies whether to enable log backup. The value is fixed to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnableLogBackup")
        public Integer enableLogBackup;

        /**
         * <p>The log backup retention period type. Valid values:</p>
         * <ul>
         * <li><strong>never</strong>: never expires</li>
         * <li><strong>delay</strong>: expires after a fixed number of days</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
         */
        @NameInMap("LogRetentionType")
        public String logRetentionType;

        /**
         * <p>The log backup retention period in days. Valid values:</p>
         * <ul>
         * <li>3 to 7300: the log retention period, in days.</li>
         * <li>-1: long-term retention (LTR).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LogRetentionValue")
        public String logRetentionValue;

        /**
         * <p>The ID of the log backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>71930ac2e9f15e41615e10627c******</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The source region of the log backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("SrcRegion")
        public String srcRegion;

        /**
         * <p>The source type of the log backup policy. Valid values:</p>
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

        public static ModifyLogBackupPolicyRequestAdvancedLogPolicies build(java.util.Map<String, ?> map) throws Exception {
            ModifyLogBackupPolicyRequestAdvancedLogPolicies self = new ModifyLogBackupPolicyRequestAdvancedLogPolicies();
            return TeaModel.build(map, self);
        }

        public ModifyLogBackupPolicyRequestAdvancedLogPolicies setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ModifyLogBackupPolicyRequestAdvancedLogPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public ModifyLogBackupPolicyRequestAdvancedLogPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public ModifyLogBackupPolicyRequestAdvancedLogPolicies setEnableLogBackup(Integer enableLogBackup) {
            this.enableLogBackup = enableLogBackup;
            return this;
        }
        public Integer getEnableLogBackup() {
            return this.enableLogBackup;
        }

        public ModifyLogBackupPolicyRequestAdvancedLogPolicies setLogRetentionType(String logRetentionType) {
            this.logRetentionType = logRetentionType;
            return this;
        }
        public String getLogRetentionType() {
            return this.logRetentionType;
        }

        public ModifyLogBackupPolicyRequestAdvancedLogPolicies setLogRetentionValue(String logRetentionValue) {
            this.logRetentionValue = logRetentionValue;
            return this;
        }
        public String getLogRetentionValue() {
            return this.logRetentionValue;
        }

        public ModifyLogBackupPolicyRequestAdvancedLogPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ModifyLogBackupPolicyRequestAdvancedLogPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public ModifyLogBackupPolicyRequestAdvancedLogPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

    }

}

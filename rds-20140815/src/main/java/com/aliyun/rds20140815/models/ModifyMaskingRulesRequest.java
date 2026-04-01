// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyMaskingRulesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n8t18o******6d5</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>myDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <strong>example:</strong>
     * <p>sm4-128-gcm</p>
     */
    @NameInMap("DefaultAlgo")
    public String defaultAlgo;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public String enabled;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;: &quot;sha256&quot;},
     *         {&quot;name&quot;:&quot;sm4-128-gcm&quot;}]</p>
     */
    @NameInMap("MaskingAlgo")
    public String maskingAlgo;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RuleConfig")
    public ModifyMaskingRulesRequestRuleConfig ruleConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rulename1</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static ModifyMaskingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaskingRulesRequest self = new ModifyMaskingRulesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMaskingRulesRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyMaskingRulesRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public ModifyMaskingRulesRequest setDefaultAlgo(String defaultAlgo) {
        this.defaultAlgo = defaultAlgo;
        return this;
    }
    public String getDefaultAlgo() {
        return this.defaultAlgo;
    }

    public ModifyMaskingRulesRequest setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }
    public String getEnabled() {
        return this.enabled;
    }

    public ModifyMaskingRulesRequest setMaskingAlgo(String maskingAlgo) {
        this.maskingAlgo = maskingAlgo;
        return this;
    }
    public String getMaskingAlgo() {
        return this.maskingAlgo;
    }

    public ModifyMaskingRulesRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyMaskingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyMaskingRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyMaskingRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyMaskingRulesRequest setRuleConfig(ModifyMaskingRulesRequestRuleConfig ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public ModifyMaskingRulesRequestRuleConfig getRuleConfig() {
        return this.ruleConfig;
    }

    public ModifyMaskingRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public static class ModifyMaskingRulesRequestRuleConfig extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<String> columns;

        @NameInMap("Databases")
        public java.util.List<String> databases;

        @NameInMap("Tables")
        public java.util.List<String> tables;

        public static ModifyMaskingRulesRequestRuleConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyMaskingRulesRequestRuleConfig self = new ModifyMaskingRulesRequestRuleConfig();
            return TeaModel.build(map, self);
        }

        public ModifyMaskingRulesRequestRuleConfig setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public ModifyMaskingRulesRequestRuleConfig setDatabases(java.util.List<String> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<String> getDatabases() {
            return this.databases;
        }

        public ModifyMaskingRulesRequestRuleConfig setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

    }

}

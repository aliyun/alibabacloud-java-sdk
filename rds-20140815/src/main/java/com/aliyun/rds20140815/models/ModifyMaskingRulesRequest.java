// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyMaskingRulesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DefaultAlgo")
    public String defaultAlgo;

    @NameInMap("Enabled")
    public String enabled;

    @NameInMap("MaskingAlgo")
    public String maskingAlgo;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RuleConfig")
    public ModifyMaskingRulesRequestRuleConfig ruleConfig;

    /**
     * <p>This parameter is required.</p>
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

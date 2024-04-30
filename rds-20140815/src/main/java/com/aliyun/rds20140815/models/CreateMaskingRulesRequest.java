// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMaskingRulesRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DefaultAlgo")
    public String defaultAlgo;

    @NameInMap("MaskingAlgo")
    public String maskingAlgo;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RuleConfig")
    public CreateMaskingRulesRequestRuleConfig ruleConfig;

    @NameInMap("RuleName")
    public String ruleName;

    public static CreateMaskingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMaskingRulesRequest self = new CreateMaskingRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateMaskingRulesRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateMaskingRulesRequest setDefaultAlgo(String defaultAlgo) {
        this.defaultAlgo = defaultAlgo;
        return this;
    }
    public String getDefaultAlgo() {
        return this.defaultAlgo;
    }

    public CreateMaskingRulesRequest setMaskingAlgo(String maskingAlgo) {
        this.maskingAlgo = maskingAlgo;
        return this;
    }
    public String getMaskingAlgo() {
        return this.maskingAlgo;
    }

    public CreateMaskingRulesRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateMaskingRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMaskingRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateMaskingRulesRequest setRuleConfig(CreateMaskingRulesRequestRuleConfig ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public CreateMaskingRulesRequestRuleConfig getRuleConfig() {
        return this.ruleConfig;
    }

    public CreateMaskingRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public static class CreateMaskingRulesRequestRuleConfig extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<String> columns;

        @NameInMap("Databases")
        public java.util.List<String> databases;

        @NameInMap("Tables")
        public java.util.List<String> tables;

        public static CreateMaskingRulesRequestRuleConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMaskingRulesRequestRuleConfig self = new CreateMaskingRulesRequestRuleConfig();
            return TeaModel.build(map, self);
        }

        public CreateMaskingRulesRequestRuleConfig setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public CreateMaskingRulesRequestRuleConfig setDatabases(java.util.List<String> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<String> getDatabases() {
            return this.databases;
        }

        public CreateMaskingRulesRequestRuleConfig setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

    }

}

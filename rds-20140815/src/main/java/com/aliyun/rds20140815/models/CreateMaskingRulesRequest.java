// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMaskingRulesRequest extends TeaModel {
    /**
     * <p>instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n8t18o3*****d5</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Database name</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>Name of the default encryption or masking algorithm</p>
     * 
     * <strong>example:</strong>
     * <p>aes-128-gcm</p>
     */
    @NameInMap("DefaultAlgo")
    public String defaultAlgo;

    /**
     * <p>Rule algorithm. Multiple algorithms can be selected. Masking Algorithm can include additional parameters. Format: {name: algorithm1}, {name: algorithm2, params: {encryption position, number of encrypted characters}}</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;: &quot;aes-128-gcm&quot;},
     *         {&quot;name&quot;:&quot;sm4-128-gcm&quot;}]</p>
     */
    @NameInMap("MaskingAlgo")
    public String maskingAlgo;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Region ID</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Rule configuration, in JSON string format, containing matching rules for databases, tables, and columns</p>
     */
    @NameInMap("RuleConfig")
    public CreateMaskingRulesRequestRuleConfig ruleConfig;

    /**
     * <p>Rule Name (only one rule name is supported per request)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rulename1</p>
     */
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

    public CreateMaskingRulesRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
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

    public CreateMaskingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
        /**
         * <p>List of columns</p>
         */
        @NameInMap("Columns")
        public java.util.List<String> columns;

        /**
         * <p>List of databases</p>
         */
        @NameInMap("Databases")
        public java.util.List<String> databases;

        /**
         * <p>List of tables</p>
         */
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

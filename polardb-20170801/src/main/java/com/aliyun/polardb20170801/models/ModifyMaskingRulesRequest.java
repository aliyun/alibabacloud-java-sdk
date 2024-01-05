// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyMaskingRulesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~98094~~) operation to query the details of the clusters that belong to your Alibaba Cloud account, such as cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable the specified masking rule. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>> This parameter is valid only when the `RuleNameList` parameter is specfied.</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The parameter that is used to specify the masking rule that you want to modify and the value in the JSON format. All parameter values are of the string type. Example: `{"auto": {"databases": ["db1"], "tables": ["tb1"], "columns": ["c1,c2"] }, "description": "This rule will be applied to the columns c1 and c2 in table t1", "enabled": true, "applies_to": ["user"]}`. Parameters in the function:</p>
     * <br>
     * <p>*   `"auto"`: specifies that the dynamic masking algorithm is supported. This parameter is required.</p>
     * <p>*   `"databases"`: Optional. The names of databases to which the masking rule is applied. Separate the names with commas (,). If you leave this parameter empty, the masking rule applies to all databases in the cluster.</p>
     * <p>*   `"tables"`: Optional. The names of tables to which the masking rule is applied. Separate the names with commas (,). If you leave this parameter empty, the rule applies to all tables in the cluster.</p>
     * <p>*   `"columns"`: Required. The names of fields to which the masking rule is applied. Separate the names with commas (,).</p>
     * <p>*   `"description"`: Optional. The description of the masking rule. The description can be up to 64 characters in length.</p>
     * <p>*   `"enabled"`: Required. Specifies whether to enable the masking rule. Valid values: **true** and **false**.</p>
     * <p>*   `"applies_to"`: The names of database accounts to which the masking rule is applied. Separate the names with commas (,).</p>
     * <p>*   `"exempted"`: The names of database accounts to which the masking rule is not applied. Separate the names with commas (,).</p>
     * <br>
     * <p>>- If you specify `RuleName`, `RuleConfig` parameter is required. </p>
     * <p>>- You need to select either `"applies_to"` or `"exempted"`.</p>
     */
    @NameInMap("RuleConfig")
    public String ruleConfig;

    /**
     * <p>The name of the data masking rule. You can specify only one rule name at a time.</p>
     * <br>
     * <p>>- You can call the [DescribeMaskingRules](~~212573~~) operation to query the details of all masking rules for a specified cluster, such as the names of the masking rules.</p>
     * <p>>- If the rule name does not exist in the cluster, the system automatically creates a masking rule based on the name and the value of `RuleConfig`.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The list of masking rule names. You can specify one or more masking rules at a time. Separate the masking rule names with commas (,).</p>
     * <br>
     * <p>> You must specify either the `RuleName` or `RuleNameList` parameter.</p>
     */
    @NameInMap("RuleNameList")
    public String ruleNameList;

    @NameInMap("RuleVersion")
    public String ruleVersion;

    public static ModifyMaskingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaskingRulesRequest self = new ModifyMaskingRulesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMaskingRulesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyMaskingRulesRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public ModifyMaskingRulesRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public ModifyMaskingRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ModifyMaskingRulesRequest setRuleNameList(String ruleNameList) {
        this.ruleNameList = ruleNameList;
        return this;
    }
    public String getRuleNameList() {
        return this.ruleNameList;
    }

    public ModifyMaskingRulesRequest setRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
        return this;
    }
    public String getRuleVersion() {
        return this.ruleVersion;
    }

}

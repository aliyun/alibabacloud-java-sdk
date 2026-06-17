// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyMaskingRulesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters in your account, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The default algorithm.</p>
     * <blockquote>
     * <p>You must specify either MaskingAlgo or DefaultAIgo.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aes-128-gcm</p>
     */
    @NameInMap("DefaultAlgo")
    public String defaultAlgo;

    /**
     * <p>Enables or disables the specified data masking rules. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables the specified rules.</p>
     * </li>
     * <li><p><strong>false</strong>: disables the specified rules.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter applies only when the <code>RuleNameList</code> parameter is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The type of rule to modify. Valid values:</p>
     * <p>v1: Modifies a data masking rule.
     * v2: Modifies an encryption rule.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("InterfaceVersion")
    public String interfaceVersion;

    /**
     * <p>The masking algorithm. Specify one or more algorithms and their parameters. Format: <code>[{ &quot;name&quot;: &quot;algorithm_name&quot;, &quot;params&quot;: {&quot;key&quot;: &quot;value&quot;} }]</code></p>
     * 
     * <strong>example:</strong>
     * <p>[{
     * &quot;name&quot;: &quot;aes-128-gcm&quot;
     * }]</p>
     */
    @NameInMap("MaskingAlgo")
    public String maskingAlgo;

    /**
     * <p>A JSON string that specifies the rule configuration. Example: <code>{&quot;auto&quot;: {&quot;databases&quot;: [&quot;db1&quot;], &quot;tables&quot;: [&quot;tb1&quot;], &quot;columns&quot;: [&quot;c1,c2&quot;] }, &quot;description&quot;: &quot;This rule will be applied to the columns c1 and c2 in table t1&quot;, &quot;enabled&quot;: true, &quot;applies_to&quot;: [&quot;user&quot;]}</code>. The JSON string includes the following fields:</p>
     * <ul>
     * <li><p><code>&quot;auto&quot;</code>: Required. The object that contains the configuration for the dynamic data masking algorithm.</p>
     * </li>
     * <li><p><code>&quot;databases&quot;</code>: Optional. The databases to which the rule applies. Separate multiple database names with a comma (,). If this parameter is omitted, the rule applies to all databases in the cluster.</p>
     * </li>
     * <li><p><code>&quot;tables&quot;</code>: Optional. The tables to which the rule applies. Separate multiple table names with a comma (,). If this parameter is omitted, the rule applies to all tables in the cluster.</p>
     * </li>
     * <li><p><code>&quot;columns&quot;</code>: Required. The columns to which the rule applies. Separate multiple column names with a comma (,).</p>
     * </li>
     * <li><p><code>&quot;description&quot;</code>: Optional. The rule description, up to 64 characters in length.</p>
     * </li>
     * <li><p><code>&quot;enabled&quot;</code>: Required. Specifies whether the data masking rule is enabled. Valid values: <strong>true</strong> (enabled) and <strong>false</strong> (disabled).</p>
     * </li>
     * <li><p><code>&quot;applies_to&quot;</code>: The database accounts to which the rule applies. Separate multiple account names with a comma (,).</p>
     * </li>
     * <li><p><code>&quot;exempted&quot;</code>: The database accounts that are exempt from the rule. Separate multiple account names with a comma (,).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If you specify the <code>RuleName</code> parameter, you must also specify the <code>RuleConfig</code> parameter.</p>
     * </li>
     * <li><p>You must specify either <code>&quot;applies_to&quot;</code> or <code>&quot;exempted&quot;</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;auto&quot;: {&quot;databases&quot;: [&quot;db1&quot;], &quot;tables&quot;: [&quot;tb1&quot;], &quot;columns&quot;: [&quot;c1,c2&quot;] }, &quot;description&quot;: &quot;This rule will be applied to the columns c1 and c2 in table t1&quot;, &quot;enabled&quot;: true, &quot;applies_to&quot;: [&quot;user&quot;]}</p>
     */
    @NameInMap("RuleConfig")
    public String ruleConfig;

    /**
     * <p>The name of the data masking rule. You can specify only one rule name at a time.</p>
     * <blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/212573.html">DescribeMaskingRules</a> operation to query the details of all data masking rules in the target cluster, including rule names.</p>
     * </li>
     * <li><p>If a rule with the specified name does not exist, the system creates a new one based on the provided <code>RuleConfig</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testrule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>A comma-separated list of data masking rule names.</p>
     * <blockquote>
     * <p>You must specify either the <code>RuleName</code> or <code>RuleNameList</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testrule</p>
     */
    @NameInMap("RuleNameList")
    public String ruleNameList;

    /**
     * <p>The version of the data masking rule. Valid values:</p>
     * <ul>
     * <li><p>v1 (default)</p>
     * </li>
     * <li><p>v2</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
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

    public ModifyMaskingRulesRequest setDefaultAlgo(String defaultAlgo) {
        this.defaultAlgo = defaultAlgo;
        return this;
    }
    public String getDefaultAlgo() {
        return this.defaultAlgo;
    }

    public ModifyMaskingRulesRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public ModifyMaskingRulesRequest setInterfaceVersion(String interfaceVersion) {
        this.interfaceVersion = interfaceVersion;
        return this;
    }
    public String getInterfaceVersion() {
        return this.interfaceVersion;
    }

    public ModifyMaskingRulesRequest setMaskingAlgo(String maskingAlgo) {
        this.maskingAlgo = maskingAlgo;
        return this;
    }
    public String getMaskingAlgo() {
        return this.maskingAlgo;
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

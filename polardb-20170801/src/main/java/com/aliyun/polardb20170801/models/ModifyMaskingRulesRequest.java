// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyMaskingRulesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of the clusters that belong to your Alibaba Cloud account, such as cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable the specified masking rule. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only when the <code>RuleNameList</code> parameter is specfied.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The parameter that is used to specify the masking rule that you want to modify and the value in the JSON format. All parameter values are of the string type. Example: <code>{&quot;auto&quot;: {&quot;databases&quot;: [&quot;db1&quot;], &quot;tables&quot;: [&quot;tb1&quot;], &quot;columns&quot;: [&quot;c1,c2&quot;] }, &quot;description&quot;: &quot;This rule will be applied to the columns c1 and c2 in table t1&quot;, &quot;enabled&quot;: true, &quot;applies_to&quot;: [&quot;user&quot;]}</code>. Parameters in the function:</p>
     * <ul>
     * <li><code>&quot;auto&quot;</code>: specifies that the dynamic masking algorithm is supported. This parameter is required.</li>
     * <li><code>&quot;databases&quot;</code>: Optional. The names of databases to which the masking rule is applied. Separate the names with commas (,). If you leave this parameter empty, the masking rule applies to all databases in the cluster.</li>
     * <li><code>&quot;tables&quot;</code>: Optional. The names of tables to which the masking rule is applied. Separate the names with commas (,). If you leave this parameter empty, the rule applies to all tables in the cluster.</li>
     * <li><code>&quot;columns&quot;</code>: Required. The names of fields to which the masking rule is applied. Separate the names with commas (,).</li>
     * <li><code>&quot;description&quot;</code>: Optional. The description of the masking rule. The description can be up to 64 characters in length.</li>
     * <li><code>&quot;enabled&quot;</code>: Required. Specifies whether to enable the masking rule. Valid values: <strong>true</strong> and <strong>false</strong>.</li>
     * <li><code>&quot;applies_to&quot;</code>: The names of database accounts to which the masking rule is applied. Separate the names with commas (,).</li>
     * <li><code>&quot;exempted&quot;</code>: The names of database accounts to which the masking rule is not applied. Separate the names with commas (,).</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you specify <code>RuleName</code>, <code>RuleConfig</code> parameter is required. </li>
     * <li>You need to select either <code>&quot;applies_to&quot;</code> or <code>&quot;exempted&quot;</code>.</li>
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
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/212573.html">DescribeMaskingRules</a> operation to query the details of all masking rules for a specified cluster, such as the names of the masking rules.</li>
     * <li>If the rule name does not exist in the cluster, the system automatically creates a masking rule based on the name and the value of <code>RuleConfig</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testrule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The list of masking rule names. You can specify one or more masking rules at a time. Separate the masking rule names with commas (,).</p>
     * <blockquote>
     * <p>You must specify either the <code>RuleName</code> or <code>RuleNameList</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testrule</p>
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

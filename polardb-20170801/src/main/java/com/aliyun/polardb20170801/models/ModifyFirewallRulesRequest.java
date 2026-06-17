// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyFirewallRulesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>A JSON string that contains the configuration parameters of the firewall rule to modify and their values. The parameter values are strings. Example: <code>{ &quot;id&quot;: &quot;test&quot;, &quot;enabled&quot;: &quot;true&quot;, &quot;mode&quot;: &quot;Defending&quot;, &quot;users&quot;: { &quot;applies_to&quot;: [] }, &quot;endpoint&quot;: &quot;[{&quot;EndpointName&quot;:&quot;pe-***************&quot;,&quot;EndpointType&quot;:&quot;Cluster&quot;,&quot;DBEndpointDescription&quot;:&quot;Cluster Endpoint&quot;},{&quot;EndpointName&quot;:&quot;pe-***************&quot;,&quot;EndpointType&quot;:&quot;Custom&quot;,&quot;DBEndpointDescription&quot;:&quot;pc-***************&quot;},{&quot;EndpointName&quot;:&quot;pe-***************&quot;,&quot;EndpointType&quot;:&quot;Custom&quot;,&quot;DBEndpointDescription&quot;:&quot;pc-***************&quot;}]&quot;, &quot;type&quot;: &quot;BlackList&quot;, &quot;sub_rules&quot;: [] }, &quot;RuleName&quot;: &quot;test&quot; }</code>. The parameters are described as follows:</p>
     * <ul>
     * <li><p><code>&quot;id&quot;</code>: Required. The name of the firewall rule.</p>
     * </li>
     * <li><p><code>&quot;databases&quot;</code>: Optional. The names of the databases to which the rule applies. You can specify multiple database names. Separate the names with commas (,). If you leave this parameter empty, the rule applies to all databases in the cluster.</p>
     * </li>
     * <li><p><code>&quot;tables&quot;</code>: Optional. The names of the tables to which the rule applies. You can specify multiple table names. Separate the names with commas (,). If you leave this parameter empty, the rule applies to all tables in the cluster.</p>
     * </li>
     * <li><p><code>&quot;columns&quot;</code>: Required. The names of the fields to which the rule applies. You can specify multiple field names. Separate the names with commas (,).</p>
     * </li>
     * <li><p><code>&quot;description&quot;</code>: Optional. The description of the data masking rule. The description can be up to 64 characters in length.</p>
     * </li>
     * <li><p><code>&quot;enabled&quot;</code>: Required. Specifies whether to enable or disable the data masking rule. Valid values: <strong>true</strong> (enable) and <strong>false</strong> (disable).</p>
     * </li>
     * <li><p><code>&quot;applies_to&quot;</code>: The names of the database accounts to which the rule applies. You can specify multiple database account names. Separate the names with commas (,).</p>
     * </li>
     * <li><p><code>&quot;exempted&quot;</code>: The names of the database accounts to which the rule does not apply. You can specify multiple database account names. Separate the names with commas (,).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If you specify the <code>RuleName</code> parameter, the <code>RuleConfig</code> parameter is required.</p>
     * </li>
     * <li><p>You must specify either <code>&quot;applies_to&quot;</code> or <code>&quot;exempted&quot;</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;id&quot;:&quot;test&quot;,&quot;enabled&quot;:&quot;true&quot;,&quot;mode&quot;:&quot;Collecting&quot;,&quot;users&quot;:{&quot;applies_to&quot;:[]},&quot;endpoint&quot;:&quot;[{&quot;EndpointName&quot;:&quot;pe-<strong><strong><strong><strong><strong><strong>&quot;,&quot;EndpointType&quot;:&quot;Cluster&quot;,&quot;DBEndpointDescription&quot;:&quot;Cluster Address&quot;},{&quot;EndpointName&quot;:&quot;pe-</strong></strong></strong></strong></strong></strong>&quot;,&quot;EndpointType&quot;:&quot;Custom&quot;,&quot;DBEndpointDescription&quot;:&quot;pc-<strong><strong><strong><strong><strong><strong>&quot;},{&quot;EndpointName&quot;:&quot;pe-</strong></strong></strong></strong></strong></strong>&quot;,&quot;EndpointType&quot;:&quot;Custom&quot;,&quot;DBEndpointDescription&quot;:&quot;pc-************K&quot;}]&quot;,&quot;type&quot;:&quot;WhiteList&quot;}</p>
     */
    @NameInMap("RuleConfig")
    public String ruleConfig;

    /**
     * <p>The name of the firewall rule. You can specify only one rule name at a time.</p>
     * <blockquote>
     * <ul>
     * <li><p>Call the <a href="https://help.aliyun.com/document_detail/212573.html">DescribeFirewallRules</a> operation to query the details of all firewall rules for the target cluster, including the rule names.</p>
     * </li>
     * <li><p>If the specified rule name does not exist in the current cluster, the system automatically creates a new firewall rule based on the rule name and the value of <code>RuleConfig</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static ModifyFirewallRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirewallRulesRequest self = new ModifyFirewallRulesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFirewallRulesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyFirewallRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyFirewallRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyFirewallRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyFirewallRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyFirewallRulesRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public ModifyFirewallRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}

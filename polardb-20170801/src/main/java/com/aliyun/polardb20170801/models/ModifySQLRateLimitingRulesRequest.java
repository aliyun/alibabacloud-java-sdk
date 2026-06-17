// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifySQLRateLimitingRulesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
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
     * <p>The configuration parameters and their values for the SQL throttling rule to be modified. This must be a JSON string, and the parameter values must be strings. For example: <code>{&quot;id&quot;:&quot;test&quot;,&quot;enabled&quot;:&quot;true&quot;,&quot;match_mode&quot;:&quot;0&quot;,&quot;template&quot;:&quot;dXBkYXRlIHQgc2V0IGEgPSAxIHdoZXJlIGlkID0gMQ==&quot;,&quot;user&quot;:&quot;&quot;,&quot;database&quot;:&quot;&quot;,&quot;waiting&quot;:1024,&quot;endpoint&quot;:&quot;[{&quot;EndpointName&quot;:&quot;pe-***********&quot;,&quot;EndpointType&quot;:&quot;Cluster&quot;,&quot;DBEndpointDescription&quot;:&quot;Cluster Address&quot;}]&quot;,&quot;throttle_mode&quot;:0,&quot;concurrency&quot;:1}</code>. The JSON string contains the following parameters:</p>
     * <ul>
     * <li><p><code>&quot;id&quot;</code>: Required. The name of the throttling rule. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>Cannot exceed 30 characters.</p>
     * </li>
     * <li><p>Must consist of uppercase letters, lowercase letters, and digits.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;id&quot;:&quot;test&quot;,&quot;enabled&quot;:&quot;true&quot;,&quot;match_mode&quot;:&quot;0&quot;,&quot;template&quot;:&quot;dXBkYXRlIHQgc2V0IGEgPSAxIHdoZXJlIGlkID0gMQ==&quot;,&quot;user&quot;:&quot;&quot;,&quot;database&quot;:&quot;&quot;,&quot;waiting&quot;:1024,&quot;endpoint&quot;:&quot;[{&quot;EndpointName&quot;:&quot;pe-***********&quot;,&quot;EndpointType&quot;:&quot;Cluster&quot;,&quot;DBEndpointDescription&quot;:&quot;Cluster Address&quot;}]&quot;,&quot;throttle_mode&quot;:0,&quot;concurrency&quot;:1}</p>
     */
    @NameInMap("RuleConfig")
    public String ruleConfig;

    /**
     * <p>The name of the SQL throttling rule. Only one rule name can be specified at a time.</p>
     * <blockquote>
     * <ul>
     * <li><p>Call the <a href="https://help.aliyun.com/document_detail/212573.html">DescribeSQLRateLimitingRules</a> operation to view the details of all SQL throttling rules for the target cluster, including the rule names.</p>
     * </li>
     * <li><p>If the specified rule name does not exist in the cluster, the system automatically creates a new SQL throttling rule based on the rule name and the value of the <code>RuleConfig</code> parameter.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testrule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static ModifySQLRateLimitingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLRateLimitingRulesRequest self = new ModifySQLRateLimitingRulesRequest();
        return TeaModel.build(map, self);
    }

    public ModifySQLRateLimitingRulesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifySQLRateLimitingRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySQLRateLimitingRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySQLRateLimitingRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySQLRateLimitingRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySQLRateLimitingRulesRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public ModifySQLRateLimitingRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}

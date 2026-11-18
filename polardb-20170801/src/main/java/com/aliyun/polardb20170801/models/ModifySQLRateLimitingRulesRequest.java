// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifySQLRateLimitingRulesRequest extends TeaModel {
    /**
     * <p>The cluster ID. Call instructions: Engine compatibility note: Explicitly list the database types that support SQL throttling, such as PolarDB for MySQL 8.0 only, in the description of the DBClusterId parameter or the API prerequisites.</p>
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
     * <p>The JSON string of the configuration parameters and their values for the SQL throttling rule to be modified. All parameter values are of the string type. Example: <code>{&quot;id&quot;:&quot;test&quot;,&quot;enabled&quot;:&quot;true&quot;,&quot;match_mode&quot;:&quot;0&quot;,&quot;template&quot;:&quot;dXBkYXRlIHQgc2V0IGEgPSAxIHdoZXJlIGlkID0gMQ==&quot;,&quot;user&quot;:&quot;&quot;,&quot;database&quot;:&quot;&quot;,&quot;waiting&quot;:1024,&quot;endpoint&quot;:&quot;[{&quot;EndpointName&quot;:&quot;pe-***********&quot;,&quot;EndpointType&quot;:&quot;Cluster&quot;,&quot;DBEndpointDescription&quot;:&quot;Cluster Address&quot;}]&quot;,&quot;throttle_mode&quot;:0,&quot;concurrency&quot;:1}</code>. Parameters:</p>
     * <ul>
     * <li><code>&quot;id&quot;</code>: Required. The name of the throttling rule. The name must meet the following requirements:<ul>
     * <li>The name cannot exceed 30 characters in length.</li>
     * <li>The name must consist of uppercase letters, lowercase letters, and digits. Call instructions: Complete sub-parameter documentation: Annotate the type, value range, business meaning, and conditional dependencies for each field, such as the enumeration values and meanings of match_mode, the values and meanings of throttle_mode, the valid ranges of waiting and concurrency, and the conditional requirement rules for endpoint.</li>
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
     * <p>The name of the SQL throttling rule. You can specify only one rule name at a time.</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/212573.html">DescribeSQLRateLimitingRules</a> operation to query the details of all SQL throttling rules in the specified cluster, including the rule names.</li>
     * <li>If the specified rule name does not exist in the current cluster, the system automatically creates a new SQL throttling rule based on the name and the value of <code>RuleConfig</code>.</li>
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

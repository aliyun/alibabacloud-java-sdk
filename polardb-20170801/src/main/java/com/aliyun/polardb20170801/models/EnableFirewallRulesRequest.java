// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableFirewallRulesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable or disable the specified firewall rules. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the specified firewall rules.</li>
     * <li><strong>false</strong>: disables the specified firewall rules.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only when you specify the <strong>RuleNameList</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the firewall rule that you want to enable for the cluster. You can specify multiple firewall rules at a time. Separate multiple rules with commas (,).</p>
     * <blockquote>
     * <p>You can call the <strong>DescribeFirewallRules</strong> operation to query the details of all firewall rules that are applicable to a cluster, such as rule names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test111</p>
     */
    @NameInMap("RuleNameList")
    public String ruleNameList;

    public static EnableFirewallRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableFirewallRulesRequest self = new EnableFirewallRulesRequest();
        return TeaModel.build(map, self);
    }

    public EnableFirewallRulesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public EnableFirewallRulesRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public EnableFirewallRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EnableFirewallRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableFirewallRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EnableFirewallRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EnableFirewallRulesRequest setRuleNameList(String ruleNameList) {
        this.ruleNameList = ruleNameList;
        return this;
    }
    public String getRuleNameList() {
        return this.ruleNameList;
    }

}

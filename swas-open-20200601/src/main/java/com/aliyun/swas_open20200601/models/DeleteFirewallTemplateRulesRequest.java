// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteFirewallTemplateRulesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the firewall template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ft-bcf1a7hrdq717****</p>
     */
    @NameInMap("FirewallTemplateId")
    public String firewallTemplateId;

    /**
     * <p>The IDs of the firewall template rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FirewallTemplateRuleId")
    public java.util.List<String> firewallTemplateRuleId;

    /**
     * <p>The ID of the simple application server to which the firewall template is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>9ae7106e68eb4402b0dcbd48a9de****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteFirewallTemplateRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFirewallTemplateRulesRequest self = new DeleteFirewallTemplateRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFirewallTemplateRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteFirewallTemplateRulesRequest setFirewallTemplateId(String firewallTemplateId) {
        this.firewallTemplateId = firewallTemplateId;
        return this;
    }
    public String getFirewallTemplateId() {
        return this.firewallTemplateId;
    }

    public DeleteFirewallTemplateRulesRequest setFirewallTemplateRuleId(java.util.List<String> firewallTemplateRuleId) {
        this.firewallTemplateRuleId = firewallTemplateRuleId;
        return this;
    }
    public java.util.List<String> getFirewallTemplateRuleId() {
        return this.firewallTemplateRuleId;
    }

    public DeleteFirewallTemplateRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteFirewallTemplateRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ApplyFirewallTemplateRequest extends TeaModel {
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
     * <p>The IDs of the simple application servers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ApplyFirewallTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyFirewallTemplateRequest self = new ApplyFirewallTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ApplyFirewallTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ApplyFirewallTemplateRequest setFirewallTemplateId(String firewallTemplateId) {
        this.firewallTemplateId = firewallTemplateId;
        return this;
    }
    public String getFirewallTemplateId() {
        return this.firewallTemplateId;
    }

    public ApplyFirewallTemplateRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ApplyFirewallTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

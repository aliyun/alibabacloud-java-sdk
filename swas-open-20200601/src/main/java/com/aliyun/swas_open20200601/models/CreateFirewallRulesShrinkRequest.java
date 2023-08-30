// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallRulesShrinkRequest extends TeaModel {
    /**
     * <p>The client token.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The remarks of the firewall rule.</p>
     */
    @NameInMap("FirewallRules")
    public String firewallRulesShrink;

    /**
     * <p>The ID of the simple application server.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateFirewallRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallRulesShrinkRequest self = new CreateFirewallRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFirewallRulesShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFirewallRulesShrinkRequest setFirewallRulesShrink(String firewallRulesShrink) {
        this.firewallRulesShrink = firewallRulesShrink;
        return this;
    }
    public String getFirewallRulesShrink() {
        return this.firewallRulesShrink;
    }

    public CreateFirewallRulesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateFirewallRulesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

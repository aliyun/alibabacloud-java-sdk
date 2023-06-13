// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallRulesShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("FirewallRules")
    public String firewallRulesShrink;

    @NameInMap("InstanceId")
    public String instanceId;

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

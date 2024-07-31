// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallRulesShrinkRequest extends TeaModel {
    /**
     * <p>The client token.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Details about the firewall rules.</p>
     */
    @NameInMap("FirewallRules")
    public String firewallRulesShrink;

    /**
     * <p>The ID of the simple application server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ace0706b2ac4454d984295a94213****</p>
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

    /**
     * <p>The tags that you want to add to the firewall. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateFirewallRulesShrinkRequestTag> tag;

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

    public CreateFirewallRulesShrinkRequest setTag(java.util.List<CreateFirewallRulesShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateFirewallRulesShrinkRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateFirewallRulesShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key. Valid values of N: 1 to 20.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: 1 to 20.</p>
         * <p>The tag value can be an empty string. The tag value can be up to 64 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateFirewallRulesShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateFirewallRulesShrinkRequestTag self = new CreateFirewallRulesShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateFirewallRulesShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateFirewallRulesShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallRulesRequest extends TeaModel {
    /**
     * <p>The client token.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The remarks of the firewall rule.</p>
     */
    @NameInMap("FirewallRules")
    public java.util.List<CreateFirewallRulesRequestFirewallRules> firewallRules;

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

    public static CreateFirewallRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallRulesRequest self = new CreateFirewallRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateFirewallRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFirewallRulesRequest setFirewallRules(java.util.List<CreateFirewallRulesRequestFirewallRules> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }
    public java.util.List<CreateFirewallRulesRequestFirewallRules> getFirewallRules() {
        return this.firewallRules;
    }

    public CreateFirewallRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateFirewallRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateFirewallRulesRequestFirewallRules extends TeaModel {
        @NameInMap("Port")
        public String port;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RuleProtocol")
        public String ruleProtocol;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        public static CreateFirewallRulesRequestFirewallRules build(java.util.Map<String, ?> map) throws Exception {
            CreateFirewallRulesRequestFirewallRules self = new CreateFirewallRulesRequestFirewallRules();
            return TeaModel.build(map, self);
        }

        public CreateFirewallRulesRequestFirewallRules setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public CreateFirewallRulesRequestFirewallRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateFirewallRulesRequestFirewallRules setRuleProtocol(String ruleProtocol) {
            this.ruleProtocol = ruleProtocol;
            return this;
        }
        public String getRuleProtocol() {
            return this.ruleProtocol;
        }

        public CreateFirewallRulesRequestFirewallRules setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyFirewallRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Port")
    public String port;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleProtocol")
    public String ruleProtocol;

    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    public static ModifyFirewallRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirewallRuleRequest self = new ModifyFirewallRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFirewallRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyFirewallRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyFirewallRuleRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ModifyFirewallRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFirewallRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifyFirewallRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ModifyFirewallRuleRequest setRuleProtocol(String ruleProtocol) {
        this.ruleProtocol = ruleProtocol;
        return this;
    }
    public String getRuleProtocol() {
        return this.ruleProtocol;
    }

    public ModifyFirewallRuleRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

}

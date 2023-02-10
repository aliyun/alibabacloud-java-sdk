// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleSwitchRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RuleIds")
    public String ruleIds;

    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    public static ModifyInterceptionRuleSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionRuleSwitchRequest self = new ModifyInterceptionRuleSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionRuleSwitchRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyInterceptionRuleSwitchRequest setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

    public ModifyInterceptionRuleSwitchRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

}

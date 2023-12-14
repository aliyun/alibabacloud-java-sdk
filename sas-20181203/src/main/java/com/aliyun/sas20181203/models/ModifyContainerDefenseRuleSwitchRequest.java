// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerDefenseRuleSwitchRequest extends TeaModel {
    /**
     * <p>The IDs of rules.</p>
     */
    @NameInMap("RuleIds")
    public java.util.List<Long> ruleIds;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <br>
     * <p>*   **1**: enabled</p>
     * <p>*   **0**: disabled</p>
     */
    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    public static ModifyContainerDefenseRuleSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerDefenseRuleSwitchRequest self = new ModifyContainerDefenseRuleSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyContainerDefenseRuleSwitchRequest setRuleIds(java.util.List<Long> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

    public ModifyContainerDefenseRuleSwitchRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

}

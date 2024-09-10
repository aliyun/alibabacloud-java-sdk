// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerDefenseRuleSwitchRequest extends TeaModel {
    /**
     * <p>The IDs of the rules.</p>
     */
    @NameInMap("RuleIds")
    public java.util.List<Long> ruleIds;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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

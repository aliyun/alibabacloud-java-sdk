// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerDefenseRuleShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("RuleAction")
    public Integer ruleAction;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("Scope")
    public java.util.List<ModifyContainerDefenseRuleShrinkRequestScope> scope;

    @NameInMap("Whitelist")
    public String whitelistShrink;

    public static ModifyContainerDefenseRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerDefenseRuleShrinkRequest self = new ModifyContainerDefenseRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyContainerDefenseRuleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyContainerDefenseRuleShrinkRequest setRuleAction(Integer ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public Integer getRuleAction() {
        return this.ruleAction;
    }

    public ModifyContainerDefenseRuleShrinkRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyContainerDefenseRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ModifyContainerDefenseRuleShrinkRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public ModifyContainerDefenseRuleShrinkRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public ModifyContainerDefenseRuleShrinkRequest setScope(java.util.List<ModifyContainerDefenseRuleShrinkRequestScope> scope) {
        this.scope = scope;
        return this;
    }
    public java.util.List<ModifyContainerDefenseRuleShrinkRequestScope> getScope() {
        return this.scope;
    }

    public ModifyContainerDefenseRuleShrinkRequest setWhitelistShrink(String whitelistShrink) {
        this.whitelistShrink = whitelistShrink;
        return this;
    }
    public String getWhitelistShrink() {
        return this.whitelistShrink;
    }

    public static class ModifyContainerDefenseRuleShrinkRequestScope extends TeaModel {
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        public static ModifyContainerDefenseRuleShrinkRequestScope build(java.util.Map<String, ?> map) throws Exception {
            ModifyContainerDefenseRuleShrinkRequestScope self = new ModifyContainerDefenseRuleShrinkRequestScope();
            return TeaModel.build(map, self);
        }

        public ModifyContainerDefenseRuleShrinkRequestScope setAllNamespace(Integer allNamespace) {
            this.allNamespace = allNamespace;
            return this;
        }
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        public ModifyContainerDefenseRuleShrinkRequestScope setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ModifyContainerDefenseRuleShrinkRequestScope setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddContainerDefenseRuleShrinkRequest extends TeaModel {
    /**
     * <p>The description of the rule.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The action that is performed when the rule is hit. Valid values:</p>
     * <br>
     * <p>*   **1**: alert</p>
     * <p>*   **2**: block</p>
     */
    @NameInMap("RuleAction")
    public Integer ruleAction;

    /**
     * <p>The ID of the rule. You do not need to manually specify the ID.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The switch of the rule. Valid values:</p>
     * <br>
     * <p>*   **0**: off</p>
     * <p>*   **1**: on</p>
     */
    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    /**
     * <p>The rule type. Valid values:</p>
     * <br>
     * <p>*   2: user-defined rules</p>
     * <br>
     * <p>> Only the value 2 is supported.</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The scope.</p>
     */
    @NameInMap("Scope")
    public java.util.List<AddContainerDefenseRuleShrinkRequestScope> scope;

    /**
     * <p>The whitelist.</p>
     */
    @NameInMap("Whitelist")
    public String whitelistShrink;

    public static AddContainerDefenseRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContainerDefenseRuleShrinkRequest self = new AddContainerDefenseRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddContainerDefenseRuleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddContainerDefenseRuleShrinkRequest setRuleAction(Integer ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public Integer getRuleAction() {
        return this.ruleAction;
    }

    public AddContainerDefenseRuleShrinkRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public AddContainerDefenseRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public AddContainerDefenseRuleShrinkRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public AddContainerDefenseRuleShrinkRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public AddContainerDefenseRuleShrinkRequest setScope(java.util.List<AddContainerDefenseRuleShrinkRequestScope> scope) {
        this.scope = scope;
        return this;
    }
    public java.util.List<AddContainerDefenseRuleShrinkRequestScope> getScope() {
        return this.scope;
    }

    public AddContainerDefenseRuleShrinkRequest setWhitelistShrink(String whitelistShrink) {
        this.whitelistShrink = whitelistShrink;
        return this;
    }
    public String getWhitelistShrink() {
        return this.whitelistShrink;
    }

    public static class AddContainerDefenseRuleShrinkRequestScope extends TeaModel {
        /**
         * <p>Specifies whether to include all namespaces. Valid values:</p>
         * <br>
         * <p>*   **0**: You can use the Namespaces parameter to specify the namespaces to include.</p>
         * <p>*   **1**: All namespaces are included.</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The ID of the cluster.</p>
         * <br>
         * <p>>  You can call the [DescribeGroupedContainerInstances](https://help.aliyun.com/document_detail/182997.html) operation to query the IDs of clusters.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The namespaces to include.</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        public static AddContainerDefenseRuleShrinkRequestScope build(java.util.Map<String, ?> map) throws Exception {
            AddContainerDefenseRuleShrinkRequestScope self = new AddContainerDefenseRuleShrinkRequestScope();
            return TeaModel.build(map, self);
        }

        public AddContainerDefenseRuleShrinkRequestScope setAllNamespace(Integer allNamespace) {
            this.allNamespace = allNamespace;
            return this;
        }
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        public AddContainerDefenseRuleShrinkRequestScope setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public AddContainerDefenseRuleShrinkRequestScope setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

    }

}

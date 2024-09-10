// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddContainerDefenseRuleShrinkRequest extends TeaModel {
    /**
     * <p>The description of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test-proc-defense</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The action that is performed when the rule is hit. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: alert</li>
     * <li><strong>2</strong>: block</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleAction")
    public Integer ruleAction;

    /**
     * <p>The ID of the rule. You do not need to manually specify the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>500018</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>auto-test-rule-lt9umq</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The switch of the rule. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: off</li>
     * <li><strong>1</strong>: on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    /**
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li>2: user-defined rules</li>
     * </ul>
     * <blockquote>
     * <p>Only the value 2 is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <ul>
         * <li><strong>0</strong>: You can use the Namespaces parameter to specify the namespaces to include.</li>
         * <li><strong>1</strong>: All namespaces are included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/182997.html">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8e2***75b</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddContainerDefenseRuleRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test-proc-defense</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The action to take when the rule is matched. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Alert.</p>
     * </li>
     * <li><p><strong>2</strong>: Block.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleAction")
    public Integer ruleAction;

    /**
     * <p>The rule ID. You do not need to specify this parameter when creating a rule.</p>
     * 
     * <strong>example:</strong>
     * <p>500018</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>auto-test-rule-lt9umq</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule switch. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Disabled.</p>
     * </li>
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
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
     * <li>2: user rule</li>
     * </ul>
     * <blockquote>
     * <p>Notice: Only the value 2 is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The scope. This parameter is required. Specify at least one Scope entry, such as Scope.1.AllNamespace=1, which indicates that the rule applies to all namespaces. If this parameter is not specified, the API returns a 400 error.</p>
     */
    @NameInMap("Scope")
    public java.util.List<AddContainerDefenseRuleRequestScope> scope;

    /**
     * <p>The whitelist.</p>
     */
    @NameInMap("Whitelist")
    public AddContainerDefenseRuleRequestWhitelist whitelist;

    public static AddContainerDefenseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContainerDefenseRuleRequest self = new AddContainerDefenseRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddContainerDefenseRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddContainerDefenseRuleRequest setRuleAction(Integer ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public Integer getRuleAction() {
        return this.ruleAction;
    }

    public AddContainerDefenseRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public AddContainerDefenseRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public AddContainerDefenseRuleRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public AddContainerDefenseRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public AddContainerDefenseRuleRequest setScope(java.util.List<AddContainerDefenseRuleRequestScope> scope) {
        this.scope = scope;
        return this;
    }
    public java.util.List<AddContainerDefenseRuleRequestScope> getScope() {
        return this.scope;
    }

    public AddContainerDefenseRuleRequest setWhitelist(AddContainerDefenseRuleRequestWhitelist whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public AddContainerDefenseRuleRequestWhitelist getWhitelist() {
        return this.whitelist;
    }

    public static class AddContainerDefenseRuleRequestScope extends TeaModel {
        /**
         * <p>Specifies whether to include all namespaces. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Specifies the namespaces to include by using the Namespaces parameter.</p>
         * </li>
         * <li><p><strong>1</strong>: Includes all namespaces.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/182997.html">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8e2***75b</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The list of included namespaces.</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        public static AddContainerDefenseRuleRequestScope build(java.util.Map<String, ?> map) throws Exception {
            AddContainerDefenseRuleRequestScope self = new AddContainerDefenseRuleRequestScope();
            return TeaModel.build(map, self);
        }

        public AddContainerDefenseRuleRequestScope setAllNamespace(Integer allNamespace) {
            this.allNamespace = allNamespace;
            return this;
        }
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        public AddContainerDefenseRuleRequestScope setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public AddContainerDefenseRuleRequestScope setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

    }

    public static class AddContainerDefenseRuleRequestWhitelist extends TeaModel {
        /**
         * <p>The file hash.&gt;Notice: This parameter is not supported.</p>
         */
        @NameInMap("Hash")
        @Deprecated
        public java.util.List<String> hash;

        /**
         * <p>The list of images to whitelist.</p>
         */
        @NameInMap("Image")
        public java.util.List<String> image;

        /**
         * <p>The list of file paths to whitelist.</p>
         */
        @NameInMap("Path")
        public java.util.List<String> path;

        public static AddContainerDefenseRuleRequestWhitelist build(java.util.Map<String, ?> map) throws Exception {
            AddContainerDefenseRuleRequestWhitelist self = new AddContainerDefenseRuleRequestWhitelist();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public AddContainerDefenseRuleRequestWhitelist setHash(java.util.List<String> hash) {
            this.hash = hash;
            return this;
        }
        public java.util.List<String> getHash() {
            return this.hash;
        }

        public AddContainerDefenseRuleRequestWhitelist setImage(java.util.List<String> image) {
            this.image = image;
            return this;
        }
        public java.util.List<String> getImage() {
            return this.image;
        }

        public AddContainerDefenseRuleRequestWhitelist setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

}

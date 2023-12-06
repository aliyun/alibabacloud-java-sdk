// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddContainerDefenseRuleRequest extends TeaModel {
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
         * <br>
         * <p>*   **0**: You can use the Namespaces parameter to specify the namespaces to include.</p>
         * <p>*   **1**: All namespaces are included.</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The ID of the cluster.</p>
         * <br>
         * <p>>  You can call the [DescribeGroupedContainerInstances](~~182997~~) operation to query the IDs of clusters.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The namespaces to include.</p>
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
         * <p>The hash values of the files that need to be added to the whitelist.</p>
         * <br>
         * <p>> This parameter is not supported.</p>
         */
        @NameInMap("Hash")
        public java.util.List<String> hash;

        /**
         * <p>The images that need to be added to the whitelist.</p>
         */
        @NameInMap("Image")
        public java.util.List<String> image;

        /**
         * <p>The paths to the files that need to be added to the whitelist.</p>
         */
        @NameInMap("Path")
        public java.util.List<String> path;

        public static AddContainerDefenseRuleRequestWhitelist build(java.util.Map<String, ?> map) throws Exception {
            AddContainerDefenseRuleRequestWhitelist self = new AddContainerDefenseRuleRequestWhitelist();
            return TeaModel.build(map, self);
        }

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

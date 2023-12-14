// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerDefenseRuleRequest extends TeaModel {
    /**
     * <p>The description of the rule.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The action specified in the rule. Valid values:</p>
     * <br>
     * <p>*   **1**: alert</p>
     * <p>*   **2**: block</p>
     */
    @NameInMap("RuleAction")
    public Integer ruleAction;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>>  You can call the [ListContainerDefenseRule](~~2590599~~) operation to query the IDs of rules.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <br>
     * <p>*   **1**: enabled</p>
     * <p>*   **0**: disabled</p>
     */
    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <br>
     * <p>*   1: system rule</p>
     * <p>*   2: custom rule</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The effective scope of the rule.</p>
     */
    @NameInMap("Scope")
    public java.util.List<ModifyContainerDefenseRuleRequestScope> scope;

    /**
     * <p>The whitelist.</p>
     */
    @NameInMap("Whitelist")
    public ModifyContainerDefenseRuleRequestWhitelist whitelist;

    public static ModifyContainerDefenseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerDefenseRuleRequest self = new ModifyContainerDefenseRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyContainerDefenseRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyContainerDefenseRuleRequest setRuleAction(Integer ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public Integer getRuleAction() {
        return this.ruleAction;
    }

    public ModifyContainerDefenseRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyContainerDefenseRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ModifyContainerDefenseRuleRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public ModifyContainerDefenseRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public ModifyContainerDefenseRuleRequest setScope(java.util.List<ModifyContainerDefenseRuleRequestScope> scope) {
        this.scope = scope;
        return this;
    }
    public java.util.List<ModifyContainerDefenseRuleRequestScope> getScope() {
        return this.scope;
    }

    public ModifyContainerDefenseRuleRequest setWhitelist(ModifyContainerDefenseRuleRequestWhitelist whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public ModifyContainerDefenseRuleRequestWhitelist getWhitelist() {
        return this.whitelist;
    }

    public static class ModifyContainerDefenseRuleRequestScope extends TeaModel {
        /**
         * <p>Specifies whether to include all namespaces. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The ID of the cluster on which the rule takes effect.</p>
         * <br>
         * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The namespaces.</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        public static ModifyContainerDefenseRuleRequestScope build(java.util.Map<String, ?> map) throws Exception {
            ModifyContainerDefenseRuleRequestScope self = new ModifyContainerDefenseRuleRequestScope();
            return TeaModel.build(map, self);
        }

        public ModifyContainerDefenseRuleRequestScope setAllNamespace(Integer allNamespace) {
            this.allNamespace = allNamespace;
            return this;
        }
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        public ModifyContainerDefenseRuleRequestScope setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ModifyContainerDefenseRuleRequestScope setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

    }

    public static class ModifyContainerDefenseRuleRequestWhitelist extends TeaModel {
        /**
         * <p>The hash values of the files that need to be added to the whitelist.</p>
         * <br>
         * <p>>  This parameter is not supported.</p>
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

        public static ModifyContainerDefenseRuleRequestWhitelist build(java.util.Map<String, ?> map) throws Exception {
            ModifyContainerDefenseRuleRequestWhitelist self = new ModifyContainerDefenseRuleRequestWhitelist();
            return TeaModel.build(map, self);
        }

        public ModifyContainerDefenseRuleRequestWhitelist setHash(java.util.List<String> hash) {
            this.hash = hash;
            return this;
        }
        public java.util.List<String> getHash() {
            return this.hash;
        }

        public ModifyContainerDefenseRuleRequestWhitelist setImage(java.util.List<String> image) {
            this.image = image;
            return this;
        }
        public java.util.List<String> getImage() {
            return this.image;
        }

        public ModifyContainerDefenseRuleRequestWhitelist setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

}

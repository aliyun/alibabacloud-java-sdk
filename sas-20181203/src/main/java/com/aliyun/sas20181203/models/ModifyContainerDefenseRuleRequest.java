// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerDefenseRuleRequest extends TeaModel {
    /**
     * <p>The description of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Prevent non-mirror programs from starting in containers</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The action specified in the rule. Valid values:</p>
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
     * <p>The ID of the rule.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2590599.html">ListContainerDefenseRule</a> operation to query the IDs of rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>text-001</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <ul>
     * <li>1: system rule</li>
     * <li>2: custom rule</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The ID of the cluster on which the rule takes effect.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c54b***1501</p>
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
         * <blockquote>
         * <p> This parameter is not supported.</p>
         * </blockquote>
         */
        @NameInMap("Hash")
        @Deprecated
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

        @Deprecated
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

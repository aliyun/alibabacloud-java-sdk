// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpLaneUpdateCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>灰度</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <strong>example:</strong>
     * <p>rules:
     *     - vars:
     *         - name: userId
     *           position: header
     *           key: x-linkedmall-user-id
     *         - name: userType
     *           position: query
     *           key: userType
     *       expression: &quot;userId % 10 == 0 &amp;&amp; userType == A&quot;
     *       tag: &quot;gray&quot;
     *       scope: &quot;pbc1,pbc2&quot;</p>
     */
    @NameInMap("customeMarkingRules")
    public String customeMarkingRules;

    /**
     * <strong>example:</strong>
     * <p>灰度描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    @NameInMap("initGroupFlag")
    public Boolean initGroupFlag;

    /**
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("inletServiceIds")
    public String inletServiceIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEMPLATE</p>
     */
    @NameInMap("markingRuleType")
    public String markingRuleType;

    @NameInMap("ruleConditions")
    public java.util.List<RuleCondition> ruleConditions;

    /**
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("ruleConnectType")
    public String ruleConnectType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("serviceGroupIds")
    public String serviceGroupIds;

    public static PdpLaneUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        PdpLaneUpdateCmd self = new PdpLaneUpdateCmd();
        return TeaModel.build(map, self);
    }

    public PdpLaneUpdateCmd setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PdpLaneUpdateCmd setCustomeMarkingRules(String customeMarkingRules) {
        this.customeMarkingRules = customeMarkingRules;
        return this;
    }
    public String getCustomeMarkingRules() {
        return this.customeMarkingRules;
    }

    public PdpLaneUpdateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpLaneUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PdpLaneUpdateCmd setInitGroupFlag(Boolean initGroupFlag) {
        this.initGroupFlag = initGroupFlag;
        return this;
    }
    public Boolean getInitGroupFlag() {
        return this.initGroupFlag;
    }

    public PdpLaneUpdateCmd setInletServiceIds(String inletServiceIds) {
        this.inletServiceIds = inletServiceIds;
        return this;
    }
    public String getInletServiceIds() {
        return this.inletServiceIds;
    }

    public PdpLaneUpdateCmd setMarkingRuleType(String markingRuleType) {
        this.markingRuleType = markingRuleType;
        return this;
    }
    public String getMarkingRuleType() {
        return this.markingRuleType;
    }

    public PdpLaneUpdateCmd setRuleConditions(java.util.List<RuleCondition> ruleConditions) {
        this.ruleConditions = ruleConditions;
        return this;
    }
    public java.util.List<RuleCondition> getRuleConditions() {
        return this.ruleConditions;
    }

    public PdpLaneUpdateCmd setRuleConnectType(String ruleConnectType) {
        this.ruleConnectType = ruleConnectType;
        return this;
    }
    public String getRuleConnectType() {
        return this.ruleConnectType;
    }

    public PdpLaneUpdateCmd setServiceGroupIds(String serviceGroupIds) {
        this.serviceGroupIds = serviceGroupIds;
        return this;
    }
    public String getServiceGroupIds() {
        return this.serviceGroupIds;
    }

}

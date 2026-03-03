// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpLaneCreateCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>灰度</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("companyId")
    public Long companyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>252333049301505383</p>
     */
    @NameInMap("creatorUid")
    public String creatorUid;

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
     * <p>泳道描述信息</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gray</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("productId")
    public Long productId;

    @NameInMap("ruleConditions")
    public java.util.List<RuleCondition> ruleConditions;

    /**
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("ruleConnectType")
    public String ruleConnectType;

    /**
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("serviceGroupIds")
    public String serviceGroupIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>灰度</p>
     */
    @NameInMap("type")
    public String type;

    public static PdpLaneCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PdpLaneCreateCmd self = new PdpLaneCreateCmd();
        return TeaModel.build(map, self);
    }

    public PdpLaneCreateCmd setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PdpLaneCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PdpLaneCreateCmd setCreatorUid(String creatorUid) {
        this.creatorUid = creatorUid;
        return this;
    }
    public String getCreatorUid() {
        return this.creatorUid;
    }

    public PdpLaneCreateCmd setCustomeMarkingRules(String customeMarkingRules) {
        this.customeMarkingRules = customeMarkingRules;
        return this;
    }
    public String getCustomeMarkingRules() {
        return this.customeMarkingRules;
    }

    public PdpLaneCreateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpLaneCreateCmd setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PdpLaneCreateCmd setInitGroupFlag(Boolean initGroupFlag) {
        this.initGroupFlag = initGroupFlag;
        return this;
    }
    public Boolean getInitGroupFlag() {
        return this.initGroupFlag;
    }

    public PdpLaneCreateCmd setInletServiceIds(String inletServiceIds) {
        this.inletServiceIds = inletServiceIds;
        return this;
    }
    public String getInletServiceIds() {
        return this.inletServiceIds;
    }

    public PdpLaneCreateCmd setMarkingRuleType(String markingRuleType) {
        this.markingRuleType = markingRuleType;
        return this;
    }
    public String getMarkingRuleType() {
        return this.markingRuleType;
    }

    public PdpLaneCreateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PdpLaneCreateCmd setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public PdpLaneCreateCmd setRuleConditions(java.util.List<RuleCondition> ruleConditions) {
        this.ruleConditions = ruleConditions;
        return this;
    }
    public java.util.List<RuleCondition> getRuleConditions() {
        return this.ruleConditions;
    }

    public PdpLaneCreateCmd setRuleConnectType(String ruleConnectType) {
        this.ruleConnectType = ruleConnectType;
        return this;
    }
    public String getRuleConnectType() {
        return this.ruleConnectType;
    }

    public PdpLaneCreateCmd setServiceGroupIds(String serviceGroupIds) {
        this.serviceGroupIds = serviceGroupIds;
        return this;
    }
    public String getServiceGroupIds() {
        return this.serviceGroupIds;
    }

    public PdpLaneCreateCmd setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpLane extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>灰度</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("companyId")
    public Long companyId;

    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("creatorName")
    public String creatorName;

    /**
     * <strong>example:</strong>
     * <p>252333049301505383</p>
     */
    @NameInMap("creatorUid")
    public String creatorUid;

    /**
     * <p>This parameter is required.</p>
     * 
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

    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("initGroupFlag")
    public Boolean initGroupFlag;

    @NameInMap("inletServices")
    public java.util.List<PdpServiceInfo> inletServices;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEMPLATE</p>
     */
    @NameInMap("markingRuleType")
    public String markingRuleType;

    /**
     * <strong>example:</strong>
     * <p>gray</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("productId")
    public Long productId;

    /**
     * <strong>example:</strong>
     * <p>linkemall</p>
     */
    @NameInMap("productName")
    public String productName;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("ruleConditions")
    public java.util.List<RuleCondition> ruleConditions;

    /**
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("ruleConnectType")
    public String ruleConnectType;

    @NameInMap("serviceGroups")
    public java.util.List<ServiceGroupInfo> serviceGroups;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
    @NameInMap("type")
    public String type;

    public static PdpLane build(java.util.Map<String, ?> map) throws Exception {
        PdpLane self = new PdpLane();
        return TeaModel.build(map, self);
    }

    public PdpLane setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PdpLane setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PdpLane setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public PdpLane setCreatorUid(String creatorUid) {
        this.creatorUid = creatorUid;
        return this;
    }
    public String getCreatorUid() {
        return this.creatorUid;
    }

    public PdpLane setCustomeMarkingRules(String customeMarkingRules) {
        this.customeMarkingRules = customeMarkingRules;
        return this;
    }
    public String getCustomeMarkingRules() {
        return this.customeMarkingRules;
    }

    public PdpLane setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpLane setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PdpLane setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PdpLane setInitGroupFlag(Boolean initGroupFlag) {
        this.initGroupFlag = initGroupFlag;
        return this;
    }
    public Boolean getInitGroupFlag() {
        return this.initGroupFlag;
    }

    public PdpLane setInletServices(java.util.List<PdpServiceInfo> inletServices) {
        this.inletServices = inletServices;
        return this;
    }
    public java.util.List<PdpServiceInfo> getInletServices() {
        return this.inletServices;
    }

    public PdpLane setMarkingRuleType(String markingRuleType) {
        this.markingRuleType = markingRuleType;
        return this;
    }
    public String getMarkingRuleType() {
        return this.markingRuleType;
    }

    public PdpLane setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PdpLane setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public PdpLane setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public PdpLane setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpLane setRuleConditions(java.util.List<RuleCondition> ruleConditions) {
        this.ruleConditions = ruleConditions;
        return this;
    }
    public java.util.List<RuleCondition> getRuleConditions() {
        return this.ruleConditions;
    }

    public PdpLane setRuleConnectType(String ruleConnectType) {
        this.ruleConnectType = ruleConnectType;
        return this;
    }
    public String getRuleConnectType() {
        return this.ruleConnectType;
    }

    public PdpLane setServiceGroups(java.util.List<ServiceGroupInfo> serviceGroups) {
        this.serviceGroups = serviceGroups;
        return this;
    }
    public java.util.List<ServiceGroupInfo> getServiceGroups() {
        return this.serviceGroups;
    }

    public PdpLane setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

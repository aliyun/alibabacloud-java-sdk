// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBaseSystemRulesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sqli</p>
     */
    @NameInMap("DetectType")
    public String detectType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>loose</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <strong>example:</strong>
     * <p>block</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <strong>example:</strong>
     * <p>113089</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <strong>example:</strong>
     * <p>systemRuleTest</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleStatus")
    public Integer ruleStatus;

    /**
     * <strong>example:</strong>
     * <p>24354</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeBaseSystemRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBaseSystemRulesRequest self = new DescribeBaseSystemRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBaseSystemRulesRequest setDetectType(String detectType) {
        this.detectType = detectType;
        return this;
    }
    public String getDetectType() {
        return this.detectType;
    }

    public DescribeBaseSystemRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeBaseSystemRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeBaseSystemRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBaseSystemRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBaseSystemRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBaseSystemRulesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeBaseSystemRulesRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeBaseSystemRulesRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public DescribeBaseSystemRulesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DescribeBaseSystemRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeBaseSystemRulesRequest setRuleStatus(Integer ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public Integer getRuleStatus() {
        return this.ruleStatus;
    }

    public DescribeBaseSystemRulesRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}

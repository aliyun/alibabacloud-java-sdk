// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeRulesRequest extends TeaModel {
    @NameInMap("ApplicationType")
    public Integer applicationType;

    /**
     * <p>CVE ID</p>
     */
    @NameInMap("CveIdKey")
    public String cveIdKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProtectionType")
    public Integer protectionType;

    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleGroupId")
    public Long ruleGroupId;

    @NameInMap("RuleIdKey")
    public String ruleIdKey;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulesRequest self = new DescribeRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRulesRequest setApplicationType(Integer applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public Integer getApplicationType() {
        return this.applicationType;
    }

    public DescribeRulesRequest setCveIdKey(String cveIdKey) {
        this.cveIdKey = cveIdKey;
        return this;
    }
    public String getCveIdKey() {
        return this.cveIdKey;
    }

    public DescribeRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRulesRequest setProtectionType(Integer protectionType) {
        this.protectionType = protectionType;
        return this;
    }
    public Integer getProtectionType() {
        return this.protectionType;
    }

    public DescribeRulesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRulesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeRulesRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeRulesRequest setRuleGroupId(Long ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
        return this;
    }
    public Long getRuleGroupId() {
        return this.ruleGroupId;
    }

    public DescribeRulesRequest setRuleIdKey(String ruleIdKey) {
        this.ruleIdKey = ruleIdKey;
        return this;
    }
    public String getRuleIdKey() {
        return this.ruleIdKey;
    }

    public DescribeRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}

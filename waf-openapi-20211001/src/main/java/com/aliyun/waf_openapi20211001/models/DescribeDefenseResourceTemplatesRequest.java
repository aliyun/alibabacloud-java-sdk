// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceTemplatesRequest extends TeaModel {
    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-9lb36****0e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region of the WAF instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the protected object or protected object group, or the ID of the protected asset to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mitsuichemicals.cn-waf</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2ax2y5****pi</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of protected resource. Valid values:</p>
     * <ul>
     * <li><p><strong>single</strong> (default): A protected object.</p>
     * </li>
     * <li><p><strong>group</strong>: A protected object group.</p>
     * </li>
     * <li><p><strong>asset</strong>: A protected asset.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>single</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the protection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>20111098</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the protection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>demoRuleName</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of protection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>defense</strong> (default): A protection rule.</p>
     * </li>
     * <li><p><strong>whitelist</strong>: A whitelist rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>whitelist</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The name of the protection template to query.</p>
     * 
     * <strong>example:</strong>
     * <p>test221</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static DescribeDefenseResourceTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceTemplatesRequest self = new DescribeDefenseResourceTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceTemplatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDefenseResourceTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDefenseResourceTemplatesRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public DescribeDefenseResourceTemplatesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeDefenseResourceTemplatesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeDefenseResourceTemplatesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DescribeDefenseResourceTemplatesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeDefenseResourceTemplatesRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public DescribeDefenseResourceTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}

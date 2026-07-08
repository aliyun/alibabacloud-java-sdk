// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseRuleStatusRequest extends TeaModel {
    /**
     * <p>The type of the protection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>template</strong> (default): a template protection rule.</p>
     * </li>
     * <li><p><strong>resource</strong>: a rule that is configured for a protected object.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>template</p>
     */
    @NameInMap("DefenseType")
    public String defenseType;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region of the WAF instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The ID of the protection rule to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20002615</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The new status of the protection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: disabled</p>
     * </li>
     * <li><p><strong>1</strong>: enabled</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleStatus")
    public Integer ruleStatus;

    /**
     * <p>The ID of the protection template.</p>
     * 
     * <strong>example:</strong>
     * <p>7239</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static ModifyDefenseRuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseRuleStatusRequest self = new ModifyDefenseRuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseRuleStatusRequest setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }
    public String getDefenseType() {
        return this.defenseType;
    }

    public ModifyDefenseRuleStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDefenseRuleStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDefenseRuleStatusRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyDefenseRuleStatusRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyDefenseRuleStatusRequest setRuleStatus(Integer ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public Integer getRuleStatus() {
        return this.ruleStatus;
    }

    public ModifyDefenseRuleStatusRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}

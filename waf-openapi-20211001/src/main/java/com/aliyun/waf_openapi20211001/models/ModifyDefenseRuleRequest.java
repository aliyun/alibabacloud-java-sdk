// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseRuleRequest extends TeaModel {
    /**
     * <p>The protection scenario to modify. For more information, see the <strong>DefenseScene</strong> parameter in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_group</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The type of the protection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>template</p>
     */
    @NameInMap("DefenseType")
    public String defenseType;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
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
     * <p>The protected object associated with the rule to modify.</p>
     * <blockquote>
     * <p>This parameter is required only when <strong>DefenseType</strong> is set to <strong>resource</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rencs***-waf</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The details of the protection rule. The value is a string that is converted from a JSON object constructed by a series of parameters. When you configure this parameter, you must specify the rule ID and the protection rule configuration to modify. The following parameters are included:</p>
     * <ul>
     * <li><p><strong>id</strong>: Long | Required | The rule ID.</p>
     * </li>
     * <li><p>Protection rule configuration: Same as the <strong>Rules</strong> parameter of the <strong>CreateDefenseRule</strong> operation. For more information, see the <strong>protection rule parameter description</strong> in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;id&quot;: 2344,
     *             &quot;policyId&quot;: 1012,
     *             &quot;action&quot;: &quot;block&quot;
     *       }
     * ]</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The ID of the protection rule template.</p>
     * <blockquote>
     * <p>This parameter is required only when <strong>DefenseType</strong> is set to <strong>template</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5325</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static ModifyDefenseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseRuleRequest self = new ModifyDefenseRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseRuleRequest setDefenseScene(String defenseScene) {
        this.defenseScene = defenseScene;
        return this;
    }
    public String getDefenseScene() {
        return this.defenseScene;
    }

    public ModifyDefenseRuleRequest setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }
    public String getDefenseType() {
        return this.defenseType;
    }

    public ModifyDefenseRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDefenseRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDefenseRuleRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ModifyDefenseRuleRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyDefenseRuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public ModifyDefenseRuleRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}

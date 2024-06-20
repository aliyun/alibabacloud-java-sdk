// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseRuleRequest extends TeaModel {
    /**
     * <p>The module to which the protection rule that you want to create belongs.</p>
     * <ul>
     * <li><strong>waf_group:</strong> the basic protection rule module.</li>
     * <li><strong>antiscan:</strong> the scan protection module.</li>
     * <li><strong>ip_blacklist:</strong> the IP address blacklist module.</li>
     * <li><strong>custom_acl:</strong> the custom rule module.</li>
     * <li><strong>whitelist:</strong> the whitelist module.</li>
     * <li><strong>region_block:</strong> the region blacklist module.</li>
     * <li><strong>custom_response:</strong> the custom response module.</li>
     * <li><strong>cc:</strong> the HTTP flood protection module.</li>
     * <li><strong>tamperproof:</strong> the website tamper-proofing module.</li>
     * <li><strong>dlp:</strong> the data leakage prevention module.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_group</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to obtain the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou:</strong> the Chinese mainland.</li>
     * <li><strong>ap-southeast-1:</strong> outside the Chinese mainland.</li>
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
     * <p>The configurations of the protection rule. Specify a string that contains multiple parameters in the JSON format.</p>
     * <blockquote>
     * <p> The parameters vary based on the value of the <strong>DefenseScene</strong> parameter. For more information, see the &quot;<strong>Protection rule parameters</strong>&quot; section in this topic.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>For more information, see the following section.</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The ID of the protection rule template for which you want to create a protection rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1122</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static CreateDefenseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseRuleRequest self = new CreateDefenseRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDefenseRuleRequest setDefenseScene(String defenseScene) {
        this.defenseScene = defenseScene;
        return this;
    }
    public String getDefenseScene() {
        return this.defenseScene;
    }

    public CreateDefenseRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDefenseRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDefenseRuleRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateDefenseRuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public CreateDefenseRuleRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseRuleRequest extends TeaModel {
    /**
     * <p>The protection scenario for the rule.</p>
     * <p>When <strong>DefenseType</strong> is <strong>template</strong>, valid values are:</p>
     * <ul>
     * <li><p><strong>waf_group</strong>: basic protection.</p>
     * </li>
     * <li><p><strong>waf_base</strong>: new version of Web core protection.</p>
     * </li>
     * <li><p><strong>antiscan</strong>: scan protection.</p>
     * </li>
     * <li><p><strong>ip_blacklist</strong>: IP blacklist.</p>
     * </li>
     * <li><p><strong>custom_acl</strong>: custom rules.</p>
     * </li>
     * <li><p><strong>whitelist</strong>: whitelist.</p>
     * </li>
     * <li><p><strong>region_block</strong>: location blacklist.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: legacy custom response.</p>
     * </li>
     * <li><p><strong>cc</strong>: HTTP flood protection.</p>
     * </li>
     * <li><p><strong>tamperproof</strong>: webpage tamper protection.</p>
     * </li>
     * <li><p><strong>dlp</strong>: data leak prevention.</p>
     * </li>
     * <li><p><strong>spike_throttle</strong>: peak traffic throttling.</p>
     * </li>
     * </ul>
     * <p>When <strong>DefenseType</strong> is <strong>resource</strong>, valid values are:</p>
     * <ul>
     * <li><p><strong>account_identifier</strong>: account extraction.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: new version of custom response.</p>
     * </li>
     * <li><p><strong>waf_codec</strong>: decoding.</p>
     * </li>
     * </ul>
     * <p>When <strong>DefenseType</strong> is <strong>global</strong>, valid values are:</p>
     * <ul>
     * <li><p><strong>regular_custom</strong>: custom regex.</p>
     * </li>
     * <li><p><strong>address_book</strong>: address book.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: new version of custom response.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For globally configured custom responses, users can reference them under protected objects or rules. When referenced at different levels, the effective logic follows this order: rule level &gt; protected object level &gt; default page.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_group</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The type of the protection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>template</strong> (default): template-based protection rules.</p>
     * </li>
     * <li><p><strong>resource</strong>: rules applied at the protected object level.</p>
     * </li>
     * <li><p><strong>global</strong>: global-level rules.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>template</p>
     */
    @NameInMap("DefenseType")
    public String defenseType;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
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
     * <p>The protected object associated with the rule.</p>
     * <blockquote>
     * <p>Provide this parameter only when <strong>DefenseType</strong> is <strong>resource</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sec****-waf</p>
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
     * <p>The rule configuration content, specified as a JSON string.</p>
     * <blockquote>
     * <p>The specific parameters vary based on the specified <strong>DefenseType</strong> (<strong>DefenseScene</strong>). For details, see <strong>Protection Rule Parameter Descriptions</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_group</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The ID of the protection template to which the rule belongs.</p>
     * <blockquote>
     * <p>Provide this parameter only when <strong>DefenseType</strong> is <strong>template</strong>.</p>
     * </blockquote>
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

    public CreateDefenseRuleRequest setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }
    public String getDefenseType() {
        return this.defenseType;
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

    public CreateDefenseRuleRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
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

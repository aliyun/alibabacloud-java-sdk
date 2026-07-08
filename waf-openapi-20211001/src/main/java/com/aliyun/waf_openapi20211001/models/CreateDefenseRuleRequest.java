// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseRuleRequest extends TeaModel {
    /**
     * <p>The scenario to which the protection rule is applied.</p>
     * <p>If <strong>DefenseType</strong> is set to <strong>template</strong>, valid values are:</p>
     * <ul>
     * <li><p><strong>waf_group</strong>: basic protection.</p>
     * </li>
     * <li><p><strong>waf_base</strong>: web core protection.</p>
     * </li>
     * <li><p><strong>antiscan</strong>: scan protection.</p>
     * </li>
     * <li><p><strong>ip_blacklist</strong>: IP address blacklist.</p>
     * </li>
     * <li><p><strong>custom_acl</strong>: custom rule.</p>
     * </li>
     * <li><p><strong>whitelist</strong>: whitelist.</p>
     * </li>
     * <li><p><strong>region_block</strong>: geo-blocking.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: custom response.</p>
     * </li>
     * <li><p><strong>cc</strong>: HTTP flood protection.</p>
     * </li>
     * <li><p><strong>tamperproof</strong>: webpage tamper-proofing.</p>
     * </li>
     * <li><p><strong>dlp</strong>: data leakage prevention.</p>
     * </li>
     * <li><p><strong>spike_throttle</strong>: rate limiting for bursts of traffic.</p>
     * </li>
     * <li><p><strong>bot_manager</strong>: bot management.</p>
     * </li>
     * </ul>
     * <p>If <strong>DefenseType</strong> is set to <strong>resource</strong>, valid values are:</p>
     * <ul>
     * <li><p><strong>account_identifier</strong>: account identification.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: custom response.</p>
     * </li>
     * <li><p><strong>waf_codec</strong>: decoding.</p>
     * </li>
     * </ul>
     * <p>If <strong>DefenseType</strong> is set to <strong>global</strong>, valid values are:</p>
     * <ul>
     * <li><p><strong>regular_custom</strong>: custom regular expression.</p>
     * </li>
     * <li><p><strong>address_book</strong>: address book.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: custom response.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can apply a global custom response to a protected object or a rule. If you configure custom response rules at different levels, the rule with the finest-grained scope takes precedence. The priority is as follows: rule &gt; protected object &gt; default page.</p>
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
     * <li><p><strong>template</strong> (default): a template-based protection rule.</p>
     * </li>
     * <li><p><strong>resource</strong>: a rule for a specific protected object.</p>
     * </li>
     * <li><p><strong>global</strong>: a global protection rule.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to get the ID of your WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: Chinese mainland.</p>
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
     * <p>The protected object to which the rule applies.</p>
     * <blockquote>
     * <p>This parameter is required only when <strong>DefenseType</strong> is set to <strong>resource</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sec****-waf</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The details of the protection rule. This value is a JSON string.</p>
     * <blockquote>
     * <p>The parameters in the JSON string vary based on the value of <strong>DefenseScene</strong>. For more information, see <strong>Protection rule parameters</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_group</p>
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

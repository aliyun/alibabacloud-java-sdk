// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseRuleRequest extends TeaModel {
    /**
     * <p>The WAF protection scenario to create.</p>
     * <p>When the protection rule type <strong>DefenseType</strong> is set to <strong>template</strong>, valid values:</p>
     * <ul>
     * <li><p><strong>waf_group</strong>: Basic Web Protection.</p>
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
     * <li><p><strong>region_block</strong>: Location Blacklist.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: legacy custom response.</p>
     * </li>
     * <li><p><strong>cc</strong>: HTTP flood mitigation.</p>
     * </li>
     * <li><p><strong>tamperproof</strong>: web tamper proofing.</p>
     * </li>
     * <li><p><strong>dlp</strong>: information leak prevention.</p>
     * </li>
     * <li><p><strong>spike_throttle</strong>: peak traffic throttling.</p>
     * </li>
     * <li><p><strong>bot_manager</strong>: bot management.</p>
     * </li>
     * </ul>
     * <p>When the protection rule type <strong>DefenseType</strong> is set to <strong>resource</strong>, valid values:</p>
     * <ul>
     * <li><p><strong>account_identifier</strong>: account extraction.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: new version of custom response.</p>
     * </li>
     * <li><p><strong>waf_codec</strong>: decoding.</p>
     * </li>
     * <li><p><strong>websdk</strong>: WebSDK integration.</p>
     * </li>
     * </ul>
     * <p>When the protection rule type <strong>DefenseType</strong> is set to <strong>global</strong>, valid values:</p>
     * <ul>
     * <li><p><strong>regular_custom</strong>: custom regular expression.</p>
     * </li>
     * <li><p><strong>address_book</strong>: address book.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: new version of custom response.</p>
     * <blockquote>
     * <p> The custom response in global configurations can be referenced by protected objects or rules. When custom response rules are referenced at different levels, the effective priority is: rule level &gt; protected object level &gt; default page.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the current WAF instance.</p>
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
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The protection object associated with the rule to create.</p>
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
     * <p>The rule configuration content, which is a JSON string constructed from a series of parameters.</p>
     * <blockquote>
     * <p> The specific parameters vary depending on the <strong>mitigation setting type</strong> (<strong>DefenseScene</strong>) that you specify. For more information, refer to <strong>Protection rule parameter description</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_group</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The ID of the protection template for which you want to create a protection rule.</p>
     * <blockquote>
     * <p>This parameter is required only when <strong>DefenseType</strong> is set to <strong>template</strong>.
     * There is an upper limit on the number of rules that can be created in a protection template. For more information, see <strong>Rule quantity limits</strong>. If the number of rules has reached the upper limit, you can call the <a href="https://help.aliyun.com/document_detail/461613.html">CreateDefenseTemplate</a> operation to create a new protection template. You can also call the <a href="https://help.aliyun.com/document_detail/461422.html">ModifyDefenseRule</a> operation to modify an existing rule.</p>
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

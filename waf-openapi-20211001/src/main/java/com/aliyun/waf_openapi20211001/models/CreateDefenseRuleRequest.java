// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseRuleRequest extends TeaModel {
    /**
     * <p>The WAF protection scenario to be created.</p>
     * <p>Valid values when the protection rule type <strong>DefenseType</strong> is set to <strong>template</strong>:</p>
     * <ul>
     * <li><p><strong>waf_group</strong>: basic protection.</p>
     * </li>
     * <li><p><strong>waf_base</strong>: new version of web core protection.</p>
     * </li>
     * <li><p><strong>antiscan</strong>: scan protection.</p>
     * </li>
     * <li><p><strong>ip_blacklist</strong>: IP blacklist.</p>
     * </li>
     * <li><p><strong>custom_acl</strong>: custom rules.</p>
     * </li>
     * <li><p><strong>whitelist</strong>: whitelist.</p>
     * </li>
     * <li><p><strong>region_block</strong>: area blocking.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: custom response of the old version.</p>
     * </li>
     * <li><p><strong>cc</strong>: HTTP flood protection.</p>
     * </li>
     * <li><p><strong>tamperproof</strong>: web tamper-proofing.</p>
     * </li>
     * <li><p><strong>dlp</strong>: data leak prevention.</p>
     * </li>
     * <li><p><strong>spike_throttle</strong>: peak traffic throttling.</p>
     * </li>
     * <li><p><strong>bot_manager</strong>: bot management.</p>
     * </li>
     * </ul>
     * <p>Valid values when the protection rule type <strong>DefenseType</strong> is set to <strong>resource</strong>:</p>
     * <ul>
     * <li><p><strong>account_identifier</strong>: account extraction.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: custom response of the new version.</p>
     * </li>
     * <li><p><strong>waf_codec</strong>: decoding.</p>
     * </li>
     * <li><p><strong>websdk</strong>: WebSDK integration.</p>
     * </li>
     * </ul>
     * <p>Valid values when the protection rule type <strong>DefenseType</strong> is set to <strong>global</strong>:</p>
     * <ul>
     * <li><p><strong>regular_custom</strong>: custom regular expressions.</p>
     * </li>
     * <li><p><strong>address_book</strong>: address book.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: custom response of the new version.</p>
     * <blockquote>
     * <p>For globally configured custom responses, you can reference them under protected objects or rules. When custom response rules are referenced at different dimensions, the actual effective priority is: rule level &gt; protected object level &gt; default page.</p>
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
     * <p>Specifies whether to enable the dry run mode. If this parameter is not specified, a normal request is initiated. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: initiates a dry run request. The system only checks whether the request meets the execution conditions and does not perform the operations specified in the request. If the dry run fails, the corresponding error code is returned. If the dry run succeeds, the error code Defense.Control.DryRunOperation is returned.</li>
     * <li><strong>false</strong>: initiates a normal request. The system performs the operations specified in the request after the check succeeds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of your WAF instance.</p>
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
     * <p>The protected object corresponding to the created rule.</p>
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
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of the protected target. This parameter applies to rules where <strong>DefenseType</strong> is set to <strong>resource</strong>. Valid values:</p>
     * <ul>
     * <li><strong>single</strong> (default): a single protected object.</li>
     * <li><strong>group</strong>: a protection group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>single</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The rule configuration content, which is converted into a string in JSON format constructed by a series of parameters.</p>
     * <blockquote>
     * <p>The specific parameters involved vary depending on the specified <strong>protection rule type</strong> (<strong>DefenseScene</strong>). For more information, see <strong>Protection rule parameter description</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_group</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The ID of the protection template for the protection rule to be created.</p>
     * <blockquote>
     * <p>This parameter is required only when <strong>DefenseType</strong> is set to <strong>template</strong>.
     * The number of rules that can be created in a single protection template is limited. For more information, see <strong>Rule quantity limits</strong>. If the limit is reached, you can call the <a href="https://help.aliyun.com/document_detail/461613.html">CreateDefenseTemplate</a> operation to create a new protection template, or call the <a href="https://help.aliyun.com/document_detail/461422.html">ModifyDefenseRule</a> operation to modify an existing rule.</p>
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

    public CreateDefenseRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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

    public CreateDefenseRuleRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
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

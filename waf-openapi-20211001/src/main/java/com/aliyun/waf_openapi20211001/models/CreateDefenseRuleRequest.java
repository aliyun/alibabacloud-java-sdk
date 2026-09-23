// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseRuleRequest extends TeaModel {
    /**
     * <p>The WAF protection scenario to create.</p>
     * <p>When the protection rule type <strong>DefenseType</strong> is set to <strong>template</strong>, valid values:</p>
     * <ul>
     * <li><p><strong>waf_group</strong>: basic protection.</p>
     * </li>
     * <li><p><strong>waf_base</strong>: new version of Web Core Protection.</p>
     * </li>
     * <li><p><strong>antiscan</strong>: Scan Protection.</p>
     * </li>
     * <li><p><strong>ip_blacklist</strong>: IP Blacklist.</p>
     * </li>
     * <li><p><strong>custom_acl</strong>: Custom Rule.</p>
     * </li>
     * <li><p><strong>whitelist</strong>: Whitelist.</p>
     * </li>
     * <li><p><strong>region_block</strong>: Location Blacklist.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: legacy Custom Response.</p>
     * </li>
     * <li><p><strong>cc</strong>: HTTP Flood Protection.</p>
     * </li>
     * <li><p><strong>tamperproof</strong>: web tamper proofing.</p>
     * </li>
     * <li><p><strong>dlp</strong>: Information Leak Prevention.</p>
     * </li>
     * <li><p><strong>spike_throttle</strong>: peak traffic throttling.</p>
     * </li>
     * <li><p><strong>bot_manager</strong>: BOT Management.</p>
     * </li>
     * </ul>
     * <p>When the protection rule type <strong>DefenseType</strong> is set to <strong>resource</strong>, valid values:</p>
     * <ul>
     * <li><p><strong>account_identifier</strong>: Account Extraction.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: new version of Custom Response.</p>
     * </li>
     * <li><p><strong>waf_codec</strong>: Decoding.</p>
     * </li>
     * <li><p><strong>websdk</strong>: WebSDK Integration.</p>
     * </li>
     * </ul>
     * <p>When the protection rule type <strong>DefenseType</strong> is set to <strong>global</strong>, valid values:</p>
     * <ul>
     * <li><p><strong>regular_custom</strong>: Custom Regex.</p>
     * </li>
     * <li><p><strong>address_book</strong>: Address Book.</p>
     * </li>
     * <li><p><strong>custom_response</strong>: new version of Custom Response.</p>
     * <blockquote>
     * <p>For the custom response in global configuration, users can reference it at the protected object or rule level. When custom response rules are referenced at different dimensions, the actual effective logic is: rule level &gt; protected object level &gt; default page.</p>
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
     * <p>Specifies whether to enable the dry run mode. If you do not specify this parameter, a normal request is sent. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: A dry run request is sent. The system only checks whether the request meets the execution conditions without performing the specified operation. If the dry run fails, the corresponding error code is returned. If the dry run succeeds, the error code Defense.Control.DryRunOperation is returned.</li>
     * <li><strong>false</strong>: A normal request is sent. The specified operation is performed after the request passes the check.</li>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of your current WAF instance.</p>
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
     * <p>The protected object associated with the rule to be created.</p>
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
     * <p>The rule configuration content, which is a string converted from a JSON-formatted array of parameters.</p>
     * <blockquote>
     * <p>The specific parameters vary depending on the specified <strong>protection rule type</strong> (<strong>DefenseScene</strong>). For more information, refer to <strong>Protection rule parameter descriptions</strong>.</p>
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
     * There is an upper limit on the number of rules that can be created within the same protection template. For specific limits, refer to <strong>Rule quantity limits</strong>. When the rule quantity has reached the upper limit, you can call the <a href="https://help.aliyun.com/document_detail/461613.html">CreateDefenseTemplate</a> operation to create a new protection template. You can also call the <a href="https://help.aliyun.com/document_detail/461422.html">ModifyDefenseRule</a> operation to modify an existing rule.</p>
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

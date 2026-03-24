// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseTemplateRequest extends TeaModel {
    /**
     * <p>The protection scenario. For more information, see the <strong>DefenseScene</strong> parameter of the <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_group</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <strong>example:</strong>
     * <p>bot_custom_acl</p>
     */
    @NameInMap("DefenseSubScene")
    public String defenseSubScene;

    /**
     * <p>The description of the protection template.</p>
     * <ul>
     * <li><strong>bot_custom_acl</strong>: Represents the protection template for advanced custom rules in bot management.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to get the ID of the WAF instance.</p>
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
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: Represents the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: Represents regions outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The name of the protection template. The name must be 1 to 255 characters long and can contain letters, digits, Chinese characters, underscores (_), periods (.), and hyphens (-).</p>
     * <blockquote>
     * <p>The names of templates for the same protection scenario (<strong>DefenseScene</strong>) must be unique.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test221</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The origin of the protection template. The value must be <strong>custom</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("TemplateOrigin")
    public String templateOrigin;

    /**
     * <p>Indicates whether the protection template is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Disabled.</p>
     * </li>
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateStatus")
    public Integer templateStatus;

    /**
     * <p>The type of the protection template. Valid values:</p>
     * <ul>
     * <li><p><strong>user_default</strong>: The user\&quot;s default template.</p>
     * </li>
     * <li><p><strong>user_custom</strong>: A user-defined template.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>The protected objects to unbind when you create a default template. Use the [<strong>&quot;XX1&quot;,&quot;XX2&quot;,...</strong>] format.</p>
     * <blockquote>
     * <p>This parameter takes effect only when you create a <strong>default template</strong> (<strong>TemplateType</strong> is set to <strong>user_default</strong>).</p>
     * </blockquote>
     */
    @NameInMap("UnbindResourceGroups")
    public java.util.List<String> unbindResourceGroups;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     */
    @NameInMap("UnbindResources")
    public java.util.List<String> unbindResources;

    public static CreateDefenseTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseTemplateRequest self = new CreateDefenseTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateDefenseTemplateRequest setDefenseScene(String defenseScene) {
        this.defenseScene = defenseScene;
        return this;
    }
    public String getDefenseScene() {
        return this.defenseScene;
    }

    public CreateDefenseTemplateRequest setDefenseSubScene(String defenseSubScene) {
        this.defenseSubScene = defenseSubScene;
        return this;
    }
    public String getDefenseSubScene() {
        return this.defenseSubScene;
    }

    public CreateDefenseTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDefenseTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDefenseTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDefenseTemplateRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateDefenseTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateDefenseTemplateRequest setTemplateOrigin(String templateOrigin) {
        this.templateOrigin = templateOrigin;
        return this;
    }
    public String getTemplateOrigin() {
        return this.templateOrigin;
    }

    public CreateDefenseTemplateRequest setTemplateStatus(Integer templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public Integer getTemplateStatus() {
        return this.templateStatus;
    }

    public CreateDefenseTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public CreateDefenseTemplateRequest setUnbindResourceGroups(java.util.List<String> unbindResourceGroups) {
        this.unbindResourceGroups = unbindResourceGroups;
        return this;
    }
    public java.util.List<String> getUnbindResourceGroups() {
        return this.unbindResourceGroups;
    }

    public CreateDefenseTemplateRequest setUnbindResources(java.util.List<String> unbindResources) {
        this.unbindResources = unbindResources;
        return this;
    }
    public java.util.List<String> getUnbindResources() {
        return this.unbindResources;
    }

}

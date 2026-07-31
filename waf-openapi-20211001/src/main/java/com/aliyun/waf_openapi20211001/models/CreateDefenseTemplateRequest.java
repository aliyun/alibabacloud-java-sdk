// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseTemplateRequest extends TeaModel {
    /**
     * <p>The protection scenario. For more information, see the <strong>DefenseScene</strong> parameter in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_group</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The sub-scenario of the protection template. This parameter is supported only for advanced bot management scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("DefenseSubScene")
    public String defenseSubScene;

    /**
     * <p>The description of the protection template to create.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
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
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The name of the protection template to create. The name must be 1 to 255 characters in length and can contain Chinese characters, letters, digits, underscores (_), periods (.), or hyphens (-).</p>
     * <blockquote>
     * <p>Template names must be unique within the same protection scenario (<strong>DefenseScene</strong>).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test221</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The source of the protection template to create. Set the value to <strong>custom</strong>, which indicates user-defined.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("TemplateOrigin")
    public String templateOrigin;

    /**
     * <p>The status of the protection template to create. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateStatus")
    public Integer templateStatus;

    /**
     * <p>The templatetype of the protection template to create. Valid values:</p>
     * <ul>
     * <li><strong>user_default</strong>: default protection.</li>
     * <li><strong>user_custom</strong>: custom protection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>The protected object groups to unbind when creating a default protection template. Use the format [<strong>&quot;group1&quot;,&quot;group2&quot;,……</strong>].</p>
     * <blockquote>
     * <p>This parameter takes effect only when you create a <strong>default template</strong> (the value of <strong>TemplateType</strong> is <strong>user_default</strong>).</p>
     * </blockquote>
     */
    @NameInMap("UnbindResourceGroups")
    public java.util.List<String> unbindResourceGroups;

    /**
     * <p>The protected objects to unbind when creating a default protection template. Use the format [<strong>&quot;XX1&quot;,&quot;XX2&quot;,……</strong>].</p>
     * <blockquote>
     * <p>This parameter takes effect only when you create a <strong>default template</strong> (the value of <strong>TemplateType</strong> is <strong>user_default</strong>).</p>
     * </blockquote>
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
